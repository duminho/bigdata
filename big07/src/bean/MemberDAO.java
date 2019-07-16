package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.MemberDTO;

public class MemberDAO {
	
	//dao의 단계를 효율적으로 변경
	public void insert(MemberDTO dto) throws Exception{
		String url ="jdbc:mysql://localhost:3306/bigdata";
		String user ="root";
		String password ="1234";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url, user, password);
		String sql="insert into member values(?,?,?,?)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		ps.setString(3, dto.getName());
		ps.setString(4, dto.getTel());
		
		ps.executeUpdate();
	
	}
}
//	String url="jdbc:mysql://localhost:3306/bigdata";
//	String user="root";
//	String password="1234";
//	Connection con;
//	PreparedStatement ps;
//	ResultSet rs;
//	
//	public MemberDTO select(String inputId) {
//		MemberDTO dto=null;
//		try {
//			//1. 드라이버 설정
//			Class.forName("com.mysql.jdbc.Driver");
//			System.out.println("1.드라이버 설정 완료");
//			
//			//2. DB연결(DB명,아이디,패스워드)
//			con = DriverManager.getConnection(url, user, password);
//			System.out.println("2.DB연결 완료");
//			
//			//3. SQL문 결정(객체화)
//			String sql ="select * from member where id =?";
//			ps = con.prepareStatement(sql);
//			ps.setString(1, inputId);
//			System.out.println("3.SQL문 객체화 완료");
//			
//			//4. SQL문 전송
//			rs = ps.executeQuery();
//			System.out.println("4.SQL문 전송 완료");
//			//SQL문의 결과가 있으면, 받아서 처리
//			
//			if(rs.next()) {
//				dto = new MemberDTO();
//				String id = rs.getString(1);
//				String pw = rs.getString(2);
//				String name = rs.getString(3);
//				String tel = rs.getString(4);
//				dto.setId(id);
//				dto.setPw(pw);
//				dto.setName(name);;
//				dto.setTel(tel);;
//			}else {
//				System.out.println("검색 결과가 없습니다.");
//			}
//		} catch (Exception e) {
//			System.out.println("DB처리 중 에러발생...");
//			System.out.println(e.getMessage());
//		}finally{
//			
//			try {
//				rs.close();
//				ps.close();
//				con.close();
//			} catch (SQLException e) {
//				//e.printStackTrace();
//				System.out.println("자원 해제중 에러 발생!!");
//			}//catch
//		}//try-catch-finally
//		
//		return dto;
//	}//select
////	public void insert(MemberDTO dto) throws Exception {
////		
////		//1.드라이버 설정
////		Class.forName("com.mysql.jdbc.Driver");
////		System.out.println("1.드라이버 설정 OK....");
////				
////		//2.DB연결(DB명,id,pw)
////		con = DriverManager.getConnection(url, user, password);
////		System.out.println("2.DB연결 OK.....");
////		
////		//3.SQL문 결졍
////		String sql="insert into member values(?,?,?,?)";
////		ps = con.prepareStatement(sql);
////		ps.setString(1, dto.getId());
////		ps.setString(2, dto.getPw());
////		ps.setString(3, dto.getName());
////		ps.setString(4, dto.getTel());
////		System.out.println("3.SQl문 결정 OK...");
////		
////		//4.SQL전송
////		ps.executeUpdate();
////		System.out.println("4.SQL문 전송 OK....");
////		ps.close();
////	}
//	public void update(String tel,String id) throws Exception {
//		
//		//1.드라이버 설정
//		Class.forName("com.mysql.jdbc.Driver");
//		System.out.println("1.드라이버 설정 OK....");
//						
//		//2.DB연결(DB명,id,pw)
//		con = DriverManager.getConnection(url, user, password);
//		System.out.println("2.DB연결 OK.....");
//		
//		//3.SQL문 결졍
//		String sql="update member set etc=? where id=?";
//		ps = con.prepareStatement(sql);
//		ps.setString(1, tel);
//		ps.setString(2, id);
//		System.out.println("3.SQl문 결정 OK...");
//		
//		//4.SQL전송
//		ps.executeUpdate();
//		System.out.println("4.SQL문 전송 OK....");
//		ps.close();
//	}
//	public void delete(String id) throws Exception {
//		
//		//1.드라이버 설정
//		Class.forName("com.mysql.jdbc.Driver");
//		System.out.println("1.드라이버 설정 OK....");
//				
//		//2.DB연결(DB명,id,pw)
//		con = DriverManager.getConnection(url, user, password);
//		System.out.println("2.DB연결 OK.....");
//		
//		//3.SQL문 결졍
//		String sql="delete from member where id = ?";
//		ps = con.prepareStatement(sql);
//		ps.setString(1, id);
//		System.out.println("3.SQl문 결정 OK...");
//		
//		//4.SQL전송
//		ps.executeUpdate();
//		System.out.println("4.SQL문 전송 OK....");
//		ps.close();
//	}
//}
