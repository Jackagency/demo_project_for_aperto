package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;



public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Work Title test")
    void workTitleTest() {
        step("Open 'https://www.aperto.com/aperto/de' and accept cookies", () -> {
            open("https://www.aperto.com/aperto/de");
            SelenideElement accept = $("#uc-btn-accept-banner");
            accept.click();
        });

        step("Open toggle", () -> {
            SelenideElement toggle = $(".toggle-main-nav .inner");
            toggle.click();
        });

        step("Click on the work title", () -> {
            SelenideElement work = $(".headline", 2);
            work.shouldHave(Condition.text("Work")).click();
        });

        step("Check if the Work page is open", () -> {
           SelenideElement workTitle = $("h1.title");
           workTitle.shouldHave(Condition.text("Work"));
        });
    }

    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Blog Title test")
    void blogTitleTest() {
        step("Open 'https://www.aperto.com/aperto/de' and accept cookies", () -> {
            open("https://www.aperto.com/aperto/de");
            SelenideElement accept = $("#uc-btn-accept-banner");
            accept.click();
        });

        step("Open toggle", () -> {
            SelenideElement toggle = $(".toggle-main-nav .inner");
            toggle.click();
        });

        step("Click on the blog title", () -> {
            SelenideElement work = $("ul.level-1 li", 4);
            work.shouldHave(Condition.text("blog")).click();
        });

        step("Check if the Blog page is open", () -> {
            SelenideElement blogTitle = $("h1.title");
            blogTitle.shouldHave(Condition.text("Blog"));
        });
    }

    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Service Title test")
    void serviceTitleTest() {
        step("Open 'https://www.aperto.com/aperto/de' and accept cookies", () -> {
            open("https://www.aperto.com/aperto/de");
            SelenideElement accept = $("#uc-btn-accept-banner");
            accept.click();
        });

        step("Open toggle", () -> {
            SelenideElement toggle = $(".toggle-main-nav .inner");
            toggle.click();
        });

        step("Click on the Service title", () -> {
            SelenideElement work = $("ul.level-1 li", 1);
            work.shouldHave(Condition.text("blog")).click();
        });

        step("Check if the Service page is open", () -> {
            SelenideElement blogTitle = $("h1.title");
            blogTitle.shouldHave(Condition.text("Service"));
        });
    }

    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Aperto main page test")
    void qaJobTest() {
        step("Open 'https://www.aperto.com/aperto/de' and accept cookies", () -> {
            open("https://www.aperto.com/aperto/de");
            SelenideElement accept = $("#uc-btn-accept-banner");
            accept.click();
        });

        step("Open toggle", () -> {
            SelenideElement toggle = $(".toggle-main-nav .inner");
            toggle.click();
        });

        step("Click on the Karriere title", () -> {
            SelenideElement karriere = $("ul.level-1 li", 5);
            karriere.shouldHave(Condition.text("Karriere")).click();
        });

        step("Click on the Finde hier deine Stelle! link", () -> {
            SelenideElement findYourJobLink = $("div:nth-child(1) li a");
            findYourJobLink.shouldHave(Condition.text("Finde hier deine Stelle!")).click();
        });

        step("Check the info Title", () -> {
            SelenideElement infoTitle = $(".intro");
            infoTitle.shouldHave(Condition.text("Arbeiten bei Aperto, dem IBM iX Studio Berlin"));
        });
    }

    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Berlin address check")
    void berlinAddressCheck() {
        step("Open 'https://www.aperto.com/aperto/de' and accept cookies", () -> {
            open("https://www.aperto.com/aperto/de");
            SelenideElement accept = $("#uc-btn-accept-banner");
            accept.click();
        });

        step("Click Kontakt button", () -> {
            SelenideElement kontaktButton = $("#skrollr-body nav a");
            kontaktButton.scrollIntoView(true).click();
        });

        step("Check Berlin address", () -> {
            SelenideElement berlinAddress = $("div:nth-child(1) > div > div > div.rich-text-content");
            berlinAddress.shouldHave(Condition.text("Chausseestraße 5"));
        });

    }

    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Berlin address check")
    void zurichAddressCheck() {
        step("Open 'https://www.aperto.com/aperto/de' and accept cookies", () -> {
            open("https://www.aperto.com/aperto/de");
            SelenideElement accept = $("#uc-btn-accept-banner");
            accept.click();
        });

        step("Click Kontakt button", () -> {
            SelenideElement kontaktButton = $("#skrollr-body nav a");
            kontaktButton.scrollIntoView(true).click();
        });

        step("Check Berlin address", () -> {
            SelenideElement berlinAddress = $("div:nth-child(2 > div > div > div.rich-text-content");
            berlinAddress.shouldHave(Condition.text("Vulkanstrasse 106"));
        });

    }


    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://www.aperto.com/aperto/de'", () ->
            open("https://www.aperto.com/aperto/de"));

        step("Page title should have text 'Aperto | A Leading Digital Agency'", () -> {
            String expectedTitle = "Aperto | A Leading Digital Agency";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://www.aperto.com/aperto/de'", () ->
            open("https://www.aperto.com/aperto/de"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}