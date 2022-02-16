package com.demo.test;

import com.demo.automation.PageObjects.StoresPage;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class SearchFunction extends BaseTest{
    String keyWord = "Violetta boutique";
    String keyWordNotMatch = "Violettaboutique";
    String Message = "No results for \"Violettaboutique\", check the spelling or try with a different word";
    @Test(priority = 1)
    public void Search_results_displayed_should_be_relevant_to_search_keyword() throws InterruptedException {

        getStoresPage().Search(keyWord);
        String foundItemName = getStoresPage().getItemName();
        Assert.assertEquals(foundItemName, keyWord);
        System.out.println("Found result::::" + foundItemName);
        getStoresPage().clearSearch();
        Reporter.log("</br>Test Cases: Search results displayed should be relevant to search keyword.");
        Reporter.log("</br></br>Step 1: Open page \"https://tamara.co/en/tamara-stores.html\" ");
        Reporter.log("</br>Step 2:  Enter <keyword> which match the item names");
        Reporter.log("</br></br>ACTUAL RESULT: </br> Items matched the keyword should be displayed.  ");
    }
    @Test(priority = 2)
    public void Not_found_message_appears_when_keyword_does_not_match_any_item() throws InterruptedException {

        getStoresPage().Search(keyWordNotMatch);
        String notFoundMessage = getStoresPage().getNotFoundMessage();

        Assert.assertEquals(notFoundMessage, Message);

        System.out.println("Found result::::" + notFoundMessage);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Reporter.log("</br>Test Cases: Search results displayed should be relevant to search keyword.");
        Reporter.log("</br></br>Step 1: Open page \"https://tamara.co/en/tamara-stores.html\" ");
        Reporter.log("</br>Step 2:  Enter <keyword> which does NOT match the item names");
        Reporter.log("</br></br>ACTUAL RESULT: </br> Message \"No results for \"onesd\", check the spelling or try with a different word\" appears.  ");
    }
}
