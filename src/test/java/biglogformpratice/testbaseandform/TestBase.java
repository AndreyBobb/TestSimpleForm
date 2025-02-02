package biglogformpratice.testbaseandform;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import biglogformpratice.testPackage.pages.RegistrationPage;

import static com.codeborne.selenide.Selenide.$;

public class TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @BeforeAll
    static void decreaseOfWindowSize() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com/";
        Configuration.pageLoadTimeout = 60000;
    }

    @AfterAll
    static void closeWindowWithData() {
        $("#closeLargeModal").click();
    }

}
