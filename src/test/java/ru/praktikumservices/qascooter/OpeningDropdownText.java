package ru.praktikumservices.qascooter;

import com.codeborne.selenide.Configuration;
import org.junit.Test;
import praktikumservices.qascooter.pageobject.MainPage;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.open;

// Задание 1) Выпадающий список в разделе «Вопросы о важном».
// Если нажать на значок стрелочки, должен открыться текст.
public class OpeningDropdownText {

    @Test
    public void checkOpeningDropdownText() {

        MainPage mainPage = open (MainPage.URL, MainPage.class);

        mainPage.clickQuestionFirst ();
        mainPage.answerFirst.shouldHave (exactText ("Сутки — 400 рублей. Оплата курьеру — наличными или картой."));
        // MatcherAssert.assertThat(mainPage.answerFirst, notNullValue());
        mainPage.clickQuestionSecond ();
        mainPage.answerSecond.shouldHave (exactText ("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."));
        mainPage.clickQuestionThird ();
        mainPage.answerThird.shouldHave (exactText ("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."));
        mainPage.clickQuestionFourth ();
        mainPage.answerFourth.shouldHave (exactText ("Только начиная с завтрашнего дня. Но скоро станем расторопнее."));
        mainPage.clickQuestionFifth ();
        mainPage.answerFifth.shouldHave (exactText ("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."));
        mainPage.clickQuestionSixth ();
        mainPage.answerSixth.shouldHave (exactText ("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."));
        mainPage.clickQuestionSeventh ();
        mainPage.answerSeventh.shouldHave (exactText ("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."));
        mainPage.clickQuestionEighth ();
        mainPage.answerEighth.shouldHave (exactText ("Да, обязательно. Всем самокатов! И Москве, и Московской области."));

        Configuration.holdBrowserOpen = true;
    }
}

