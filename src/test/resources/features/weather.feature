# language: ru
@YandexWeatherTests
Функция: Получаю подробный прогноз погоды в Ижевске на 10 дней

  Сценарий: Получаю прогноз погоды
    Дано Открываю главную страницу сайта
    Когда Появляется всплывающее окно, закрываю его
    И Выбираю город
    Когда Выбираю Подробный прогноз на 10 дней
    Тогда Получаю Подробный прогноз на '10' дней