package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAO {
	DBConnectionMgr mgr;
	MemberDTO dto2 = null;
	
	public MemberDAO() {
		mgr = DBConnectionMgr.getInstance();		
	}
	
	public MemberDTO select() {
		
		MemberDTO dto = new MemberDTO();
		
		//1,2단계를 해주는 DBconnectionMgr 객체 필요
		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		Connection con;
		try {
			con = mgr.getConnection();
		
		//3단계 sql문 결정
		String sql = "select * from member";
		PreparedStatement ps = con.prepareStatement(sql);
		
		
		//4단계 sql문 전달 요청
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			
			dto = new MemberDTO();
			String id = rs.getString(1);
			String pw = rs.getString(2);
			
			dto.setId(id);
			dto.setPw(pw);
		}
		ps.executeUpdate();
		
		mgr.freeConnection(con, ps , rs);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
	
	
}