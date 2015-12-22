package com.baidu.mm.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertiesTest {

	public static void main(String[] args) throws IOException {
		Properties pro = new Properties();
		try {
			InputStream in = ReadPropertiesTest.class.getResourceAsStream("sour.properties");
			pro.load(in);
			if(pro.containsKey("name"))
				System.out.println("yes:" + pro.getProperty("name"));
			
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
