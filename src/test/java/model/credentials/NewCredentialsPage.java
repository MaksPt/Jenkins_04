package model.credentials;

import model.base.BaseHeaderFooterPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public final class NewCredentialsPage extends BaseHeaderFooterPage {

    @FindBy(xpath = "//input[@name='_.username']")
    private WebElement userName;

    @FindBy(xpath = "//input[@name='_.password']")
    private WebElement newPassword;

    @FindBy(id = "yui-gen1-button")
    private WebElement okButton;

    public NewCredentialsPage(WebDriver driver) {
        super(driver);
    }

    public GlobalCredentialsPage createUserCredentials(String name, String password){
        userName.sendKeys(name);
        newPassword.sendKeys(password);
        okButton.click();

        return new GlobalCredentialsPage(getDriver());
    }
}