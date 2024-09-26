-- ����� ������ �������ּ���. (����ڸ�: C##KH / ��й�ȣ: KH)
--  �ش� ������ ���� ��� �߰� �� kh.sql ��ũ��Ʈ �����Ͽ� �Ʒ� ������ �������ּ���.

-- ��� ���̺��� ��� ���� ��ȸ
SELECT * FROM EMPLOYEE;

-- ���ʽ��� �ִ� ����� �����, �޿�, ���ʽ�, �����ڵ� ��ȸ
SELECT EMP_NAME, SALARY, BONUS, JOB_CODE
FROM EMPLOYEE
WHERE BONUS IS NOT NULL; --���ʽ��� NULL�� �ƴ� ������ 


-- �̸����� 3��° ���ڰ� m�� ����� ��� ���� ��ȸ
SELECT *
FROM EMPLOYEE
WHERE EMAIL LIKE '__m%';
--���ϵ�Ÿ�� ��ȣ�� �����ν� ����ϰ��� �Ѵٸ� like '__\_' ESCAPE '\' �� ���� �ۼ��ط���

-- ���� ��� �� ��ȸ
SELECT COUNT(*)
FROM EMPLOYEE
WHERE SUBSTR(EMP_NO, 8,1) IN ('2','4');

-- ������� ���� ����� �޿� �� ��ȸ
SELECT TO_CHAR(SUM(SALARY), 'L99,999,999') "����� �޿� ��"
FROM EMPLOYEE
WHERE ENT_YN = 'N';

-- 9���� �Ի��� ��� �� ��ȸ
SELECT COUNT(*)
FROM EMPLOYEE
WHERE EXTRACT(MONTH FROM HIRE_DATE) = 9;

----------------------------------------------------------
/*
	* �˻��ϰ��� �ϴ� ���� :
	
		�����ڵ尡 J7�̰ų� J6�̸鼭 SALARY ���� 200���� �̻��̰�
		BONUS�� �ְ� �����̸� �̸����ּҴ� _�տ� 3���ڸ� �ִ� �����
		�����, �ֹε�Ϲ�ȣ, �����ڵ�, �μ��ڵ�, �޿�, ���ʽ��� ��ȸ�ϰ��� �Ѵ�.
		
		(���������� ��ȸ�� �ȴٸ� 2���� ����� Ȯ���� �� ����)
*/

-- �Ʒ� ���������� ���� �� ���ϴ� ����� ������ �ʴ´�. 
--  � ������ �ִ� �� ������ �ľ��Ͽ� �ۼ��� ��, �ذ����ּ���.
SELECT EMP_NAME, EMP_NO, JOB_CODE, DEPT_CODE, SALARY, BONUS
FROM EMPLOYEE
WHERE JOB_CODE = 'J7' OR JOB_CODE = 'J6' AND SALARY > 2000000
      AND EMAIL LIKE '____%' AND BONUS IS NULL;
-- ���� : 

1) �����ڵ忡 ���� ������ �켱������ ���� ���� �����������
=>��ȣ�� �����ְų� IN �������� ��ä�Ῡ��

2)�ۼ��� ������ SALAR���� 200���� �ʰ� >�� �ۼ��Ǿ�����

3)�̸����� 4��°�ڸ��� �����(_)�� ���ϵ尡Ʈ�� �����

4)���ʽ��� �ִ� ����� ��ȸ�ؾ��ϴµ� ���� ����� ��ȸ�ϰ��� ��

5)���� ��� ������ ����
SELECT EMP_NAME, EMP_NO, JOB_CODE, DEPT_CODE, SALARY, BONUS
FROM EMPLOYEE
WHERE (JOB_CODE = 'J7' OR JOB_CODE = 'J6')  --JOB_CODE IN('J7','J6')
        AND SALARY >= 2000000
      AND EMAIL LIKE '___#_%' ESCAPE '#'
      AND BONUS IS NOT NULL
      AND SUBSTR(EMP_NO, 8,1) IN ('2','4');