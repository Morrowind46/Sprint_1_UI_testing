package praktikumservices.qascooter.pageobject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderStatusPage {

    //локатор для картинки
    @FindBy(how = How.CLASS_NAME, using = "Track_NotFound__6oaoY")
    private SelenideElement orderNotFoundImage;

    //метод сообщает, показана ли картинка
    public boolean isOrderNotFoundImageDisplayed() {
        return orderNotFoundImage.isDisplayed();
    }
}
