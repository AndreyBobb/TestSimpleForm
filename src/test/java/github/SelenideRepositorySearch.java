package github;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class SelenideRepositorySearch {

    @Test
    void shouldFindSelenideRepositoryAtTheTop() {
//        открыть главную страницу
        open("https://github.com/");
//        ввести в поле поиска selenide и нажать enter
        $("[aria-label='Search or jump to…']").click();
        $("[id='query-builder-test']").setValue("selenide").pressEnter();
//        выбрать первый репозиторий из списка найденных
        $$("div.gZKkEq div").first().$(".prc-Link-Link-85e08").click();
//        проверка заголовок selenide/selenide
        $("#repository-container-header").shouldHave(text("selenide / selenide"));
    }

}
