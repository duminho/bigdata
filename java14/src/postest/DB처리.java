package postest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB처리 {
	
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String url;
	String user;
	String password;
	String table;
	
	public String[] select(String number) throws Exception{
		//1.드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.드라이버 설정 OK....");
				
		//2.DB연결(DB명,id,pw)
		url="jdbc:mysql://localhost:3306/pos";
		user="root";
		password="1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2.DB연결 OK.....");
		
		//3.SQL문 결졍
		String sql="select * from "+table+" where number=?";
		ps = con.prepareStatement(sql);
		ps.setString(1, number);
	
		System.out.println("3.SQl문 결정 OK...");
		
		//4.SQL전송
		rs=ps.executeQuery();
		String[] mem=null;
		if(rs.next()) {//레코드가 존재
			mem= new String[5];
			String s1=rs.getString(1);//number
			String s2=rs.getString(2);//name
			String s3=rs.getString(3);//id
			String s4=rs.getString(4);//pw
			String s5=rs.getString(5);//tel
			mem[0]=s1;
			mem[1]=s2;
			mem[2]=s3;
			mem[3]=s4;
			mem[4]=s5;
		}else {//레코드가 없다
			System.out.println("검색 결과가 없습니다.");
		}
		//ps.close();
		return mem;
	}
	
	public void insert(MemberDTO dto) throws Exception {
		
		//1.드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.드라이버 설정 OK....");
				
		//2.DB연결(DB명,id,pw)
		url="jdbc:mysql://localhost:3306/pos";
		user="root";
		password="1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2.DB연결 OK.....");
		
		//3.SQL문 결졍
		String sql="insert into "+table+" values(?,?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, dto.getNumber());
		ps.setString(2, dto.getName());
		ps.setString(3, dto.getId());
		ps.setString(4, dto.getPw());
		ps.setString(5, dto.getTel());
		System.out.println("3.SQl문 결정 OK...");
		
		//4.SQL전송
		ps.executeUpdate();
		System.out.println("4.SQL문 전송 OK....");
		ps.close();
	}
	public void update(String value,String number) throws Exception {
		
		
		//1.드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.드라이버 설정 OK....");
						
		//2.DB연결(DB명,id,pw)
		url="jdbc:mysql://localhost:3306/pos";
		user="root";
		password="1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2.DB연결 OK.....");
		
		//3.SQL문 결졍
		String sql="update "+table+" set tel=? where number=?";
		ps = con.prepareStatement(sql);
		ps.setString(1, value);
		ps.setString(2, number);
		System.out.println("3.SQl문 결정 OK...");
		
		//4.SQL전송
		ps.executeUpdate();
		System.out.println("4.SQL문 전송 OK....");
		ps.close();
	}
	public void delete(String number) throws Exception {
		
		//1.드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.드라이버 설정 OK....");
				
		//2.DB연결(DB명,id,pw)
		url="jdbc:mysql://localhost:3306/pos";
		user="root";
		password="1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2.DB연결 OK.....");
		
		//3.SQL문 결졍
		String sql="delete from "+table+" where number = ?";
		ps = con.prepareStatement(sql);
		ps.setString(1, number);
		System.out.println("3.SQl문 결정 OK...");
		
		//4.SQL전송
		ps.executeUpdate();
		System.out.println("4.SQL문 전송 OK....");
		ps.close();
	}
	

}
