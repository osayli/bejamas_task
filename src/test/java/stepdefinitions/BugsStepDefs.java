package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.BejamasPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class BugsStepDefs {
    BejamasPage bejamasPage=new BejamasPage();

    @Given("user goes to webpage  {string}")
    public void user_goes_to_webpage(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("homepage_url"));
    }
    @Then("user see the feature flag on featured artwork")
    public void user_see_the_feature_flag_on_featured_artwork() {

    }

    @When("user goes to product list")
    public void user_goes_to_product_list() {

    }
    @Then("user verify that product list contains {int} artworks on the page")
    public void user_verify_that_product_list_contains_artworks_on_the_page(Integer productsOnPage) {
        Assert.assertEquals(productsOnPage,(Integer)bejamasPage.listOfProductOnPage.size());
    }

    @When("user clicks any Add to Chart bar")
    public void user_clicks_any_Add_to_Cart_bar() {

        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(bejamasPage.firstElementOnPage).perform();
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].click();", bejamasPage.firstElementAddToCart);
        Driver.wait(3);
    }

    @When("user clicks Clear button")
    public void user_clicks_Clear_button() {
        bejamasPage.clearButton.click();
        Driver.wait(3);

    }
    @Then("counter badge only if the cart includes some items")
    public void counter_badge_only_if_the_cart_includes_some_items() {
        Assert.assertFalse(bejamasPage.counterBadgeMustBeInvisible.isDisplayed());

    }


    @Then("user clicks more than two hundred dollars price filter")
    public void user_clicks_more_than_two_hundred_dollars_price_filter() {
        if ("chrome-mobile".equals(Driver.browser)){
            bejamasPage.dropdownMenu.click();
            JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
            executor.executeScript("arguments[0].click();", bejamasPage.moreThan200Checkbox);
        }else{
        bejamasPage.moreThan200Checkbox.click();
        Driver.wait(3);}
    }
    @Then("user clicks art filter")
    public void user_clicks_art_filter() {
    bejamasPage.artCheckbox.click();
        if ("chrome-mobile".equals(Driver.browser)){
            bejamasPage.saveButton.click();
        }
    }
    @Then("user sees no result")
    public void user_sees_no_result() {
    Assert.assertTrue(bejamasPage.listOfProductOnPage.isEmpty());
    }




}
