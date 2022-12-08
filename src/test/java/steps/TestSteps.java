package steps;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import pageObjects.OpenMainPage;
import pageObjects.SetIzhevskAsCity;
import pageObjects.WeatherForecast;

public class TestSteps {

    @Дано("^Открываю главную страницу сайта$")
    public void openingMainPage() {
        OpenMainPage.openMainPage();
    }

    @Когда("^Появляется всплывающее окно, закрываю его$")
    public void closingPopUp() {
        OpenMainPage.closePopUpWindow();
    }

    @Когда("^Выбираю город$")
    public void selectIzh() {
        SetIzhevskAsCity.enterIzhevskAsCity("Ижевск");
        SetIzhevskAsCity.selectIzhevskUR("Ижевск, Удмуртская Республика");
    }

    @Когда("^Выбираю Подробный прогноз на 10 дней$")
    public void selectForecast() {
        SetIzhevskAsCity.selectDetailedForecast();
    }

    @Тогда("^Получаю Подробный прогноз на '(.*)' дней$")
    public void getForecast(int daysCount) {
        WeatherForecast.detailedWeather(daysCount);
    }
}