--���� �ּ� 
/*
    ������ �ּ�
*/
SELECT * FROM DBA_USERS;  --���� ��� �����鿡 ���Ͽ� ��ȸ�ϴ� ��ɹ�
-- ��ɹ� ���� : �ʷϻ� �����ư Ŭ�� �Ǵ� ctrl + Enter

--�Ϲ� ����� ���� ���� ���� (������ �������θ� ����!)
--[ǥ����]: CREATE USER ������ IDENTIFTIED BY ��й�ȣ;
CREATE USER "C##KH" IDENTIFIED BY KH;

--������ ����� ������ �ּ��� ���� (������ ����, ����)�ο�
--[ǥ����] GRANT ����1, ����2, ... TO ������;
GRANT CONNECT, RESOURCE TO "C##KH";

--���̺� �����̽� ���� ����
ALTER USER "C##KH" DEFAULT TABLESPACE USERS QUOTA UNLIMITED ON USERS;

