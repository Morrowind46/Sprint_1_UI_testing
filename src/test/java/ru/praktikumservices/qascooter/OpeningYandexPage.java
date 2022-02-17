package ru.praktikumservices.qascooter;

import com.codeborne.selenide.Configuration;
import org.junit.Assert;
import org.junit.Test;
import praktikumservices.qascooter.pageobject.MainPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.WebDriverRunner.url;

public class OpeningYandexPage {
    // 4.2 Проверить: если нажать на логотип Яндекса, в новом окне откроется главная страница Яндекса.
    @Test
    public void checkOpeningYandexPage() {

        MainPage mainPage = open ("https://qa-scooter.praktikum-services.ru", MainPage.class);

        // клик по лого Яндекс
        mainPage.clickLogoYandex ();
        //переключение на открывшуюся вкладку после клика на лого Яндекс
        switchTo ().window ("Яндекс");
        //проверка url в этой вкладке
        Assert.assertEquals (url (), "https://yandex.ru/");

        Configuration.holdBrowserOpen = true; // не закрывать браузер после теста
    }
}
