package com.BellatrixFinalProject.Base;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TestBase {
	

		public static RemoteWebDriver driver;

		public static RemoteWebDriver getDriver() {
			return driver;
		}

		@Before
		public void openBrowser() {
			driver = new FirefoxDriver();
			driver.get("https://demos.bellatrix.solutions/");

		}

		@After
		public void closeBrowser() {
			driver.quit();
		}
	}



