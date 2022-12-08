package pageObjects;

import com.codeborne.selenide.ElementsCollection;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.$$x;

public class weatherForecast {

    public static void detailedWeather(Integer daysCount) {

        ElementsCollection dayNumber = $$x("//h2[contains(@class,'forecast-details__title')]");
        ElementsCollection morningTemperature = $$x("//span[contains(text(),'утром')]");
        ElementsCollection dayTemperature = $$x("//span[contains(text(),'днём')]");
        ElementsCollection eveningTemperature = $$x("//span[contains(text(),'вечером')]");
        ElementsCollection nightTemperature = $$x("//span[contains(text(),'ночью')]");


        for (int i = 0; i != daysCount; i++) {
            ArrayList<String> weatherForecast = new ArrayList<String>();
            weatherForecast.add((dayNumber.get(i).getText()));
            weatherForecast.add((morningTemperature.get(i).getOwnText()));
            weatherForecast.add((dayTemperature.get(i).getOwnText()));
            weatherForecast.add((eveningTemperature.get(i).getOwnText()));
            weatherForecast.add((nightTemperature.get(i).getOwnText()));
            System.out.println(weatherForecast);
            System.out.println(" "); // - Чтобы разделить абзацы и было более читаемо
        }
    }
}
