package ru.praktikumservices.qascooter;

import com.codeborne.selenide.Configuration;
import org.junit.Test;
import praktikumservices.qascooter.pageobject.MainPage;
import praktikumservices.qascooter.pageobject.PageOrder;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static org.junit.Assert.assertTrue;

public class ScooterOrder {

    @Test
    public void checkScooterOrderUpButton() {
        // Открыть браузер Firefox
        //System.setProperty ("selenide.browser", "firefox");
        // Развернуть браузер на всю станицу
        //Configuration.startMaximized = true;

        MainPage mainPage = open (MainPage.URL, MainPage.class);
        // Закрыть окно с куками
        mainPage.clickCookiesButton ();
        mainPage.clickOrderUpButton ();

        PageOrder pageOrder = page (PageOrder.class);
        pageOrder.setOrderNameInput ("Виталий");
        pageOrder.setOrderLastNameInput ("Кононов");
        pageOrder.setOrderAddressInput ("Москва");
        pageOrder.selectMetroStation ("Сокольники");
        pageOrder.selectOrderTelephoneNumberInput ("12345678910");
        pageOrder.clickOrderNextButton ();
        pageOrder.setOrderResponsibleInput ("06.10.2021");
        pageOrder.clickRentalPeriodField ();
        pageOrder.setRentalPeriodChoice ("двое суток");
        pageOrder.clickOrderMiddleButton ();
        pageOrder.clickOrderYesButton ();

        pageOrder.shouldHaveWindowTitle ();

        Configuration.holdBrowserOpen = true;
    }

    @Test
    public void checkScooterOrderDownButton() {

        MainPage mainPage = open (MainPage.URL, MainPage.class);
        mainPage.clickCookiesButton ();
        mainPage.clickOrderDownButton ();

        PageOrder pageOrder = page (PageOrder.class);
        pageOrder.setOrderNameInput ("Алексей");
        pageOrder.setOrderLastNameInput ("Иванов");
        pageOrder.setOrderAddressInput ("Лондон");
        pageOrder.selectMetroStation ("Аннино");
        pageOrder.selectOrderTelephoneNumberInput ("12345678810");
        pageOrder.clickOrderNextButton ();
        pageOrder.setOrderResponsibleInput ("10.10.2021");
        pageOrder.clickRentalPeriodField ();
        pageOrder.setRentalPeriodChoice ("трое суток");
        pageOrder.clickOrderMiddleButton ();
        pageOrder.clickOrderYesButton ();

        pageOrder.shouldHaveWindowTitle ();

        Configuration.holdBrowserOpen = true;
    }
}
