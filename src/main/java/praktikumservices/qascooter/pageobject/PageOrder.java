package praktikumservices.qascooter.pageobject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class PageOrder {

    //локатор поля "Имя"
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/input")
    private SelenideElement orderNameInput;
    //локатор поля "Фамилия"
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/input")
    private SelenideElement orderLastNameInput;
    //локатор поля "Адрес"
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/input")
    private SelenideElement orderAddressInput;
    //локатор поля "Станция метро"
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div/div/input")
    private SelenideElement metroSelect;
    //локатор поля "Телефон"
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[2]/div[5]/input")
    private SelenideElement orderTelephoneNumberInput;
    //локатор кнопки "Далее"
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[3]/button")
    private SelenideElement orderNextButton;
    //локатор поля "Когда привезти самокат"
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[1]/div/input")
    private SelenideElement orderResponsibleInput;
    //локатор поля "Срок аренды
    @FindBy(how = How.CLASS_NAME, using = "Dropdown-placeholder")
    private SelenideElement rentalPeriodField;
    //локатор выпадающего списка срока аренды
    @FindBy(how = How.CLASS_NAME, using = "Dropdown-menu")
    private SelenideElement rentalPeriodChoice;
    //локатор кнопки "Заказать"
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[3]/button[2]")
    private SelenideElement orderMiddleButton;
    //локатор кнопки "Да"
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[5]/div[2]/button[2]")
    private SelenideElement orderYesButton;
    //локатор кнопки "Посмотреть статус"
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[5]/div[2]/button")
    private SelenideElement orderViewStatusButton;
    //локатор для всплывающего окна "Заказ оформлен"
    @FindBy(how = How.CLASS_NAME, using = "Order_ModalHeader__3FDaJ")
    private SelenideElement orderWasCreatedText;


    //метод ввода имени в форме заказа
    public void setOrderNameInput(String nameOrder) {
        orderNameInput.setValue (nameOrder);
    }

    //метод ввода фамилии в форме заказа
    public void setOrderLastNameInput(String lastNameOrder) {
        orderLastNameInput.setValue (lastNameOrder);
    }

    //метод ввода имени в форме заказа
    public void setOrderAddressInput(String addressOrder) {
        orderAddressInput.setValue (addressOrder);
    }

    //метод выбора станции метро в форме заказа
    public void selectMetroStation(String metroStation) {
        // пишем тут метро, например Сокольники
        metroSelect.setValue (metroStation);
        // тут делаем локатор для нашей опции из списка
        String metroOptionTemplate = ".//div[@class='select-search__select']//*[text()='%s']";
        String greetings = String.format (metroOptionTemplate, metroStation); //в переменную сохранится: .//div[@class='select-search__select']//*[text()='Сокольники']
        // кликаем по элементу, найденному по этому локатору
        $ (byXpath (greetings)).click ();
    }

    //метод ввода номера телефона в форме заказа
    public void selectOrderTelephoneNumberInput(String phoneNumber) {
        orderTelephoneNumberInput.setValue (phoneNumber);
    }

    //метод клипа по кнопке "Далее"
    public void clickOrderNextButton() {
        orderNextButton.click ();
    }

    //метод ввода числа в поле "Когда привезти самокат"
    public void setOrderResponsibleInput(String responsibleInput) {
        orderResponsibleInput.setValue (responsibleInput).pressEnter ();

    }

    //метод клика по полю срок аренды
    public void clickRentalPeriodField() {
        rentalPeriodField.click ();
    }

    //метод выбора срока аренды
    public void setRentalPeriodChoice(String rentalPeriod) {
        rentalPeriodChoice.find (byText (rentalPeriod)).click ();
    }

    //метод клика по кнопке "Заказать"
    public void clickOrderMiddleButton() {
        orderMiddleButton.click ();
    }

    //метод клика по кнопке "Да"
    public void clickOrderYesButton() {
        orderYesButton.click ();
    }

    //метод сообщает, показано ли сообщение "Заказ оформлен"
    public void shouldHaveWindowTitle() {
        orderWasCreatedText.shouldHave (text ("Заказ оформлен"));
    }
}
