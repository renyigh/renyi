package com.zwy.AutoTestDem;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class beforeTest {
	
	public  Logger logger = Logger.getLogger(this.getClass());
	String url = "http://www.baidu.com";
	@Test
	public void name() {
		// 新建一个WebDriver 的对象，但是new 的是谷歌的驱动E:/JavaWork/eclipseWork/AutoTestDem/resource/chromedriver.exe
	    
	     
		try {
			System.setProperty("webdriver.chrome.driver", "C:/Users/renyi/Desktop/aa/chromedriver.exe");
	        
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://www.baidu.com");
			 
//	        driver.get(url); // 打开指定的网站
//	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//	       
	        driver.findElement(By.id("kw")).sendKeys("selenium");

            //线程睡眠1秒

           

            //获取“百度一下”元素，并自动点击

       
        driver.close();
  		
		driver.quit();

	        
		} 
		catch (Exception e){
			// TODO: handle finally clause
			
					logger.error(e);
		}
		
		
	}
//	@AfterTest
//	public void tearDown() {
//		this.driver.close();
//		
//		this.driver.quit();
//		logger.info("-------------结束测试，并关闭退出浏览器-------------");
//	}
	
}

	
	

