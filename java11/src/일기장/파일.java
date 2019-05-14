package 일기장;

import java.io.FileWriter;

public class 파일 {

	
	public 파일(String name,String tile,String wi) throws Exception{
		FileWriter w = new FileWriter(name+"txt");
		
		w.write("제목"+tile+"\n");
		w.write(wi);
		
		w.close();
		
	}


}
