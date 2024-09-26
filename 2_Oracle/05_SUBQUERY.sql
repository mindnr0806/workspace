/*
    ��������(SUBQUERY)
    :�ϳ��� ������ ���� ���Ե� �� �ٸ� ������
    ���� ������ �ϴ� �������� ���� ���� ������ �ϴ� ������

*/

--"���ö" ����� ���� �μ��� ���� ��� ������ ��ȸ

--1)���ö ����� �μ��ڵ� ��ȸ
SELECT DEPT_CODE
FROM EMPLOYEE
WHERE EMP_NAME = '���ö';

--2)�μ��ڵ尡 'D9'�� ��� ��ȸ
SELECT *
FROM EMPLOYEE
WHERE DEPT_CODE = 'D9';

--���� 2���� �������� �ϳ��� ���ĺ��ٸ�
SELECT *
FROM EMPLOYEE
WHERE DEPT_CODE = (SELECT DEPT_CODE
                   FROM EMPLOYEE
                    WHERE EMP_NAME = '���ö');
                    
--��ü ����� ��ձ޿����� �� ���� �޿��� ��� ����� ������ ��ȸ
--1)��ü ����� ��ձ޿� ��ȸ (�ݿø� ó��)
SELECT ROUND(AVG(SALARY))
FROM EMPLOYEE;

--2)��ձ޿�(3047663)���� �� ���� �޿��� �޴� ��� ���� ��ȸ
SELECT EMP_NAME, SALARY, JOB_CODE
FROM EMPLOYEE
WHERE SALARY >= 3047663;

--���������� �����غ���
SELECT EMP_NAME, SALARY, JOB_CODE
FROM EMPLOYEE
WHERE SALARY >= (SELECT ROUND(AVG(SALARY))
                    FROM EMPLOYEE);
-------------------------------------------------------------
/*
    *���������� ����*
    ���������� ������ ������� ���� ��� ������������ �з�
    -������ �������� : ���������� ���� ����� ������ 1���� �� (1�� 1��)
    -������ �������� : ���������� ���� ����� �������� ��(N�� 1��)
    -���߿� �������� : ���������� ���� ����� �� ���̰� �������� �÷��� �� (1�� N��)
    -������ ���߿� �������� : ���������� ���� ����� ������ ���� �÷��� �� (N�� N��)
    >>������ ���� �������� �տ� �ٴ� �����ڰ� �޶���


--������ ���� : �������� ����� ������ 1���� ��
*/
--������ �������� : �������� ����� ������ 1���� ��:
/*
    �Ϲ����� �񱳿����� ��밡�� : = != > < >= ..
*/
--�� ������ ��� �޿����� �� ���� �޿��� �޴� ������� �����, �����ڵ�, �޿� ��ȸ
SELECT EMP_NAME,JOB_CODE,SALARY
FROM EMPLOYEE
WHERE SALARY < (SELECT AVG(SALARY) FROM EMPLOYEE );

--�����޿��� �޴� ����� �����, �޿�, �Ի��� ��ȸ
--�����޿� ��ȭ
SELECT MIN(SALARY)
FROM EMPLOYEE;

SELECT EMP_NAME, SALARY, HIRE_DATE
FROM EMPLOYEE
WHERE SALARY < ( SELECT MIN(SALARY)
                    FROM EMPLOYEE );
                    
--���ö ����� �޿����� ���� �޴� ����� �����,�μ��ڵ�,�޿� ��ȸ
--SALARY > ���ö ����� �޿�
--*���ö ����� �޿�
SELECT SALARY
FROM EMPLOYEE
WHERE EMP_NAME = '���ö';

SELECT EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE SALARY > (SELECT SALARY
                FROM EMPLOYEE
                WHERE EMP_NAME = '���ö');

--���� ������� �μ��ڵ带 �νø����� �����Ͽ� ��ȸ
SELECT EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE, DEPARTMENT
WHERE DEPT_CODE = DEPT_ID
    AND SALARY > (SELECT SALARY
                FROM EMPLOYEE
                WHERE EMP_NAME = '���ö');
--*ANSI ����*
SELECT EMP_NAME, DEPT_TITLE, SALARY
FROM EMPLOYEE
    JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID
 WHERE SALARY > (SELECT SALARY
                FROM EMPLOYEE
                WHERE EMP_NAME = '���ö');
                
