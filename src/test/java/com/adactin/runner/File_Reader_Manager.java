package com.adactin.runner;

public class File_Reader_Manager {

	public static File_Reader_Manager getinstance() {

File_Reader_Manager fr = new File_Reader_Manager();
return fr ;
		
		
	}
	
	
	
	
	public Adactin_Run getinstanceAR() throws Throwable {

		Adactin_Run run = new Adactin_Run();
		
		return run;
	}
	
	
	
	
	
	
	
}
