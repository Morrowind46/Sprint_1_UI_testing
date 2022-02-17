package ru.praktikumservices.qascooter;

import org.junit.Test;
import praktikumservices.qascooter.pageobject.MainPage;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertTrue;

public class OrderStatusCheckTest {

//4.4 Проверить: если ввести неправильный номер заказа,
// попадёшь на страницу статуса заказа. На ней должно быть написано,
// что такого заказа нет.

    @Test
    public void checkOrderStatusWithUnknownNumber() {

        // 1. Тестовые данные
        final String nonExistingOrderNumber = "5";

        // 2. Действие
        boolean isOrderNotFoundImageDisplayed = open (MainPage.URL, MainPage.class)
                .clickOrderStatusButton ()
                .setOrderNumber (nonExistingOrderNumber)
                .clickSearchOrderButton ()
                .isOrderNotFoundImageDisplayed ();

        // 3. Проверка
        assertTrue ("Order-not-found image is not displayed", isOrderNotFoundImageDisplayed);
    }
}
