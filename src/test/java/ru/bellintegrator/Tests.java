package ru.bellintegrator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import ru.bellintegrator.page.factory.GoogleSearch;
import ru.bellintegrator.page.object.YandexSearchAfterPO;
import ru.bellintegrator.page.object.YandexSearchPO;


    public class Tests extends TestBase {

        @Test
        public void findGladioliPF(){
            driver.get("https://yandex.ru/");
            GoogleSearch gladioliSearch = PageFactory.initElements(driver,GoogleSearch.class);
            gladioliSearch.findGladioli("Гладиолус");
            Assertions.assertTrue(gladioliSearch.getText("Шпажник"));


        }
        @Test
        public void findGladioliPO(){
            driver.get("https://yandex.ru/");
            YandexSearchPO gladioliSearch1 = new YandexSearchPO(driver);
            gladioliSearch1.findGladioli1("Гладиолус вики");
            YandexSearchAfterPO gladioliSearchAfter = new YandexSearchAfterPO(driver);
            Assertions.assertTrue(gladioliSearchAfter.getTextFromFind("Шпажник"));
        }


    }


