package ru.bellintegrator.page.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleSearch {
        private WebDriver driver;

        @FindBy(how = How.XPATH, xpath="//input[@id='text']")
        WebElement inputField;

        @FindBy(how= How.XPATH, xpath="//button[@class='button mini-suggest__button button_theme_websearch button_size_ws-head i-bem button_js_inited']")
        WebElement findButton;

        public GoogleSearch(WebDriver driver){
            this.driver=driver;
        }

        public void findGladioli(String key){
            inputField.click();
            inputField.sendKeys(key);
            findButton.click();
        }

         public boolean getText(String x) {
           if (x.equals("Шпажник")) return true;
           else return false;
         }
    }

