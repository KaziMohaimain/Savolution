package com.inetbanking.testCases;

import com.inetbanking.utilities.XLUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.inetbanking.testCases.TC_LoginTest_001;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static com.inetbanking.utilities.XLUtils.getCellData;
import static com.inetbanking.utilities.XLUtils.xlfile;

public class SettingsPanel extends BaseClass
{

    public void settingsPanelDropdown()
    {
        WebElement settingPanel = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[1]/a"));
        Actions action = new Actions(driver);
        action.moveToElement(settingPanel).perform();
    }

    public void backToPrevious()
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().back();
    }

//Inside the Panel Methods:
    public void globalInformation() throws IOException {
        WebElement globalInfoTab = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[1]/ul/li[1]/a"));
        Actions action = new Actions(driver);
        action.moveToElement(globalInfoTab).perform();
        globalInfoTab.click();

        //Fill up the fields:
        //driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[1]/ul/li[1]/a")).sendKeys(getCellData(xlfile,"GlobalInfo",2,2));
    }

    public void agentVerification()
    {
        WebElement agentVerificationTab = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[1]/ul/li[2]/a"));
        Actions action = new Actions(driver);
        action.moveToElement(agentVerificationTab).perform();
        agentVerificationTab.click();
    }

    public void charge()
    {
        WebElement chargeTab = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[1]/ul/li[4]/a"));
        Actions action = new Actions(driver);
        action.moveToElement(chargeTab).perform();
        chargeTab.click();

        WebElement chargeInfo = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[1]/ul/li[4]/ul/li[1]/a"));
        Actions action2 = new Actions(driver);
        action2.moveToElement(chargeInfo).perform();
        chargeInfo.click();

        backToPrevious();

        WebElement chargeAdd = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[1]/ul/li[4]/ul/li[2]/a"));
        Actions action3 = new Actions(driver);
        action3.moveToElement(chargeInfo).perform();
        chargeAdd.click();
    }

    public void userAdministration()
    {
        WebElement userAdminTab = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[1]/ul/li[6]/a"));
        Actions action = new Actions(driver);
        action.moveToElement(userAdminTab).perform();
        userAdminTab.click();

        WebElement createUser = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[1]/ul/li[6]/ul/li[1]/a"));
        Actions action2 = new Actions(driver);
        action2.moveToElement(createUser).perform();
        createUser.click();

        backToPrevious();

        WebElement userPermission = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[1]/ul/li[6]/ul/li[2]/a"));
        Actions action3 = new Actions(driver);
        action3.moveToElement(userPermission).perform();
        userPermission.click();
    }

    public void othersTab()
    {
        WebElement othersTab = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[1]/ul/li[8]/a"));
        Actions action = new Actions(driver);
        action.moveToElement(othersTab).perform();
        othersTab.click();

        WebElement projectEntry = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[1]/ul/li[8]/ul/li[1]/a"));
        Actions action2 = new Actions(driver);
        action.moveToElement(projectEntry).perform();
        projectEntry.click();

        WebElement langRes = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[1]/ul/li[8]/ul/li[2]/a"));
        Actions action3 = new Actions(driver);
        action.moveToElement(langRes).perform();
        langRes.click();
    }

    public void locationTab()
    {
        WebElement locationTab = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[1]/ul/li[10]/a"));
        Actions action = new Actions(driver);
        action.moveToElement(locationTab).perform();
        locationTab.click();

        WebElement countryInfo = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[1]/ul/li[10]/ul/li[1]/a"));
        Actions action2 = new Actions(driver);
        action.moveToElement(countryInfo).perform();
        countryInfo.click();

        WebElement provinceInfo = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[1]/ul/li[10]/ul/li[2]/a"));
        Actions action3 = new Actions(driver);
        action.moveToElement(provinceInfo).perform();
        provinceInfo.click();

        WebElement villageInfo = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[1]/ul/li[10]/ul/li[3]/a"));
        Actions action4 = new Actions(driver);
        action.moveToElement(villageInfo).perform();
        villageInfo.click();
    }

//Execute Settings Panel Tests Method:
    @Test
    public void executeSPtests() throws IOException {
        settingsPanelDropdown();
    //Global Information tab:
        globalInformation();
        backToPrevious();
    //Agent Verification tab:
        agentVerification();
        backToPrevious();
    //Charge Tab:
        charge();
        backToPrevious();
    //User/Administration Tab:
        userAdministration();
        backToPrevious();
    //Others Tab:
        othersTab();
        backToPrevious();
    //Location Tab:
        locationTab();
    }
}