--�μ��� �޿����� ���� ū �μ��� �μ��ڵ�, �޿����� ��ȸ
--1)�μ��� �޿��� �� ���� ū �� �ϳ��� ��ȸ --17700000
SELECT MAX(SUM(SALARY))
FROM EMPLOYEE 
GROUP BY DEPT_CODE;
                
--2)�μ��� ��\�޿����� 17700000�� �μ��� �μ��ڵ�, �޿��� ��ȸ

SELECT DEPT_CODE, SUM(SALARY)
FROM EMPLOYEE 
GROUP BY DEPT_CODE
HAVING SUM(SALARY) = 17700000;

-- �� �������� ���غ���
SELECT DEPT_CODE, SUM(SALARY)
FROM EMPLOYEE
GROUP BY DEPT_CODE
HAVING SUM(SALARY) = (SELECT MAX(SUM(SALARY))
                        FROM EMPLOYEE 
                        GROUP BY DEPT_CODE);
                        
--������ ����� ���� �μ��� ������� ���, �����, ����ó, �Ի���, �μ����� ��ȸ
--(��, ������ ����� �����ϰ� ��ȸ)
--����Ŭ ����
SELECT EMP_ID, EMP_NAME, PHONE,HIRE_DATE,DEPT_TITLE
FROM EMPLOYEE, DEPARTMENT
WHERE DEPT_CODE = DEPT_ID
    AND DEPT_CODE = ( SELECT DEPT_CODE
                        FROM EMPLOYEE
                        WHERE EMP_NAME = '������')                    
AND EMP_NAME <> '������';
--ANSI ����
SELECT EMP_ID, EMP_NAME, PHONE,HIRE_DATE,DEPT_TITLE
FROM EMPLOYEE
JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID
WHERE DEPT_CODE = (SELECT DEPT_CODE
                        FROM EMPLOYEE
                        WHERE EMP_NAME = '������')
  AND EMP_NAME != '������';         
-------------------------------------------------------------
/*
    ������ �������� :�������� ���� ����� �������� ��� (N�� 1��)
    
    IN (��������) : ���� ���� ����� �߿��� �ϳ��� ��ġ�ϴ� ���� �ִٸ� ��ȸ   
    >ANY (��������) : ���� ���� ����� �߿��� �ϳ��� ū ��찡 �մٸ� ��ȸ
    <ANY (��������) : ���� ���� ����� �߿��� �ϳ��� ���� ��찡 �ִٸ� ��ȸ
        * �񱳴�� > ��1 OR �񱳴�� > ��2 OR �񱳴�� > �����3...
    
    >ALL(��������) : ���� ���� ��� ��������� Ŭ ��� ��ȸ
    <ALL(��������) : ���� ���� ��� �������Ÿ ���� ��� ��ȸ
        *�񱳴��  > �����1 AND �񱳴�� > �����2 AND �񱳴�� > �����3
*/
-- ����� ��� �Ǵ� ������ ����� ���� ������ ������� ���� ��ȸ (���/�����/�����ڵ�/�޿�)
--*����� ��� �Ǵ� ������ ����� �����ڵ� ��ȸ
SELECT JOB_CODE
FROM EMPLOYEE
WHERE EMP_NAME IN ('�����', '������');

--*�����ڵ尡 'J3' �Ǵ� 'J7'�� ������� ������ ��ȸ
SELECT EMP_ID, EMP_NAME,JOB_CODE, SALARY
FROM EMPLOYEE
WHERE JOB_CODE IN ('J3', 'J7');

--���������� �����غ���
SELECT EMP_ID, EMP_NAME,JOB_CODE, SALARY
FROM EMPLOYEE
WHERE JOB_CODE IN(SELECT JOB_CODE
                    FROM EMPLOYEE
                    WHERE EMP_NAME IN ('�����', '������'));
                    
--�븮 ������ ����� �� ���� ������ ����� �ּ� �޿����� ���� �޴� ��� ���� ��ȸ(���, �̸�, ���޸�, �޿�)
--*���� ������ �޿�
SELECT SALARY
FROM EMPLOYEE
JOIN JOB USING(JOB_CODE)
WHERE JOB_NAME = '����';


--*>ANY �����ڸ� ����Ͽ� ��
SELECT EMP_ID, EMP_NAME,JOB_NAME, SALARY
FROM EMPLOYEE E, JOB J
C E.JOB_CODE =J.JOB_CODE
   AND SALARY > ANY(3760000,2200000,2500000)
    AND JOB_NAME = '�븮';
