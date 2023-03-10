package objectRepo;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageRepo {
//    public AndroidDriver driver;

    @FindBy(className = "android.widget.EditText")
    private WebElement userNameTextBox;

    @FindBy(xpath = "//android.widget.EditText[@content-desc='test-Password']")
    private WebElement passwordTextBox;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-LOGIN']/android.widget.TextView")
    private WebElement loginButton;

    @FindBy(className = "android.widget.TextView")
    private WebElement productDashboardImage;

    @FindBy(xpath="//android.view.ViewGroup[@content-desc='standard_user']/android.widget.TextView")
    private WebElement standardUserCred;

    @FindBy(xpath="//android.view.ViewGroup[@content-desc='test-problem_user']/android.widget.TextView")
    private WebElement problemUserCred;

    @FindBy(xpath="//android.view.ViewGroup[@content-desc='test-locked_out_user']/android.widget.TextView")
    private WebElement lockedOutUserCred;

    @FindBy(xpath="//android.view.ViewGroup[@content-desc='test-Error message']/android.widget.TextView")
    private WebElement errorMessage;

    public LoginPageRepo(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement userNameTextBox() {
        return userNameTextBox;
    }

    public WebElement passwordTextBox() {
        return passwordTextBox;
    }

    public WebElement loginButton() {
        return loginButton;
    }

    public WebElement getProductDashboardImage() {
        return productDashboardImage;
    }
    public WebElement getErrorMessage() {
        return errorMessage;
    }
    public String standardUserCred(){
        return standardUserCred.getText().trim();
    }
    public String problemUserCred(){
        return standardUserCred.getText().trim();
    }

    public void loginToApp(String userName, String password) {
        userNameTextBox().sendKeys(userName);
        passwordTextBox().sendKeys(password);
    }
}