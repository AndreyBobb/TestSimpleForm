package biglogformpratice.testPackage.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {

    private static final String TITLE_TEXT = "Student Registration Form";
    private SelenideElement inputFirstName = $("input#firstName"),
            inputLastName = $("input#lastName"),
            inputUserEmail = $("input#userEmail"),
            inputGender = $("#genterWrapper"),
            inputUserNumber = $("#userNumber"),
            inputSubject = $("div#subjectsWrapper input#subjectsInput"),
            inputHobby = $("#hobbiesWrapper"),
            inputAddress = $("#currentAddress"),
            inputStateAndCity = $("#stateCity-wrapper"),
            inputMonth = $("select.react-datepicker__month-select"),
            inputYear = $("select.react-datepicker__year-select");


    public RegistrationPage openBrowser() {
        open("automation-practice-form");
        $("div.practice-form-wrapper")
                .shouldHave(text(TITLE_TEXT));
        executeJavaScript("$('#fixedban').remove");
        executeJavaScript("$('footer').remove");
        return this;
    }

    public RegistrationPage setFirstName(String firstName) {
        inputFirstName.setValue(firstName);
        return this;
    }

    public RegistrationPage setLastName(String lastName) {
        inputLastName.setValue(lastName);
        return this;

    }

    public RegistrationPage setUserEmail(String userEmail) {
        inputUserEmail.setValue(userEmail);
        return this;

    }

    public RegistrationPage setGender(String gender) {
        inputGender.$(byText(gender)).click();
        return this;
    }

    public RegistrationPage setUserNumber(String userNumber) {
        inputUserNumber.setValue(userNumber);
        return this;
    }

    public RegistrationPage setSubject(String subject) {
        inputSubject.setValue(subject).pressEnter();
        return this;
    }

    public RegistrationPage setHobby(String hobby) {
        inputHobby.shouldBe(visible).$(byText(hobby)).click();
        return this;
    }

    public RegistrationPage setPicture(String picture) {
        $("input[type='file']").uploadFromClasspath(picture);
        return this;
    }

    public RegistrationPage setAddress(String address) {
        inputAddress.setValue(address);
        return this;
    }

    public RegistrationPage setState(String state) {
        inputStateAndCity.$(byText("Select State")).click();
        $(byText(state)).click();
        return this;
    }

    public RegistrationPage setCity(String city) {
        inputStateAndCity.$(byText("Select City")).click();
        $(byText(city)).click();
        return this;
    }

    public RegistrationPage setMonthOfBirth(String month) {
        $("#dateOfBirthInput").click();
        inputMonth.shouldBe(visible).selectOption(month);

        return this;
    }

    public RegistrationPage setYearOfBirth(String year) {
        inputYear.shouldBe(visible).selectOption(year);
        return this;
    }

    public RegistrationPage setDateOfBirth(String date) {
        $("div.react-datepicker__day--" + date +
                ":not(.react-datepicker__day--outside-month)").shouldBe(visible).click();

        return this;
    }

    public void clickSubmit() {
        $("#submit").click();
    }
}
