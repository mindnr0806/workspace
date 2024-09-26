package com.kh.mybatis.template;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisTemplate {
	/*
	 * 기존 JDBC 템플릿
	 * public static Connection getConnection(){
	 * 		//driver.properties 파일을 읽어서
	 * 		//해당 DB와 접속된 Connection 객체를 생성 후 반환
	 * }
	 * 
	 * public static void close(JDBC용 객체){
	 * 	//WJSEKFQKEDMS RORCPFMF QKSSKQ(CLOSE)
	 * }
	 * 
	 * public static void commit|rollback(Connection 객체){
	 * 		//트랜잭션 처리
	 * }
	 */
	
	//마이바티스 템플릿 (Mybatis)
	public static SqlSession getSqlSession() {
		// mybatis-config.xml 파일을 읽어서
		//해당 DB와 접속된 SqlSession 객체를 생성 후 반환
		SqlSession SqlSession = null;
		
		//SqlSession 객체를 생성하기 위해서 ---> SqlSessionFactory
		//SqlSessionFactory 객체를 생성하기 위해서 -->SqlSessionFactoryBuilder 객체 필요.
		
		String resource = "/mybatis-config.xml";
		
		try {
			
		InputStream stream = Resources.getResourceAsStream(resource);
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(stream);
		SqlSession = ssf.openSession(false);
		//openSession()			: 기본값 false
		//openSession(bollean) : auto commit 설정 (true: 자동커밋, false: 수동커밋)
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		return SqlSession;
	}

}
