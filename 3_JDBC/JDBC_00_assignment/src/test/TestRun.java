package test;

	import java.sql.*;

	public class TestRun {


		public static void main(String[] args) {
			
			// insertTest();
//			selectTest();
			updateTest();
			
		}
		
		public static void updateTest() {
			
			try {
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe"
																, "C##JDBC"
																, "JDBC");	
				conn.setAutoCommit(false);
				
				Statement stmt = conn.createStatement();
				String sql = "UPDATE TEST SET TNAME = 'test000' WHERE TNO = 1";
						
				System.out.println(sql);
				int result = stmt.executeUpdate(sql);
				
				
				if (result > 0) {
					conn.commit();
				} else {
					conn.rollback();
				}
				
				
				stmt.close();
				conn.close();
			} catch(ClassNotFoundException e) {
				e.printStackTrace();
			} catch(SQLException e) {
				e.printStackTrace();
			}
			
			
		}
		
		public static void selectTest() {	

			Connection conn = null;
			Statement stmt = null;
			ResultSet rset = null;
			
			try {
				
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
			
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String username = "C##JDBC";
				String password = "JDBC";
				conn = DriverManager.getConnection(url, username, password);
				
			
				stmt = conn.createStatement();
			
				String sql = "SELECT * FROM TEST";
				rset = stmt.executeQuery(sql);
				
				
				while(rset.next()) {
				
					int tno = rset.getInt("TNO");		
					String tname = rset.getString(2);	
					Date tdate = rset.getDate("TDATE");	
					
					System.out.println(tno + ", " + tname + ", " + tdate);
				}
				
			} catch(ClassNotFoundException e) {
				e.printStackTrace();
			} catch(SQLException e) {
				e.printStackTrace();
			} finally {
				
				try {
					rset.close();
					stmt.close();
					conn.close();
				} catch(SQLException e) { e.printStackTrace(); }
			}
		}
		
		public static void insertTest() {
			
			
			Connection conn = null;
			Statement stmt = null;
			try {
				
			
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("<< 오라클 드라이버 등록 완료 >>");
				
				
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe"
												   , "C##JDBC"
												   , "JDBC");
				System.out.println("<< 오라클 DB 접속 성공 >>");
				
				
				stmt = conn.createStatement();
				
			
				String sql = "INSERT INTO TEST VALUES (2, '김인창', SYSDATE)";
			
				int result = stmt.executeUpdate(sql);
			
			
				conn.setAutoCommit(false);
				
				if (result > 0) {
					
					conn.commit();
					System.out.println("추가 성공!");
				} else {
				
					conn.rollback();
					System.out.println("추가 실패!");
				}
				
			} catch (ClassNotFoundException e) {
				System.out.println("[ERROR] 오라클 드라이버 등록 실패!! " + e.getMessage());
			} catch (SQLException e) {
				System.out.println("[ERROR] SQL 오류 발생!! " + e.getMessage());
			} finally {
				
				try {
					stmt.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}

	}









