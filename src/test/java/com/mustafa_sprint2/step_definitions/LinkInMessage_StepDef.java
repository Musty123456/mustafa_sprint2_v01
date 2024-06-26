package com.mustafa_sprint2.step_definitions;

import com.mustafa_sprint2.pages.LinkInMessagePage;
import com.mustafa_sprint2.utilities.BrowserUtils;
import com.mustafa_sprint2.utilities.Driver;
import com.sun.source.tree.AssertTree;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LinkInMessage_StepDef {


    LinkInMessagePage linkInMessagePage = new LinkInMessagePage();

    @When("user clicks the message section")
    public void user_clicks_the_message_section() {
        linkInMessagePage.messageSection.click();
    }

    @Then("user should be able to click the link button")
    public void user_should_be_able_to_click_the_link_button() {
        linkInMessagePage.linkBtn.click();
    }

    @Then("user should be able to fill {string} and {string} section")
    public void user_should_be_able_to_fill_and_section(String text, String link) {
        linkInMessagePage.textBox.sendKeys(text);
        linkInMessagePage.linkBox.sendKeys(link);
    }

    @Then("user should be able to click save button")
    public void user_should_be_able_to_click_save_button() {
        linkInMessagePage.saveBtn.click();
    }

    @Then("user clicks send button")
    public void user_clicks_send_button() {
        linkInMessagePage.sendBtn.click();
    }

    @When("user clicks the text")
    public void userClicksTheText() {
        BrowserUtils.sleep(1);

        linkInMessagePage.textLink.click();

    }


    @Then("user should navigate to the correct {string}")
    public void user_should_navigate_to_the_correct(String text) {
        BrowserUtils.sleep(2);
        for (String each : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(each);

        }
        String actualTitle = Driver.getDriver().getTitle();


        Assert.assertTrue(actualTitle.contains(text));

    }

    @Then("verify the link opened in a new tab")
    public void verify_the_link_opened_in_a_new_tab() {

        Set<String> browserTabs = Driver.getDriver().getWindowHandles();
        for (String each : browserTabs) {

            Driver.getDriver().switchTo().window(each);
            System.out.println(each);

            if (Driver.getDriver().getCurrentUrl().contains("BMW")){
                break;

            }
            System.out.println("Current URL: " + Driver.getDriver().getCurrentUrl());

            }
        BrowserUtils.sleep(3);

    }


}
