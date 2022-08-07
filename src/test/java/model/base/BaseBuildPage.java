package model.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class BaseBuildPage<Self extends BaseBuildPage<?, ?>, SideMenu> extends BaseSideMenuPage<Self, SideMenu> {

    @FindBy(css = "span.jenkins-icon-adjacent")
    private WebElement header;

    public BaseBuildPage(WebDriver driver) {
        super(driver);
    }

    public String getPageHeader() {
        return header.getText();
    }
}