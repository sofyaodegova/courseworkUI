package pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SetCity {

    public static void enterCity(String enteredText) {
        SelenideElement inputForm = $x("//*[@placeholder='Город или район']");
        inputForm.val(enteredText);
        System.out.println("Ищу " + enteredText + " в списке городов");
    }

    public static void selectCity(String enteredText) {
        String selector = "//*[@data-text='%s']";
        SelenideElement city = $x((String.format(selector, enteredText)));
        city.hover();
        city.click();
        System.out.println("Выбираю " + enteredText + " в списке городов");
    }

    public static void selectDetailedForecast() {
        SelenideElement detailedForecast = $x("//*[text()='Подробный прогноз на 10 дней']");
        detailedForecast.click();
        System.out.println("Открываю подробный прогноз погоды на 10 дней");
    }
}