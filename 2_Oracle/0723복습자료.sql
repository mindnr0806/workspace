-- �̸����� ���̵� �κп�(@ �պκ�) k�� ���Ե� ��� ���� ��ȸ
SELECT *
FROM EMPLOYEE
WHERE EMAIL LIKE '%K%@%';

-- �μ��� ����� ���� ��� �� ��ȸ
SELECT DEPT_CODE, COUNT(*)
FROM EMPLOYEE
WHERE MANAGER_ID IS NULL
GROUP BY DEPT_CODE;
-- ����ó ���ڸ��� 010, 011�� �����ϴ� ��� �� ��ȸ
SELECT COUNT(*)
FROM EMPLOYEE
WHERE SUBSTR(PHONE, 1,3) IN ('010', '011')
GROUP BY SUBSTR(PHONE, 1,3);
-- �μ��� ����� ���� ��� ���� ��ȸ (�μ���, ���, ����� ��ȸ)
--������� : EMPLOYEE, �μ�����:DEPARTMENT --> ����� �÷� : �μ��ڵ� (DEPT_CODE, DEPT_ID)
-- ** ����Ŭ ���� **
--FROM���� ������ ���̺� ����, WHERE���� ���� �� ������ �ϴ� �÷��� ���� �ۼ� 
SELECT DEPT_TITLE,EMP_ID,EMP_NAME 
FROM EMPLOYEE,DEPARTMENT
WHERE DEPT_CODE = DEPT_ID(+)      --������ �� ������ �Ǵ� �÷��� ����
AND MANAGER_ID IS NULL;         --����� ���� ����� ���� ����
-- ** ANSI ���� **
SELECT DEPT_TITLE,EMP_ID,EMP_NAME 
FROM EMPLOYEE
    JOIN DEPARTMENT ON DEPT_CODE=DEPT_ID
WHERE MANAGER_ID IS NULL;
-- �μ��� ����� ���� ��� �� ��ȸ (�μ���, ����� ��ȸ)
-- ** ����Ŭ ���� **
SELECT DEPT_TITLE,COUNT(*) 
FROM EMPLOYEE,DEPARTMENT
WHERE DEPT_CODE = DEPT_ID
AND MANAGER_ID IS NULL
GROUP BY DEPT_TITLE;
-- ** ANSI ���� **
SELECT DEPT_TITLE,COUNT(*)
FROM EMPLOYEE
JOIN DEPARTMENT ON DEPT_CODE=DEPT_ID
WHERE MANAGER_ID IS NULL
GROUP BY DEPT_TITLE;
