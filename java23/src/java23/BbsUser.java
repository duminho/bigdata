package java23;

public class BbsUser {

	public static void main(String[] args) {
		BbsDAO dao = new BbsDAO();
		BbsDTO dto = new BbsDTO("kim","kim","kim","kim");
		dao.insert(dto);
		dao.update(dto);
		dao.delete("kim");
		BbsDTO dto2 = dao.select("kim"); 
	}

}
