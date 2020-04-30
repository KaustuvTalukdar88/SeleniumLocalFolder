package Rough;

import java.util.Date;

public class TestPurpose {

	public static void main(String[] args) {
		 Date d = new Date();
		String filename= "Extent_"+d.toString().replace(" ", "_").replace(":", "_")+".html";

		System.out.println(d);
		System.out.println(filename);
	}

}
