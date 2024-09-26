-- 1. EMPLOYEE���̺��� ��� ��� ������ �ֹι�ȣ�� �̿��Ͽ� ����, ����, ���� ��ȸ
    --����Ÿ������ : SUBSTR(���ڿ�, ������ġ, ����) : ���ڿ����� ������ġ���� ���̸�ŭ �����Ͽ� ��ȯ
SELECT EMP_NAME "�����",SUBSTR(EMP_NO, 1,2)"����"
                    ,SUBSTR(EMP_NO, 3,2)"����"
                    ,SUBSTR(EMP_NO, 5,2)"����"
FROM EMPLOYEE;
-- 2. EMPLOYEE���̺��� �����, �ֹι�ȣ ��ȸ (��, �ֹι�ȣ�� ������ϸ� ���̰� �ϰ�, '-'���� ���� '*'�� �ٲٱ�)
SELECT EMP_NAME "�����"
,RPAD(SUBSTR(EMP_NO, 1, 7), LENGTH(EMP_NO), '*')"�ֹι�ȣ"
,SUBSTR(EMP_NO, 1,7)|| '******' "�ֹι�ȣ"
FROM EMPLOYEE;
-- 3. EMPLOYEE���̺��� �����, �Ի���-����, ����-�Ի��� ��ȸ
--     (��, �� ��Ī�� �ٹ��ϼ�1, �ٹ��ϼ�2�� �ǵ��� �ϰ� ��� ����(����), ����� �ǵ��� ó��)

SELECT EMP_NAME �����, FLOOR(ABS(HIRE_DATE - SYSDATE ))+1 "�ٹ��ϼ�1"
                    , TRUNC(ABS(SYSDATE - HIRE_DATE ))+1 "�����ϼ�2"
FROM EMPLOYEE;

-- 4. EMPLOYEE���̺��� ����� Ȧ���� �������� ���� ��� ��ȸ
SELECT *
FROM EMPLOYEE
WHERE MOD(EMP_ID, 2) = 1;  
-- 5. EMPLOYEE���̺��� �ٹ� ����� 20�� �̻��� ���� ���� ��ȸ
SELECT *
FROM EMPLOYEE
WHERE LAST_DAY(HIRE_DATE)-HIRE_DATE+1 >= 20;
--WHERE MONTHS_BETWEEN(SYSDATE, HIRE_DATE) >= 240;
--WHERE TRUNC(SYSDATE - HIRE_DATE +1)
-- 6. EMPLOYEE ���̺��� �����, �޿� ��ȸ (��, �޿��� '\9,000,000' �������� ǥ��)
SELECT EMP_NAME, TO_CHAR(SALARY, 'L99,999,999')"�޿�"
FROM EMPLOYEE;

-- 7. EMPLOYEE���̺��� ���� ��, �μ��ڵ�, �������, ����(��) ��ȸ
--     (��, ��������� �ֹι�ȣ���� �����ؼ� 00�� 00�� 00�Ϸ� ��µǰ� �ϸ� 
--     ���̴� �ֹι�ȣ���� ����ؼ� ��¥�����ͷ� ��ȯ�� ���� ���)
SELECT EMP_NAME, DEPT_CODE, SUBSTR(EMP_NO, 1,2)||'��' || SUBSTR(EMP_NO, 3,2)||'��' ||SUBSTR(EMP_NO, 5,2)||'��' "�������"
FROM EMPLOYEE;
-- 8. EMPLOYEE���̺��� �μ��ڵ尡 D5, D6, D9�� ����� ��ȸ�ϵ� D5�� �ѹ���, D6�� ��ȹ��, D9�� �����η� ó��
--     (��, �μ��ڵ� ������������ ����)
    SELECT EMP_ID, EMP_NAME, DEPT_CODE,
    CASE
        WHEN DEPT_CODE ='D5' THEN '�ѹ���'
        WHEN DEPT_CODE ='D6' THEN '��ȹ��'
        WHEN DEPT_CODE ='D9' THEN '������'
   END "�μ���"
 FROM EMPLOYEE
 WHERE DEPT_CODE IN ('D5', 'D6', 'D9')
 ORDER BY 3;
 /*
    DECODE(DEPT_CODE, 'D5', '�ѹ���', 'D', '��ȹ��', 'D9', '������')�μ���
 */
   
    

-- 9. EMPLOYEE���̺��� ����� 201���� �����, �ֹι�ȣ ���ڸ�, �ֹι�ȣ ���ڸ�, 
--     �ֹι�ȣ ���ڸ��� ���ڸ��� �� ��ȸ
SELECT EMP_NAME, SUBSTR(EMP_NO, 1,6), SUBSTR(EMP_NO, 8)
    ,SUBSTR(EMP_NO, 1,6) + SUBSTR(EMP_NO, 8)
FROM EMPLOYEE
WHERE EMP_ID =201;
-- 10. EMPLOYEE���̺��� �μ��ڵ尡 D5�� ������ ���ʽ� ���� ���� �� ��ȸ
SELECT SUM((SALARY + (SALARY*NVL(BONUS,0)))*12)
FROM EMPLOYEE
WHERE DEPT_CODE = '5';

-- 11. �������� �Ի��Ϸκ��� �⵵�� ������ �� �⵵�� �Ի� �ο��� ��ȸ
-- ��ü ���� ��, 1999��, 2000��, 2001��, 2004��
SELECT COUNT(*)
 ,COUNT(CASE 
  WHEN SUBSTR(HIRE_DATE, 1,2)  = 99 THEN 1
    END)
    ,COUNT(DECODE(EXTRACT(YEAR FROM HIRE_DATE), 2000,1))
    ,COUNT(DECODE(EXTRACT(YEAR FROM HIRE_DATE), 2001,1))
     ,COUNT(DECODE(EXTRACT(YEAR FROM HIRE_DATE), 2004,1))  
  FROM EMPLOYEE;   