-----------------------------------------------------------
/*
    ���߿� �������� : �������� ���� ����� ���� �ϳ��̰�, �÷�(��) ���� ���� ���� ���
*/
--���̤��� ����� ���� �μ��ڵ�, ���� �����ڵ忡 �ش��ϴ� ��� ������ ��ȸ
--1) ������ ����� �μ��ڵ�, �����ڵ� ��ȸ

SELECT DEPT_CODE, JOB_CODE
FROM EMPLOYEE
WHERE EMP_NAME = '������';

SELECT JOB_CODE
FROM EMPLOYEE
WHERE EMP_NAME = '������';

------------------------------
SELECT EMP_NAME, DEPT_CODE, JOB_CODE, SALARY
FROM EMPLOYEE
WHERE DEPT_CODE = (SELECT DEPT_CODE
                    FROM EMPLOYEE
                    WHERE EMP_NAME = '������')
    AND JOB_CODE = (SELECT JOB_CODE
                        FROM EMPLOYEE
                    WHERE EMP_NAME = '������');

--������ ���������� ����� ���
SELECT EMP_NAME, DEPT_CODE, JOB_CODE, SALARY
FROM EMPLOYEE
WHERE (DEPT_CODE, JOB_CODE) = (SELECT DEPT_CODE, JOB_CODE
                                FROM EMPLOYEE
                                WHERE EMP_NAME = '������');
                                
--�ڳ��� ����� ���� �����ڵ�, ���� ����� �������ִ� ��� ���� ��ȸ(�����, �����ڵ�, �����ȣ)
SELECT JOB_CODE, MANAGER_ID
FROM EMPLOYEE
WHERE EMP_NAME = '�ڳ���';

-2)���� �����ڵ� ���� ����� ������ �ִ� ��� ������ ��ȸ
SELECT EMP_NAME, JOB_CODE, MANAGER_ID
FROM EMPLOYEE
WHERE (JOB_CODE, MANAGER_ID) = (SELECT JOB_CODE, MANAGER_ID
                                FROM EMPLOYEE
                                WHERE EMP_NAME = '�ڳ���')
                AND EMP_NAME != '�ڳ���'; --�ڳ��� ����� �����ϰ��� �Ѵٸ�...
-------------------------------------------------------------------------------
/*
    ������ ���߿� �������� : ���������� ����� ������, ������ ���� ��� 
*/
-- �� ���޺��� �ּұ޿��� �޴� ��� ������ ��ȸ
--1)�� ���޺� �ּұ޿�
SELECT JOB_CODE, MIN(SALARY)
FROM EMPLOYEE
GROUP BY JOB_CODE;

2)�� ���޺� �ּұ޿��� �޴� ��� ��ȸ
SELECT EMP_ID, EMP_NAME, JOB_CODE, SALARY
FROM EMPLOYEE
WHERE JOB_CODE = 'J1' AND SALARY = 800000
OR JOB_CODE = 'J2' AND SALARY = 3700000
OR JOB_CODE = 'J3' AND SALARY = 3400000;

--�������� ����
SELECT EMP_ID, EMP_NAME, JOB_CODE, SALARY
FROM EMPLOYEE
WHERE (JOB_CODE, SALARY) IN (SELECT JOB_CODE, MIN(SALARY)
                                FROM EMPLOYEE
                                GROUP BY JOB_CODE);
                                
-- �� �μ����� �ְ�޿��� �޴� ��� ���� ��ȸ
SELECT DEPT_CODE, MAX(SALARY)
FROM EMPLOYEE
GROUP BY DEPT_CODE;

SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE (DEPT_CODE, SALARY) IN (SELECT DEPT_CODE, MAX(SALARY)
                              FROM EMPLOYEE
                              GROUP BY DEPT_CODE);
---------------------------------------------------------
/*
    �ζ��� �� : ���������� FROM���� ����ϴ� ��
            => ���������� ���� ����� ��ġ ���̺�ó�� ����ϴ� ��
*/
--������� ���, �̸�, ���ʽ� ���� ����, �ν��ڵ带 ��ȸ
--*���ʽ� ���� ������ NULL�� �ƴϾ�� �ϰ�, ���ʽ� ���� ������3000���� �̻��� ����鸸 ��ȸ
-- => NVL : NULL�� ��� �ٸ� ������ ����
SELECT EMP_ID ���, EMP_NAME �̸�, (SALARY + (SALARY * NVL(BONUS, 0)))*12 "���ʽ� ���� ����", DEPT_CODE
FROM EMPLOYEE
WHERE (SALARY + (SALARY * NVL(BONUS, 0)))*12 >= 30000000
ORDER BY 3 DESC;

