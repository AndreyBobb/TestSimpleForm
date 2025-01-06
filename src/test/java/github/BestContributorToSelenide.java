package github;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class BestContributorToSelenide {
    @Test

    void solntsevShouldBeToTheTop(){
//        открыть реопзиторий селениды
        open("https://github.com/selenide/selenide");


//        навести мышкой на первого аватара из блока contributors
        $(".BorderGrid").$(byText("Contributors")).ancestor(".BorderGrid-row")
                .$$("ul li").first().hover();

//        проверка: во всплывающем окне есть текст Andrey Solntsev
        $(".Popover").shouldHave(text("Andrei Solntsev"));
        sleep(5000);


    }
}
