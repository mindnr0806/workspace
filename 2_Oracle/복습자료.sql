-- ��� ���� �� �����ȣ, �̸�, ������ ��ȸ
	SELECT EMP_ID "�����ȣ", EMP_NAME �̸�, SALARY ����
	FROM EMPLOYEE;
-- �μ��ڵ尡 'D9'�� ����� �̸�, �μ��ڵ� ��ȸ
	SELECT EMP_NAME ����̸�, DEPT_CODE �μ��ڵ�
	FROM EMPLOYEE
	WHERE DEPT_CODE = 'D9';
-- ������� : FROM > WHERE > SELECT

-- ����ó�� 4��°�ڸ��� 7�� ������ �̸�, ����ó ��ȸ
	SELECT EMP_NAME �������̸�, PHONE ����ó
	FROM EMPLOYEE
	WHERE PHONE LIKE '___7%';
    --LIKE ���� ���ϵ�ī�� : _(1���ڸ� �ǹ�), %(0���� �̻��� �ǹ�)

-- �����ڵ尡 'J7'�� ���� �� �޿��� 200���� �̻��� ������ �̸�, �޿�, �����ڵ� ��ȸ
	SELECT EMP_NAME �����̸�,  SALARY �޿�, JOB_CODE �����ڵ�
	FROM EMPLOYEE
	WHERE JOB_CODE = 'J7' AND SALARY>= 2000000;
	

-- ��ü ��� ������ �ֱ� �Ի��� �������� �����Ͽ� ��ȸ
	SELECT *
	FROM EMPLOYEE
	ORDER BY HIRE_DATE DESC; 
    --�⺻�� ASC NILLS