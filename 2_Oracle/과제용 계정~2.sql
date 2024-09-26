--1. ������а�(�а��ڵ� 002) �л����� �й��� �̸�, ���� �⵵�� ���� �⵵�� ���� 
--������ ǥ���ϴ� SQL ������ �ۼ��Ͻÿ�.( ��, ����� "�й�", "�̸�", "���г⵵" �� 
--ǥ�õǵ��� ����.) 
SELECT STUDENT_NO �й�, STUDENT_NAME �̸�, TO_CHAR(ENTRANCE_DATE, 'YYYY-MM-DD') ���г⵵
FROM TB_STUDENT
WHERE DEPARTMENT_NO = 002
ORDER BY 3 ASC;

--2. �� ������б��� ���� �� �̸��� �� ���ڰ� �ƴ� ������ �� �� �ִٰ� ����. �� ������ 
--�̸��� �ֹι�ȣ�� ȭ�鿡 ����ϴ� SQL ������ �ۼ��� ����. (* �̶� �ùٸ��� �ۼ��� SQL 
--������ ��� ���� ����� �ٸ��� ���� �� �ִ�. ������ �������� �����غ� ��)
SELECT PROFESSOR_NAME, PROFESSOR_SSN
FROM TB_PROFESSOR
WHERE LENGTH(PROFESSOR_NAME) !=3;

--3. �� ������б��� ���� �������� �̸��� ���̸� ����ϴ� SQL ������ �ۼ��Ͻÿ�. �� 
--�̶� ���̰� ���� ������� ���� ��� ������ ȭ�鿡 ��µǵ��� ����ÿ�. (��, ���� �� 
--2000 �� ���� ����ڴ� ������ ��� ����� "�����̸�", "����"�� ����. ���̴� ���������� 
--�������.)
SELECT PROFESSOR_NAME �����̸�, FLOOR(MONTHS_BETWEEN(SYSDATE, TO_DATE('19'||
SUBSTR(PROFESSOR_SSN, 1, 6), 'YYYYMMDD')) / 12)����
FROM TB_PROFESSOR
WHERE SUBSTR(PROFESSOR_SSN, 8,1)='1'
ORDER BY 2 ASC;

--4. �������� �̸� �� ���� ������ �̸��� ����ϴ� SQL ������ �ۼ��Ͻÿ�. ��� ����� 
--?�̸�? �� �������� ����. (���� 2���� ���� ������ ���ٰ� �����Ͻÿ�)
SELECT SUBSTR(PROFESSOR_NAME, 2)�̸�
FROM TB_PROFESSOR;

--5. �� ������б��� ����� �����ڸ� ���Ϸ��� ����. ��� ã�Ƴ� ���ΰ�?  �̶�, 
--19�쿡 �����ϸ� ����� ���� ���� ������ �A������. 
SELECT STUDENT_NO, STUDENT_NAME
FROM TB_STUDENT
WHERE EXTRACT(YEAR FROM ENTRANCE_DATE)
-LPAD(SUBSTR(STUDENT_SSN, 1,2),4,'19')>=20; 

--6. 2020�� ũ���������� ���� �����ΰ�?
SELECT TO_CHAR(TO_DATE(20201225), 'DAY')
FROM DUAL;