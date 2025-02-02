package selenide;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestHover {
    @Test
    void shouldOpenEnterprises() {
        open("https://github.com/");
        $("div.HeaderMenu nav ul.d-lg-flex li").sibling(0).hover();

        $("div.HeaderMenu-column div.border-bottom #solutions-by-company-size-heading")
                .closest("div").$(byText("Enterprises")).click();

        $("div h1#hero-section-brand-heading").sibling(0)
                        .shouldHave(text("To build, scale, and deliver secure software."));
    }


    @Test
    void switchRectangles() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        actions().moveToElement($("div#column-a")).clickAndHold()
                .moveToElement($("div#column-b")).release().perform();
        $("div#columns>div").shouldHave(text("B"));

        sleep(3000);
    }
}
