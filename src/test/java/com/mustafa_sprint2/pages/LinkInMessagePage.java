package com.mustafa_sprint2.pages;

import com.mustafa_sprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkInMessagePage {
    public LinkInMessagePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "microoPostFormLHE_blogPostForm")
    public WebElement messageSection;

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link']")
    public WebElement linkBtn;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement textBox;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement linkBox;

    @FindBy(xpath = "//input[@class='adm-btn-save']")
    public WebElement saveBtn;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendBtn;

    @FindBy(xpath = "(//div[starts-with(@id, 'blg-post')])[1]//a[starts-with(@href, 'http:')]")
    public WebElement textLink;





}
