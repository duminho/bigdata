package car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class CarDAO {
	
	String url="jdbc:mysql://localhost:3306/car";
	String user="root";
	String password="1234";
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public void insert(CarDTO dto) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.드라이버 설정 OK....");
				
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2.DB연결 OK.....");
		
		String sql="insert into carmenu values(?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getName());
		ps.setString(3, dto.getContent());
		ps.setString(4, dto.getPrice());
		System.out.println("3.SQl문 결정 OK...");
		
		ps.executeUpdate();
		System.out.println("4.SQL문 전송 OK....");
		ps.close();
	}
	public void delete(String id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("드라이버 설정");
		
		con = DriverManager.getConnection(url, user, password);
		System.out.println("DB연결");
		
		String sql ="delete from carmenu where id=?";
		ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("sql문 결정");
		
		ps.executeUpdate();
		System.out.println("sql문 정송");
		ps.close();
	}
	public void update(String price,String id) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("드라이버 설정");
		
		con = DriverManager.getConnection(url, user, password);
		System.out.println("DB연결");
		
		String sql="update carmenu set price=? where id=?";
		ps = con.prepareStatement(sql);
		ps.setString(1, price);
		ps.setString(2, id);
		System.out.println("sql문 결정");
		
		ps.executeUpdate();
		System.out.println("sql문 전송");
		ps.close();
	}
	public CarDTO select(String inputid) throws Exception{
		CarDTO dto = new CarDTO();
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("드라이버 설정");
		
		con = DriverManager.getConnection(url, user, password);
		System.out.println("DB연결");
		
		String sql="select * from carmenu where id=?";
		ps = con.prepareStatement(sql);
		ps.setString(1, inputid);
		System.out.println("sql문 결정");
		
		rs=ps.executeQuery();
		System.out.println("sql문 전송");
		if(rs.next()) {
			String id = rs.getString(1);
			String name = rs.getString(2);
			String content = rs.getString(3);
			String price = rs.getString(4);
			
			dto.setId(id);
			dto.setName(name);
			dto.setContent(content);
			dto.setPrice(price);
		}else {
			System.out.println("검색결과 없음");
		}
		
		return dto;
	}
	public ArrayList selectAll() {
		ArrayList list = new ArrayList();
		CarDTO dto = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 설정");
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB연결");
			
			String sql="select * from carmenu";
			ps = con.prepareStatement(sql);
			System.out.println("sql문 결정");
			
			rs=ps.executeQuery();
			System.out.println("sql문 전송");
			while(rs.next()) {
				dto = new CarDTO();
				String id = rs.getString(1);
				String name = rs.getString(2);
				String content = rs.getString(3);
				String price = rs.getString(4);
				
				dto.setId(id);
				dto.setName(name);
				dto.setContent(content);
				dto.setPrice(price);
				list.add(dto);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
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
}
