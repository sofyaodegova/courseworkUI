package pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SetIzhevskAsCity {

    public static void enterIzhevskAsCity(String enteredText) {
        SelenideElement inputForm = $x("//*[@placeholder='Город или район']");
        inputForm.val(enteredText);
        System.out.println("Ищу " + enteredText + " в списке городов");
    }

    public static void selectIzhevskUR(String enteredText) {
        String selector = "//*[@data-text='%s']";
        SelenideElement izhevskUR = $x((String.format(selector, enteredText)));
        izhevskUR.hover();
        izhevskUR.click();
        System.out.println("Выбираю Ижевск, Удмуртская Республика в списке городов");
    }

    public static void selectDetailedForecast() {
        SelenideElement detailedForecast = $x("//*[text()='Подробный прогноз на 10 дней']");
        detailedForecast.click();
        System.out.println("Открываю подробный прогноз погоды в Ижевске на 10 дней");
    }
}