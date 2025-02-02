package testPackage;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestPractiseForm extends TestBase {

    @Test
    void testOfPractiseForm() {
        Configuration.pageLoadTimeout = 60000;
        String firstName = "Dima";
        String lastName = "Li";
        String userEmail = "dima@mail.ru";
        String gender = "Male";
        String userNumber = "0987654321";
        String dayOfBirth = "020";
        String monthOfBirth = "March";
        String yearOfBirth = "2000";
        String state = "NCR";
        String city = "Delhi";
        String subject = "Maths";
        String picture = "picture.jpg";
        String address = "Some Address";
        String firstHobby = "Sports";
        String secondHobby = "Reading";
        String thirdHobby = "Music";


        registrationPage.openBrowser()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserEmail(userEmail)
                .setGender(gender)
                .setMonthOfBirth(monthOfBirth)
                .setYearOfBirth(yearOfBirth)
                .setDateOfBirth(dayOfBirth)
                .setUserNumber(userNumber)
                .setSubject(subject)
                .setHobby(firstHobby)
                .setHobby(secondHobby)
                .setHobby(thirdHobby)
                .setPicture(picture)
                .setAddress(address)
                .setState(state)
                .setCity(city)
                .clickSubmit();

        sleep(3000);
    }

    @CsvSource({
            "Student Name, Dima Li",
            "Student Email, dima@mail.ru",
            "Gender, Male",
            "Mobile, 0987654321",
            "Date of Birth, 20 March,2000",
            "Subjects, Maths",
            "Hobbies, Sports, Reading, Music",
            "Picture, picture.jpg",
            "Address, Some Address",
            "State and City, NCR Delhi"
    })
    @ParameterizedTest()
    void verifyValuesEnteredInTable(
            String value,
            String key
    ) {
        $("div.modal-body").$(byText(value)).sibling(0).shouldHave(text(key));
    }


}
