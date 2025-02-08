package biglogformpratice.dataprovaiders;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


public class TestDataProvider {

    public TestDataProvider verifyValues(String value, String key) {
        $("div.modal-body").$(byText(value)).sibling(0).shouldHave(text(key));
        return this;
    }

}





