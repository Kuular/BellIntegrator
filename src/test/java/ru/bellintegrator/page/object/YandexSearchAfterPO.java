package ru.bellintegrator.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class YandexSearchAfterPO extends YandexSearchPO{

        public YandexSearchAfterPO(WebDriver driver){
            super(driver);
        }

    public boolean getTextFromFind(String x) {
        return x.equals("Шпажник");
    }
}



