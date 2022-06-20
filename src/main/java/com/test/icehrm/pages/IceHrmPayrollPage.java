package com.test.icehrm.pages;

import com.test.icehrm.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class IceHrmPayrollPage extends TestBase {
    public IceHrmPayrollPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(), 'Payroll')]")
    WebElement payroll;
    @FindBy(xpath = "//ul[@id='admin_Payroll']//a[@href='https://icehrm-open.gamonoid.com/?g=admin&n=salary&m=admin_Payroll']")
    WebElement salary;
    @FindBy(xpath = "//a[@id='tabEmployeeSalary']")
    WebElement employeeSalaryComponents;
    @FindBy(xpath = "//div[@id='EmployeeSalary']//button[contains(text(), 'Filter ')]")
    WebElement filterBtn;
    @FindBy(xpath = "//div[@id='s2id_employee']")
    WebElement selectEmployee;

    @FindBy(xpath = "//div[contains(text(),'Lala Lamees')]")
    WebElement employee;

    @FindBy(xpath = "//div[@class='box-body']//button")
    WebElement modalFilterButton;

     @FindBy(xpath = "//div[@id='EmployeeSalary']//table[@aria-describedby=\"grid_info\"]//td[1]")
     List <WebElement> allEmployees;

    public void validatingLalaLameesInfo() throws InterruptedException {
        this.payroll.click();
        Thread.sleep(1500);
        this.salary.click();
        this.employeeSalaryComponents.click();
        this.filterBtn.click();
        Thread.sleep(1500);
        this.selectEmployee.click();
        Thread.sleep(1500);
        this.employee.click();
        this.modalFilterButton.click();
        Thread.sleep(1500);
        for(int i = 0; i < allEmployees.size(); i++){
            Assert.assertTrue(allEmployees.get(i).getText().trim().equals("Lala Lamees"));
        }

    }
}
