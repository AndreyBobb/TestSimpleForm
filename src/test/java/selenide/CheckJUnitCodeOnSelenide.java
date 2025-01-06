package selenide;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class CheckJUnitCodeOnSelenide {
    @Test
    void onSelenidePageShouldBeExampleCodeForJUnit5(){
        open("https://github.com/selenide/selenide");
        $("div.hide-full-screen nav ul li #wiki-tab").click();
        $("div.markdown-body ul").$(byText("Soft assertions")).click();
        $("div.markdown-body").shouldHave(text("Using JUnit5"));

        sleep(4000);
    }
}
