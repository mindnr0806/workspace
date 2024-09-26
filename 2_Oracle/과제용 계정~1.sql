--1. �� ������б��� �а� �̸��� �迭�� ǥ���Ͻÿ�. ��, ��� ����� "�а� ��", "�迭" 
--���� ǥ���ϵ��� ����. 
SELECT DEPARTMENT_NAME, CATEGORY
FROM TB_DEPARTMENT;

--2. �а��� �а� ������ ������ ���� ���·� ȭ�鿡 �������.
SELECT DEPARTMENT_NAME || '�� ������' || CAPACITY || '�� �Դϴ�.' "�а��� ����"
FROM TB_DEPARTMENT;

-- 3. "������а�" �� �ٴϴ� ���л� �� ���� �������� ���л��� ã�ƴ޶��
--��û�� ���Դ�. �����ΰ�? (�����а��� '�а��ڵ�'�� �а� ���̺�(TB_DEPARTMENT)�� ��ȸ�ؼ� 
--ã�� ������ ����)
SELECT S.STUDENT_NAME 
FROM TB_DEPARTMENT D 
JOIN TB_STUDENT S ON (D.DEPARTMENT_NO = S.DEPARTMENT_NO)
WHERE D.DEPARTMENT_NO = '001'
AND SUBSTR(S.STUDENT_SSN,8,1) ='2'
AND S.ABSENCE_YN ='Y';

--4. ���������� ���� ���� ��� ��ü�� ���� ã�� �̸��� �Խ��ϰ��� ����. �� ����ڵ��� 
--�й��� ������ ���� �� ����ڵ��� ã�� ������ SQL ������ �ۼ��Ͻÿ�.

SELECT STUDENT_NAME  
FROM TB_STUDENT 
WHERE STUDENT_NO IN('A513079', 'A513090', 'A513091', 'A513110', 'A513119')
ORDER BY 1 DESC;

--5. ���������� 20�� �̻� 30�� ������ �а����� �а� �̸��� �迭�� ����Ͻÿ�. 
SELECT DEPARTMENT_NAME, CATEGORY
FROM TB_DEPARTMENT
WHERE CAPACITY >=20 AND CAPACITY <=30;

--6. �� ������б��� ������ �����ϰ� ��� �������� �Ҽ� �а��� ������ �ִ�.  �׷� �� 
--������б� ������ �̸��� �˾Ƴ� �� �ִ� SQL ������ �ۼ��Ͻÿ�.
SELECT PROFESSOR_NAME 
FROM TB_PROFESSOR 
WHERE DEPARTMENT_NO IS NULL;

--7. Ȥ�� ������� ������ �а��� �����Ǿ� ���� ���� �л��� �ִ��� Ȯ���ϰ��� ����. 
--��� SQL ������ ����ϸ� �� ������ �ۼ��Ͻÿ�.
SELECT * 
FROM TB_STUDENT 
WHERE DEPARTMENT_NO IS NULL;

-- 8. ������û�� �Ϸ��� ����. �������� ���θ� Ȯ���ؾ� �ϴµ�, ���������� �����ϴ� 
--������� � �������� �����ȣ�� ��ȸ�غ��ÿ�.
SELECT CLASS_NO 
FROM TB_CLASS 
WHERE PREATTENDING_CLASS_NO IS NOT NULL;

--9. �� ���п��� � �迭(CATEGORY)���� �ִ��� ��ȸ�غ��ÿ�. 
SELECT DISTINCT CATEGORY 
FROM TB_DEPARTMENT
ORDER BY 1 ASC;

--10. 02 �й� ���� �����ڵ��� ������ ������� �Ѵ�. ������ ������� ������ �������� 
--�л����� �й�, �̸�, �ֹι�ȣ�� ����ϴ� ������ �ۼ��Ͻÿ�.
SELECT STUDENT_NO, STUDENT_NAME, STUDENT_SSN
FROM TB_STUDENT
WHERE SUBSTR(ENTRANCE_DATE, 1,2) = '02' 
AND SUBSTR(STUDENT_ADDRESS, 1,2) ='����'
AND ABSENCE_YN = 'N';






