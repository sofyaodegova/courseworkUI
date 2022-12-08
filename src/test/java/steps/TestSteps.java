package steps;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import pageObjects.openMainPage;
import pageObjects.setIzhevskAsCity;
import pageObjects.weatherForecast;

public class TestSteps {

    @Дано("^Открываю главную страницу сайта$")
    public void openingMainPage() {
        openMainPage.openMainPage();
    }

    @Когда("^Появляется всплывающее окно, закрываю его$")
    public void closingPopUp() {
        openMainPage.closePopUpWindow();
    }

    @Когда("^Выбираю город Ижевск, Удмуртская Республика$")
    public void selectIzh() {
        setIzhevskAsCity.setIzhevskAsCity();
    }

    @Когда("^Выбираю Подробный прогноз на '(.*)' дней$")
    public void selectForecast(int daysCount) {
        setIzhevskAsCity.selectDetailedForecast();
    }

    @Тогда("^Получаю Подробный прогноз на '(.*)' дней$")
    public void getForecast(int daysCount) {
        weatherForecast.detailedWeather(daysCount);
    }
}