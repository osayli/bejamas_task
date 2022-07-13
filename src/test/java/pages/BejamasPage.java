package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class BejamasPage {

    public BejamasPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //category filters
    @FindBy(css = "input[label='pets']")
    public WebElement petsCheckbox;

    @FindBy(css = "input[label='nature']")
    public WebElement natureCheckbox;

    @FindBy(css = "input[label='luxury']")
    public WebElement luxuryCheckBox;

    @FindBy(xpath = "(//input[@type='checkbox'])[6]")
    public WebElement artCheckbox;

    //Price filters
    @FindBy(css = "input[label='Lower than $20']")
    public WebElement lowerThan20CheckBox;

    @FindBy(css = "input[label='$20 - $100']")
    public WebElement between20and100Checkbox;

    @FindBy(css = "input[label='$100 - $200']")
    public WebElement between100and200Checkbox;

    @FindBy(css = "input[label='More than $200']")
    public WebElement moreThan200Checkbox;

    @FindBy(xpath = "//div[@class='ProductCardstyle__ProductData-sc-5v39a6-2 dRSqni']//p[contains(text(),'$')]")
    public List<WebElement> listOfProductOnPage;

    @FindBy(xpath = "(//div[@class='ProductCardstyle__ProductImageWrapper-sc-5v39a6-1 OdCKD']//img)[1]")
    public WebElement firstElementOnPage;

    @FindBy(xpath = "(//button[@class='Buttonstyle__ButtonWrapper-sc-1d6yy9q-0 fQMgOi'])[2]")
    public WebElement firstElementAddToCart;

    @FindBy(xpath = "//button//span[text()='Clear']")
    public WebElement clearButton;

    @FindBy(xpath = "//span[normalize-space()='0']")
    public WebElement counterBadgeMustBeInvisible;

    @FindBy(xpath = "//*[name()='path' and contains(@d,'M24.5103 6')]")
    public WebElement dropdownMenu;

    @FindBy (xpath = "//span[text()='save']")
    public WebElement saveButton;


}
