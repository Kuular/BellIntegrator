package ru.bellintegrator.page.object;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YandexSearchPO {
        protected WebDriver  driver;
        private WebElement inputField1;
        private WebElement findButton1;

        public YandexSearchPO(WebDriver driver){
            this.driver=driver;
            this.inputField1 = driver.findElement(By.xpath("//input[@id='text']"));
            this.findButton1 = driver.findElement(By.xpath("//button[@class='button mini-suggest__button button_theme_websearch button_size_ws-head i-bem button_js_inited']"));
        }

        public void findGladioli1(String key){
            inputField1.click();
            inputField1.sendKeys(key);
            findButton1.click();
        }
    }


