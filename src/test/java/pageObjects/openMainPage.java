package pageObjects;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class openMainPage {
    public static String baseUrl = "https://yandex.ru/pogoda/";

    public static void openMainPage() {
        Configuration.holdBrowserOpen = true;
        Selenide.open(baseUrl);
        System.out.println("Открываю страницу: " + baseUrl);
    }

    public static void closePopUpWindow() {
        SelenideElement closeWindow = $x("//*[text()=\"Закрыть\"]");
        if (closeWindow.exists()) {
            closeWindow.click();
        }
    }
}
