#King test automation project

## :cherry_blossom:	Content

> ➠ [Covered functionality](#earth_africa-covered-functionality)
>
> ➠ [Technology stack](#classical_building-technology-stack)
>
> ➠ [Running tests from the terminal](#running-tests-from-the-terminal)
>
> ➠ [Running Tests in Jenkins](#robot-remote-test-running)
>
> ➠ [Test results report in Allure Report](#skier-main-page-of-allure-report)
>
> ➠ [Telegram notifications using a bot](#-telegram-notifications-using-a-bot)
>
> ➠ [An example of running a test in Selenoid](#-an-example-of-running-a-test-in-selenoid)


## :earth_africa: Covered functionality

> Разработаны автотесты на <code>UI</code>.
### UI

- [x] Проверка отображения страницы поиска товаров
- [x] Отсутствие ошибок в журнале консоли страницы
- [x] Проверка количества найденного товара
- [x] Проверка списка брендов
- [x] Проверка фильтра товаров
- [x] Проверка ошибки "По Вашему запросу ничего не найдено"
- [x] Проверка ошибки "Извините, не удалось обработать ваш запрос."
- [x] Проверка отображения картинки при неправильном запросе
- [x] Проверка поиска большого значения
- [x] Проверка смешанного типа запроса

## :classical_building: Technology stack

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="Telegram" src="images/logo/Telegram.svg">
</p>

 В данном проекте автотесты написаны на <code>Java</code> с использованием <code>Selenide</code> для UI-тестов.
>
> <code>Selenoid</code> выполняет запуск браузеров в контейнерах <code>Docker</code>.
>
> <code>Allure Report</code> формирует отчет о запуске тестов.
>
> Для автоматизированной сборки проекта используется <code>Gradle</code>.
>
> В качестве библиотеки для модульного тестирования используется <code>JUnit 5</code>.
>
> <code>Jenkins</code> выполняет запуск тестов.
> После завершения прогона отправляются уведомления с помощью бота в <code>Telegram</code>.


## Running tests from the terminal

### :robot: Локальный запуск тестов

```
gradle clean test
```

### :robot: Remote test running

```
clean
test
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-DbrowserMobileView="${BROWSER_MOBILE}"
-DremoteDriverUrl=https://user1:1234@${REMOTE_DRIVER_URL}/wd/hub/
-DvideoStorage=https://${REMOTE_DRIVER_URL}/video/
-Dthreads=${THREADS}
```

### :robot: Параметры сборки

> <code>REMOTE_URL</code> – адрес удаленного сервера, на котором будут запускаться тесты.
>
> <code>BROWSER</code> – браузер, в котором будут выполняться тесты (_по умолчанию - <code>chrome</code>_).
>
> <code>BROWSER_VERSION</code> – версия браузера, в которой будут выполняться тесты (_по умолчанию - <code>91.0</code>_).
>
> <code>BROWSER_SIZE</code> – размер окна браузера, в котором будут выполняться тесты (_по умолчанию - <code>1920x1080</code>_).



### :skier: Main page of Allure-report

<p align="center">
<img title="Allure Overview" src="images/screens/allure_overview.png">
</p>

### :eye_speech_bubble: Группировка тестов по проверяемому функционалу

<p align="center">
<img title="Allure Behaviors" src="images/screens/allure_behaviors.png">
</p>


### :frog: Основной дашборд

<p align="center">
<img title="Allure Overview Dashboard" src="images/screens/allure_overview_dashboard.png">
</p>


## <img width="4%" title="Telegram" src="images/logo/Telegram.svg"> Telegram notifications using a bot

> После завершения сборки специальный бот, созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет сообщение с отчетом о прогоне.

<p align="center">
<img title="Telegram Notifications" src="images/screens/telegram_notifications.png">
</p>

## <img width="4%" title="Selenoid" src="images/logo/Selenoid.svg"> An example of running a test in Selenoid]

> К каждому тесту в отчете прилагается видео. Одно из таких видео представлено ниже.
<p align="center">
  <img title="Selenoid Video" src="images/gif/selenoid_video.gif">
</p>
