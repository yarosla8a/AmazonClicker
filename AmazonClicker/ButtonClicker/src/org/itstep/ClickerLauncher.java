package org.itstep;

import org.itstep.model.Account;
import org.itstep.service.ClientImitator;
import org.openqa.selenium.WebDriver;

public class ClickerLauncher {

	public static void main(String[] args) {

		Account acc = new Account("Alex", "Ignatenko", "ignatenko2207@gmail.com", "alexsuperpuper2207");

		ClientImitator imitator = new ClientImitator();

		WebDriver driver = imitator.loginAmazonAccount(acc);

    }
}
