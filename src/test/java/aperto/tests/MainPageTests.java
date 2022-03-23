package aperto.tests;

import aperto.helpers.DriverUtils;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;



public class MainPageTests extends TestBase {
    @Test
    @Description("Main UI Checks")
    @DisplayName("Work Title test")
    void workTitleTest() {
        step("Open 'https://www.aperto.com/de' and accept cookies", () -> {
            open("https://www.aperto.com/de");
            $("#uc-btn-accept-banner").click();
        });

        step("Open toggle", () -> {
            $(".toggle-main-nav .inner").click();
        });

        step("Click on the work title", () -> {
            $("ul.level-1 li", 2).shouldHave(Condition.text("Work")).click();
        });

        step("Check if the Work page is open", () -> {
           $("h1.title").shouldHave(Condition.text("Work"));
        });
    }

    @Test
    @Description("Main UI Checks")
    @DisplayName("Blog Title test")
    void blogTitleTest() {
        step("Open 'https://www.aperto.com/de' and accept cookies", () -> {
            open("https://www.aperto.com/de");
            $("#uc-btn-accept-banner").click();
        });

        step("Open toggle", () -> {
            $(".toggle-main-nav .inner").click();
        });

        step("Click on the blog title", () -> {
            $("ul.level-1 li", 4).shouldHave(Condition.text("blog")).click();
        });

        step("Check if the Blog page is open", () -> {
            $("h1.title").shouldHave(Condition.text("Blog"));
        });
    }

    @Test
    @Description("Main UI Checks")
    @DisplayName("Service Title test")
    void serviceTitleTest() {
        step("Open 'https://www.aperto.com/de' and accept cookies", () -> {
            open("https://www.aperto.com/de");
            $("#uc-btn-accept-banner").click();
        });

        step("Open toggle", () -> {
            $(".toggle-main-nav .inner").click();
        });

        step("Click on the Service title", () -> {
            $("ul.level-1 li", 1).shouldHave(Condition.text("Service")).click();
        });

        step("Check if the Service page is open", () -> {
            $("h1.title").shouldHave(Condition.text("Services"));
        });
    }

    @Test
    @Description("Main UI Checks")
    @DisplayName("Job page title test")
    void qaJobTest() {
        step("Open 'https://www.aperto.com/de' and accept cookies", () -> {
            open("https://www.aperto.com/de");
            $("#uc-btn-accept-banner").click();
        });

        step("Open toggle", () -> {
            $(".toggle-main-nav .inner").click();
        });

        step("Click on the Karriere title", () -> {
            $("ul.level-1 li", 5).shouldHave(Condition.text("Karriere")).click();
        });

        step("Click on the Finde hier deine Stelle! link", () -> {
            $("div:nth-child(1) li a").shouldHave(Condition.text("Finde hier deine Stelle!")).click();
        });

        step("Check the info Title", () -> {
            $(".intro").shouldHave(Condition.text("Arbeiten bei Aperto, dem IBM iX Studio Berlin"));
        });
    }

    @Test
    @Description("Main UI Checks")
    @DisplayName("Berlin address check")
    void berlinAddressCheck() {
        step("Open 'https://www.aperto.com/de' and accept cookies", () -> {
            open("https://www.aperto.com/de");
            $("#uc-btn-accept-banner").click();
        });

        step("Click Kontakt button", () -> {
            $("#skrollr-body nav a").scrollIntoView(true).click();
        });

        step("Check Berlin address", () -> {
            $("div:nth-child(1) > div > div > div.rich-text-content").shouldHave(Condition.text("Chausseestraße 5"));
        });

    }

    @Test
    @Description("Main UI Checks")
    @DisplayName("Zurich address check")
    void zurichAddressCheck() {
        step("Open 'https://www.aperto.com/de' and accept cookies", () -> {
            open("https://www.aperto.com/de");
            $("#uc-btn-accept-banner").click();
        });

        step("Click Kontakt button", () -> {
            $("#skrollr-body nav a").scrollIntoView(true).click();
        });

        step("Check Zurich address", () -> {
            $("div:nth-child(2) > div > div > div.rich-text-content").shouldHave(Condition.text("Vulkanstrasse 106"));
        });

    }


    @Test
    @Description("Page title check")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://www.aperto.com/de'", () ->
            open("https://www.aperto.com/de"));

        step("Page title should have text 'Aperto | A Leading Digital Agency'", () -> {
            String expectedTitle = "Aperto | A Leading Digital Agency";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Page console check")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://www.aperto.com/de'", () ->
            open("https://www.aperto.com/de"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String severeText = "SEVERE";
            String errorText = "Error";
            String failedText = "Failed";

            assertThat(consoleLogs).doesNotContain(severeText, errorText, failedText);
        });
    }
}