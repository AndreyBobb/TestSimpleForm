package testlog;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TestLogForm {

    @BeforeAll
    static void decreaseOfWindowSize(){
        Configuration.browserSize = "1920x1080";
    }

    @Test
     void s(){

        Configuration.pageLoadTimeout = 60000;
        Configuration.browserSize = "1920x1080";

        open("https://demoqa.com/text-box");

        $("input#userName").setValue("Dima");
        $("input#userEmail").setValue("dima@mail.ru");
        $("textarea#currentAddress").setValue("Russia");
        $("textarea#permanentAddress").setValue("Kazakhstan");

        $("#submit").click();

        $("p#name").shouldHave(text("Dima"));
        $("p#email").shouldHave(text("dima@mail.ru"));
        $("p#currentAddress").shouldHave(text("Russia"));
        $("p#permanentAddress").shouldHave(text("Kazakhstan"));
    }
}
