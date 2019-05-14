package java16;

import java.sql.*;
import java.util.ArrayList;
import java16.BbsDTO;

public class BbsDAO2 {
	
	String url="jdbc:mysql://localhost:3306/bigdata";
	String user="root";
	String password="1234";
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	//CRUD
	//각각을 메소드로 만들어야 한다.
	//SQL문 select * from bbs where id = ?
	public ArrayList selectAll() {
		
		ArrayList list = new ArrayList();
		BbsDTO dto=null;//변수의 생존범위: 선언 위치!
		try {
			//1. 드라이버 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1.드라이버 설정 완료");
			
			//2. DB연결(DB명,아이디,패스워드)
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2.DB연결 완료");
			
			//3. SQL문 결정(객체화)
			String sql ="select * from bbs";
			ps = con.prepareStatement(sql);
			System.out.println("3.SQL문 객체화 완료");
			
			//4. SQL문 전송
			rs = ps.executeQuery();
			System.out.println("4.SQL문 전송 완료");
			//SQL문의 결과가 있으면, 받아서 처리
			
			while(rs.next()) {
				dto = new BbsDTO();
				String id = rs.getString(1);
				String title = rs.getString(2);
				String content = rs.getString(3);
				String etc = rs.getString(4);
				dto.setId(id);
				dto.setTitle(title);
				dto.setContent(content);
				dto.setEtc(etc);
				list.add(dto);
			}//whlie close
		} catch (Exception e) {
			System.out.println("DB처리 중 에러발생...");
			System.out.println(e.getMessage());
		}finally{
			//에러 발생 여부와 상관없이 무조건 실행시켜야 하는 코드.
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				//e.printStackTrace();
				System.out.println("자원 해제중 에러 발생!!");
			}//catch
		}//try-catch-finally
		
		return list;
	}
	
	public BbsDTO select(String inputId) {
		BbsDTO dto=null;//변수의 생존범위: 선언 위치!
		try {
			//1. 드라이버 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1.드라이버 설정 완료");
			
			//2. DB연결(DB명,아이디,패스워드)
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2.DB연결 완료");
			
			//3. SQL문 결정(객체화)
			String sql ="select * from bbs where id =?";
			ps = con.prepareStatement(sql);
			ps.setString(1, inputId);
			System.out.println("3.SQL문 객체화 완료");
			
			//4. SQL문 전송
			rs = ps.executeQuery();
			System.out.println("4.SQL문 전송 완료");
			//SQL문의 결과가 있으면, 받아서 처리
			
			if(rs.next()) {
				dto = new BbsDTO();
				String id = rs.getString(1);
				String title = rs.getString(2);
				String content = rs.getString(3);
				String etc = rs.getString(4);
				dto.setId(id);
				dto.setTitle(title);
				dto.setContent(content);
				dto.setEtc(etc);
			}else {
				System.out.println("검색 결과가 없습니다.");
			}
		} catch (Exception e) {
			System.out.println("DB처리 중 에러발생...");
			System.out.println(e.getMessage());
		}finally{
			//에러 발생 여부와 상관없이 무조건 실행시켜야 하는 코드.
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				//e.printStackTrace();
				System.out.println("자원 해제중 에러 발생!!");
			}//catch
		}//try-catch-finally
		
		return dto;
	}//select
	public void insert(BbsDTO dto) throws Exception {
		
		//1.드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.드라이버 설정 OK....");
				
		//2.DB연결(DB명,id,pw)
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2.DB연결 OK.....");
		
		//3.SQL문 결졍
		String sql="insert into bbs values(?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getTitle());
		ps.setString(3, dto.getContent());
		ps.setString(4, dto.getEtc());
		System.out.println("3.SQl문 결정 OK...");
		
		//4.SQL전송
		ps.executeUpdate();
		System.out.println("4.SQL문 전송 OK....");
		ps.close();
	}
	public void update(String etc,String id) throws Exception {
		
		//1.드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.드라이버 설정 OK....");
						
		//2.DB연결(DB명,id,pw)
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2.DB연결 OK.....");
		
		//3.SQL문 결졍
		String sql="update bbs set etc=? where id=?";
		ps = con.prepareStatement(sql);
		ps.setString(1, etc);
		ps.setString(2, id);
		System.out.println("3.SQl문 결정 OK...");
		
		//4.SQL전송
		ps.executeUpdate();
		System.out.println("4.SQL문 전송 OK....");
		ps.close();
	}
	public void delete(String id) throws Exception {
		
		//1.드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.드라이버 설정 OK....");
				
		//2.DB연결(DB명,id,pw)
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2.DB연결 OK.....");
		
		//3.SQL문 결졍
		String sql="delete from bbs where id = ?";
		ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3.SQl문 결정 OK...");
		
		//4.SQL전송
		ps.executeUpdate();
		System.out.println("4.SQL문 전송 OK....");
		ps.close();
	}

}//class