SELECT ROWNUM, ��� �̸�, "���ʽ� ���� ����", �μ��ڵ�
FROM (SELECT EMP_ID ���, EMP_NAME �̸�, (SALARY + (SALARY * NVL(BONUS, 0)))*12 "���ʽ� ���� ����", DEPT_CODE
                FROM EMPLOYEE
                WHERE (SALARY + (SALARY * NVL(BONUS, 0)))*12 >= 30000000
                ORDER BY 3 DESC;)
WHERE ROWNUM <= 5;               
                
--���� �ֱٿ� �Ի��� ������ 5���� ��ȸ
--�Ի��� ���� �������� ����(���, �̸�, �Ի���)
SELECT EMP_ID, EMP_NAME,HIRE_DATE
FROM EMPLOYEE
ORDER BY HIRE_DATE DESC;

SELECT ROWNUM, ���, �̸�, �Ի���
FROM -+( SELECT EMP_ID ���, EMP_NAME �̸�,HIRE_DATE �Ի���
       FROM EMPLOYEE
       ORDER BY HIRE_DATE DESC )
WHERE ROWNUM <= 5;       

-----------------------------------------------------------
/*
        -RANK()OVER(���ı���) : ������ ���� ������ ����� ������ �� ��ŭ �ǳʶٰ� ���� ���
        -DANSE() OVER(WJDFUFRLWNS) : ������ ������ �ִ��� �� ���� ����� +1�ؼ� ���� ���
        
        SELECT�������� ��� ����
*/
--�޿��� ���� ������� ������ �Űܼ� ��ȸ
SELECT EMP_NAME, SALARY, RANK() OVER(ORDER BY SALARY DESC)"����"
FROM EMPLOYEE;
-->���� 19���� 2���� �ְ�, �� ���� ������ 21���� ǥ�õ�
SELECT EMP_NAME, SALARY,DESC() OVER(ORDER BY SALARY DESC)"����"
FROM EMPLOYEE;

-->���� 19�� 2�� ���Ŀ� �� ���� ������ 20���� ǥ�õ�(+1)

-->���� 5�� ��ȸ
SELECT EMP_NAME, SALARY, DENSE_RANK() OVER(ORDER BY SALARY DESC)"����"
FROM EMPLOYEE;

SELECT *
FROM (SELECT EMP_NAME, SALARY, DENSE_RANK() OVER(ORDER BY SALARY DESC)"����"
 FROM EMPLOYEE)
 WHERE ���� <=5;
 
 --���� 3�� ~ 5�� ��ȸ
SELECT *
FROM (SELECT EMP_NAME, SALARY, DENSE_RANK() OVER(ORDER BY SALARY DESC)"����"
 FROM EMPLOYEE)
 WHERE ���� >= 3 AND ���� <=5;
----------------------------------------------------------------
--1)ROWNUM�� Ȱ���Ͽ� �޿��� ���� ���� 5���� ��ȸ�Ϸ� ������, ����� ��ȸ�� ���� �ʾҴ�
SELECT ROWNUM, EMP_NAME, SALARY
FROM EMPLOYEE
WHERE ROWNUM <=5
ORDER BY SALARY DESC;

--������(����)
--������ �Ǳ����� 5���� �߷�����

--�ذ���
SELECT ROWNUM, EMP_NAME, SALARY
FROM(SELECT EMP_NAME, SALARY
        FROM EMPLOYEE
        ORDER BY SALARY DESC)
WHERE ROWNUM <=5;        

2)�μ��� ��ձ޿��� 270������ �ʰ��ϴ� �μ��� �ش��ϴ� �μ��ڵ�, �μ��� �� �޿���, �λ纰 ��ձ޿�. �μ��� ������� ��ȸ
SELECT DENSE_CODE, SUM(SALARY)"����", FLOOR(AVG(SALARY)) AS "���", COUNT(*)"�ο���"
FROM EMPLOYEE
WHERE SALARY > 2700000
GROUP BY DENSE_CODE
ORDER BY DENSE_CODE ASC;

-- ������ (����)
--�μ��� ��ձ޿��� Ȯ���ؾ��ϴµ�, ��� �������� �޿��� Ȯ���ߴ�

-- �ذ���
SELECT DENSE_CODE, SUM(SALARY)"����", FLOOR(AVG(SALARY)) AS "���", COUNT(*)"�ο���"
FROM EMPLOYEE
WHERE SALARY > 2700000
ORDER BY DENSE_CODE ASC






