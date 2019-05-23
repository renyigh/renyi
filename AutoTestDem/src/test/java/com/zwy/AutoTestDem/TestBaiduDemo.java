package com.zwy.AutoTestDem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class TestBaiduDemo {
/**
 * @throws Exception
 */
@Test
	 public void  test() throws Exception {
		 Logger logger = Logger.getLogger(this.getClass());
		 logger.info("hello this is log4j info log");
		 Properties properties = new Properties();
		 String path=System.getProperty("user.dir");
		 logger.info(path);
		 System.out.println(TestBaiduDemo.class.getResource(""));
//		 InputStream in=this.getClass().getClassLoader().getResourceAsStream("a.properties");
		 
     BufferedReader  in= new BufferedReader(new FileReader(path+"/src/test/java/com/zwy/AutoTestDem/a.properties"));
		     properties.load(in);
		     for (String key : properties.stringPropertyNames()) {
		            System.out.println(key + "=" + properties.getProperty(key));
		        }
		  // 获取key对应的value值
		    String a=properties.getProperty("name");
		    logger.info(a);
		    
	}

	  
			  
	  
  }

