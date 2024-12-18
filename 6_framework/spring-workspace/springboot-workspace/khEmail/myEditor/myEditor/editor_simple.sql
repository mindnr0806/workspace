-- 계정 추가
CREATE USER C##MyEditor IDENTIFIED BY myeditor;

GRANT CONNECT, RESOURCE TO C##MyEditor;

ALTER USER C##MyEditor DEFAULT TABLESPACE USERS QUOTA UNLIMITED ON USERS;

-- 테이블 추가 ( C##MyEditor 계정 접속 후 실행 )
CREATE TABLE BOARD (
	TITLE VARCHAR2(300),
	CONTENT VARCHAR2(4000)
);