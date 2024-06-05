package com.seleniumconcepts.SELENIUMCONCEPT;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	static Properties prop;
	static String path;
	
	public static String getvaluefromProp(String key) throws IOException
	{
		path=System.getProperty("user.dir");
		prop=new Properties();
		FileReader file=new FileReader(path+"//Resourses//testdata.properties");
		prop.load(file);
	String str=	prop.getProperty(key);
	return str;  
		
		
	}

}
