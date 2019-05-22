package java23;

public class BbsDAO implements BbsInterface {

	@Override
	public void insert(BbsDTO dto) {
		System.out.println("회원가입");

	}

	@Override
	public void update(BbsDTO dto) {
		System.out.println("회원가입");

	}

	@Override
	public void delete(String id) {
		System.out.println("회원가입");

	}

	@Override
	public BbsDTO select(String id) {
		BbsDTO dto = new BbsDTO("park","park","park","park");
		return dto;
	}

}
