package com.libs;

import com.cucumberrunner.PageObjectRepo;

import java.util.concurrent.TimeUnit;

public class SystemLib extends PageObjectRepo{

	public void waitForSeconds(){
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
