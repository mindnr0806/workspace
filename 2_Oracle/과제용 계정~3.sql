--1. �л��̸��� �ּ����� ǥ���Ͻÿ�. ��, ��� ����� "�л� �̸�", "�ּ���"�� �ϰ�, 
--������ �̸����� �������� ǥ���ϵ��� ����.
SELECT STUDENT_NAME "�л� �̸�", STUDENT_ADDRESS �ּ���
FROM TB_STUDENT
ORDER BY 1 ASC;

--2.  �������� �л����� �̸��� �ֹι�ȣ�� ���̰� ���� ������ ȭ�鿡 ����Ͻÿ�.
SELECT STUDENT_NAME, STUDENT_SSN
FROM TB_STUDENT 
WHERE ABSENCE_YN = 'Y'
ORDER BY STUDENT_SSN DESC;

--3. �ּ����� �������� ��⵵�� �л��� �� 1900��� �й��� ���� �л����� �̸��� �й�, 
--�ּҸ� �̸��� ������������ ȭ�鿡 ����Ͻÿ�. ��, ���������� "�л��̸�","�й�", 
--"������ �ּ�" �� ��µǵ��� ����.
SELECT STUDENT_NAME �л��̸�, STUDENT_NO �й�, STUDENT_ADDRESS "������ �ּ�"
FROM TB_STUDENT 
WHERE SUBSTR(STUDENT_ADDRESS, 1,3) IN ('������', '��⵵') 
AND ENTRANCE_DATE BETWEEN '90/01/01' AND '99/12/31'
ORDER BY 1 ASC;

--4. ���� ���а� ���� �� ���� ���̰� ���� ������� �̸��� Ȯ���� �� �ִ� SQL ������ 
--�ۼ��Ͻÿ�. (���а��� '�а��ڵ�'�� �а� ���̺�(TB_DEPARTMENT)�� ��ȸ�ؼ� ã�� 
--������ ����)


SELECT PROFESSOR_NAME, PROFESSOR_SSN
FROM TB_PROFESSOR
WHERE DEPARTMENT_NO = '005'
ORDER BY 2 ASC;

--5. 2004��2�б⿡ 'C3118100' ������ ������ �л����� ������ ��ȸ�Ϸ��� ����. ������ 
--���� �л����� ǥ���ϰ�, ������ ������ �й��� ���� �л����� ǥ���ϴ� ������ 
--�ۼ��غ��ÿ�.

SELECT STUDENT_NO, TO_CHAR(POINT, '9.99')POINT
FROM  TB_GRADE
WHERE TERM_NO = '200402'
AND CLASS_NO  ='C3118100'
ORDER BY 2 DESC;

--6. �л� ��ȣ, �л� �̸�, �а� �̸��� �л� �̸����� �������� �����Ͽ� ����ϴ� SQL 
--���� �ۼ��Ͻÿ�. 
SELECT S.STUDENT_NO, S.STUDENT_NAME, D.DEPARTMENT_NAME
FROM TB_STUDENT S
JOIN TB_DEPARTMENT D ON (S.DEPARTMENT_NO = D.DEPARTMENT_NO)
ORDER BY 2 ASC;

--7. �� ������б��� ���� �̸��� ������ �а� �̸��� ����ϴ� SQL ������ �ۼ��Ͻÿ�.
SELECT CLASS_NAME, DEPARTMENT_NAME
FROM TB_CLASS C
JOIN TB_DEPARTMENT D ON (C.DEPARTMENT_NO = D.DEPARTMENT_NO)
ORDER BY C.DEPARTMENT_NO;

--8. ���� ���� �̸��� ã������ ����. ���� �̸��� ���� �̸��� ����ϴ� SQL ���� 
--�ۼ��Ͻÿ�.
SELECT CLASS_NAME,PROFESSOR_NAME
FROM TB_CLASS C
JOIN TB_CLASS_PROFESSOR CP ON (C.CLASS_NO = CP.CLASS_NO)
JOIN TB_PROFESSOR P ON (CP.PROFESSOR_NO = P.PROFESSOR_NO)
ORDER BY C.DEPARTMENT_NO ASC, P.PROFESSOR_NO ASC;

--9. 8���� ��� �� ���ι���ȸ�� �迭�� ���� ������ ���� �̸��� ã������ ����. �̿� 
--�ش��ϴ� ���� �̸��� ���� �̸��� ����ϴ� SQL ���� �ۼ��Ͻÿ�.
SELECT C.CLASS_NAME,P.PROFESSOR_NAME
FROM TB_CLASS C
JOIN TB_CLASS_PROFESSOR CP ON (C.CLASS_NO = CP.CLASS_NO)
JOIN TB_PROFESSOR P ON (CP.PROFESSOR_NO = P.PROFESSOR_NO)
JOIN TB_DEPARTMENT D ON(C.DEPARTMENT_NO = D.DEPARTMENT_NO)
WHERE D.CATEGORY = '�ι���ȸ'
ORDER BY C.DEPARTMENT_NO ASC, P.PROFESSOR_NO ASC;

--10. �������а��� �л����� ������ ���Ϸ��� ����. �����а� �л����� "�й�", "�л� �̸�", 
--"��ü ����"�� ����ϴ� SQL ������ �ۼ��Ͻÿ�. (��, ������ �Ҽ��� 1�ڸ������� 
--�ݿø��Ͽ� ǥ������.)
SELECT S.STUDENT_NO, S.STUDENT_NAME,ROUND(AVG(G.POINT),1)
FROM TB_STUDENT S
JOIN  TB_GRADE G ON (S.STUDENT_NO = G.STUDENT_NO)
JOIN TB_DEPARTMENT D ON (D.DEPARTMENT_NO = S.DEPARTMENT_NO)
WHERE D.DEPARTMENT_NAME ='�����а�'
GROUP BY S.STUDENT_NO, S.STUDENT_NAME
ORDER BY 1;

--11. ���� ������ �������� ���� �л��� ���� �� �� ���� �Ǵ� �˾Ƴ��� SQL ���� 
--�ۼ��Ͻÿ�.
SELECT COUNT(*)
FROM TB_STUDENT 
WHERE COACH_PROFESSOR_NO IS NULL;














