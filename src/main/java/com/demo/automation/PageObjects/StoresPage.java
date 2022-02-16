package com.demo.automation.PageObjects;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;


public class StoresPage extends AbstractBaseObject {


    By searchField = By.xpath("//div[2]/div/input[@class='form-control search-store-input']");
    By getItemName = By.xpath("//div[@id=\"search-stores\"]/a/div[@class=\"store border\"]/h4[@class=\"lang-english\"]");
    By getNotFoundMessage = By.xpath("//*[contains(text(),'No results for \"Violettaboutique\", check the spelling or try with a different word')]");
    By clearButton = By.xpath("//div[@class='col-lg-12']//i[@class=\"search-store-input__clear-button\"]");

    public void Search(String keyword){
        browserKeyword.inputText(searchField, keyword);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clearSearch(){
        browserKeyword.clickElement(clearButton);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getItemName(){
        return browserKeyword.getText(getItemName);
    }

    public String getNotFoundMessage(){
        return browserKeyword.getText(getNotFoundMessage);
    }
}
