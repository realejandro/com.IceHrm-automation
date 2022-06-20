package com.test.icehrm.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class IceHrmMainPage {

    public IceHrmMainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[.='Switch']")
    WebElement switchButton;

    @FindBy(xpath = "//h4[@id='myModalLabel']")
    WebElement switchEmployeeText;

    @FindBy(xpath = "//p[contains(text(), 'Select The Employee to Switch Into')]")
    WebElement selectEmployeeToSwitchText;

    @FindBy(xpath = "//span[@id='select2-chosen-1']")
    WebElement selectEmployee;

    @FindBy(xpath = "//input[@id='s2id_autogen1_search']")
    WebElement searchEmployee;

    @FindBy(xpath = "//button[.= 'Switch']")
    WebElement switchEmployeeButton;

    @FindBy(xpath = "//*[text() [contains(. , \"Changed To\")]]//../p/a")
    WebElement employeeName;

    @FindBy(xpath = "//a[contains(text(), 'Changed To')]")
    WebElement toChangeText;

    public void clickSwitchButton(){ switchButton.click(); }

    public String getSwitchEmployeeText(){ return switchEmployeeText.getText(); }

    public void selectTheEmployee(String employeeName) throws InterruptedException {

        //validation
        Assert.assertTrue(selectEmployeeToSwitchText.getText().equals("Select The Employee to Switch Into"));
        Assert.assertTrue(selectEmployeeToSwitchText.isDisplayed());
        this.selectEmployee.click();
        this.searchEmployee.sendKeys(employeeName);
        this.searchEmployee.sendKeys(Keys.ENTER);
        this.switchEmployeeButton.click();
        Thread.sleep(1500);
        Assert.assertTrue(this.employeeName.isDisplayed());
        Assert.assertTrue(this.employeeName.getText().trim().equals("Lala Lamees"));
        Assert.assertTrue(this.toChangeText.getText().trim().equals("Changed To"));
        this.toChangeText.click();




    }






}

/*

 public MainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@class='member_name']")
    WebElement role;
    @FindBy(xpath = "//div[@class='no_interview']")
    WebElement interview;
    @FindBy(xpath = "//a[@title='Departments']")
    WebElement department;
    public String getRoleName(){
         return role.getText().trim();//BrowserUtils.getText(role)
    }
    public String getInterviewMessage(){
        return BrowserUtils.getText(interview);
    }
    public void clickDepartment(){
        department.click();
    }
*/
