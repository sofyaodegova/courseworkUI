package pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class setIzhevskAsCity {

    public static void setIzhevskAsCity() {
        SelenideElement inputForm = $x("//*[@class=\"mini-suggest-form__input mini-suggest__input\"]");
        inputForm.val("Ижевск");
        System.out.println("Ищу Ижевск, Удмуртская Республика в списке городов");
        SelenideElement izhevskUR = $x(("//*[@data-text='Ижевск, Удмуртская Республика']")).hover();
        izhevskUR.click();
        System.out.println("Выбираю Ижевск, Удмуртская Республика в списке городов");
    }

    public static void selectDetailedForecast() {
        SelenideElement detailedForecast = $x("//*[text()=\"Подробный прогноз на 10 дней\"]");
        detailedForecast.click();
        System.out.println("Открываю подробный прогноз погоды в Ижевске на 10 дней");
    }
}