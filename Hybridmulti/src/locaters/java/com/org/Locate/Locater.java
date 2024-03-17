package com.org.Locate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.property.Base;

public class Locater extends Base {

	
	
@FindBy(id="email")
private WebElement uname;
@FindBy(id="pass")
private WebElement password;
@FindBy(name="login")
private WebElement login;

public WebElement getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname.sendKeys(uname);
}
public WebElement getPassword() {
	return password;
}
public void setPassword(String pass) {
	this.password.sendKeys(pass);
}
public WebElement getLogin() {
	return login;
}
public void setLogin(WebElement login) {
	this.login = login;
}

public Locater() {
	PageFactory.initElements(driver, this);
}


}
