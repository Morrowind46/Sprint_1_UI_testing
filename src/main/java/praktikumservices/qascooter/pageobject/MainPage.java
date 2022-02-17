package praktikumservices.qascooter.pageobject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class MainPage {

    public static final String URL = "https://qa-scooter.praktikum-services.ru";

    //локатор для кнопки лого Яндекс ;
    @FindBy(how = How.CLASS_NAME, using = "Header_LogoYandex__3TSOI")
    private SelenideElement logoYandex;
    //локатор для кнопки лого Самокат
    @FindBy(how = How.CLASS_NAME, using = "Header_LogoScooter__3lsAR")
    private SelenideElement logoSamokat;
    //локатор кнопки "Заказать" вверху страницы
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div/div[1]/div[2]/button[1]")
    private SelenideElement orderUpButton;
    //локатор кнопки "Заказать" внизу страницы
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div/div[4]/div[2]/div[5]/button")
    private SelenideElement orderDownButton;
    //локатор кнопки "Статус заказа"
    @FindBy(how = How.CLASS_NAME, using = "Header_Link__1TAG7")
    private SelenideElement orderStatusButton;
    //локатор для поля ввода номера заказа
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div/div[1]/div[3]/div/input")
    private SelenideElement orderNumberInput;
    //локатор для кнопки "Go"
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div/div[1]/div[3]/button")
    private SelenideElement searchOrderButton;
    //локатор кнопки в окне с кукуми
    @FindBy(how = How.ID, using = "rcc-confirm-button")
    private SelenideElement cookiesButton;


    //локатор для выпадающего списка "Вопросы о важном"(8шт)
    @FindBy(how = How.ID, using = "accordion__heading-0")
    private SelenideElement questionFirst;
    @FindBy(how = How.ID, using = "accordion__heading-1")
    private SelenideElement questionSecond;
    @FindBy(how = How.ID, using = "accordion__heading-2")
    private SelenideElement questionThird;
    @FindBy(how = How.ID, using = "accordion__heading-3")
    private SelenideElement questionFourth;
    @FindBy(how = How.ID, using = "accordion__heading-4")
    private SelenideElement questionFifth;
    @FindBy(how = How.ID, using = "accordion__heading-5")
    private SelenideElement questionSixth;
    @FindBy(how = How.ID, using = "accordion__heading-6")
    private SelenideElement questionSeventh;
    @FindBy(how = How.ID, using = "accordion__heading-7")
    private SelenideElement questionEighth ;
    //локатор для текста выпадающего списка "Вопросы о важном"(8шт)
    @FindBy(how = How.XPATH, using = "//*[@id=\"accordion__panel-0\"]/p")
    public SelenideElement answerFirst;
    @FindBy(how = How.XPATH, using = "//*[@id=\"accordion__panel-1\"]/p")
    public SelenideElement answerSecond;
    @FindBy(how = How.XPATH, using = "//*[@id=\"accordion__panel-2\"]/p")
    public SelenideElement answerThird;
    @FindBy(how = How.XPATH, using = "//*[@id=\"accordion__panel-3\"]/p")
    public SelenideElement answerFourth;
    @FindBy(how = How.XPATH, using = "//*[@id=\"accordion__panel-4\"]/p")
    public SelenideElement answerFifth;
    @FindBy(how = How.XPATH, using = "//*[@id=\"accordion__panel-5\"]/p")
    public SelenideElement answerSixth;
    @FindBy(how = How.XPATH, using = "//*[@id=\"accordion__panel-6\"]/p")
    public SelenideElement answerSeventh;
    @FindBy(how = How.XPATH, using = "//*[@id=\"accordion__panel-7\"]/p")
    public SelenideElement answerEighth ;

    // Методы клика по раскрвающемуся списку:
    public void clickQuestionFirst() {
        questionFirst.scrollTo ().click ();
    }

    public void clickQuestionSecond() {
        questionSecond.click ();
    }

    public void clickQuestionThird() {
        questionThird.click ();
    }

    public void clickQuestionFourth() {
        questionFourth.click ();
    }

    public void clickQuestionFifth() {
        questionFifth.click ();
    }

    public void clickQuestionSixth() {
        questionSixth.click ();
    }

    public void clickQuestionSeventh() {
        questionSeventh.click ();
    }

    public void clickQuestionEighth() {
        questionEighth.click ();
    }

    //метод клика по кнопке лого Яндекс
    public void clickLogoYandex() {
        logoYandex.click ();
    }

    //метод клика по кнопке "Заказать" вверху станицы
    public void clickOrderUpButton() {
        orderUpButton.click ();
    }

    //метод клика по кнопке "Заказать" внизу станицы
    public void clickOrderDownButton() {
        orderDownButton.scrollTo ().click ();
    }

    //метод клика по кнопке "Статус заказа"
    public MainPage clickOrderStatusButton() {
        orderStatusButton.click ();
        return this;
    }

    //метод ввода номера заказа
    public MainPage setOrderNumber(String numberOrder) {
        orderNumberInput.sendKeys (numberOrder);
        return this;
    }

    //метод клика по кнопке "Go"
    public OrderStatusPage clickSearchOrderButton() {
        searchOrderButton.click ();
        return page (OrderStatusPage.class);
    }

    //метод клика по кнопке куков
    public void clickCookiesButton () {
        if (cookiesButton.isDisplayed ()) {
            cookiesButton.click ();
        }
    }
}

//    Метод для Цепочки вызовов - method chaining. Потом попробуй этот паттерн
//    public boolean shouldHave() {
//        return MatcherAssert.assertThat(dropDownListTextNo1, notNullValue())
//    }