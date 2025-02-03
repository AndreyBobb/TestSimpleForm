package biglogformpratice.testbaseandform;

import biglogformpratice.asserttests.TestDataProvider;
import biglogformpratice.dataforpageform.DataForTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static io.qameta.allure.Allure.step;

public class TestPractiseFormWithRemoteDriver extends TestBaseExtended {
    DataForTest dataForTest = new DataForTest();
    TestDataProvider testDataProvider = new TestDataProvider();


    @Test
    @Tag("remote")
    void testOfPractiseForm() {
        step("Open form", () -> {
            registrationPage.openBrowser();
        });
        step("Filling out the form", () -> {
            registrationPage.setFirstName(dataForTest.firstName)
                    .setLastName(dataForTest.lastName)
                    .setUserEmail(dataForTest.userEmail)
                    .setGender(dataForTest.gender)
                    .setMonthOfBirth(dataForTest.monthOfBirth)
                    .setYearOfBirth(dataForTest.yearOfBirth)
                    .setDateOfBirth(dataForTest.dayOfBirthForEnter)
                    .setUserNumber(dataForTest.userNumber)
                    .setSubject(dataForTest.subject)
                    .setHobby(dataForTest.firstHobby)
                    .setHobby(dataForTest.secondHobby)
                    .setHobby(dataForTest.thirdHobby)
                    .setPicture(dataForTest.picture)
                    .setAddress(dataForTest.address)
                    .setState(dataForTest.state)
                    .setCity(dataForTest.city);
        });

        step("Click submit button", () -> {
            registrationPage.clickSubmit();
        });

        step("Verify form", () -> {
            testDataProvider.verifyValues(dataForTest.STUDENT_NAME,
                            (dataForTest.firstName + " " + dataForTest.lastName))
                    .verifyValues(dataForTest.STUDENT_EMAIL,
                            dataForTest.userEmail)
                    .verifyValues(dataForTest.GENDER,
                            dataForTest.gender)
                    .verifyValues(dataForTest.MOBILE, dataForTest.userNumber)
                    .verifyValues(dataForTest.DATE_OF_BIRTH, (dataForTest.dayOfBirthForAssert +
                            " " + dataForTest.monthOfBirth + "," + dataForTest.yearOfBirth))
                    .verifyValues(dataForTest.SUBJECTS,
                            dataForTest.subject)
                    .verifyValues(dataForTest.HOBBIES,
                            dataForTest.firstHobby + ", "
                                    + dataForTest.secondHobby + ", "
                                    + dataForTest.thirdHobby)
                    .verifyValues(dataForTest.PICTURE,
                            dataForTest.picture)
                    .verifyValues(dataForTest.ADDRESS,
                            dataForTest.address)
                    .verifyValues(dataForTest.STATE_AND_CITY,
                            dataForTest.state + " " + dataForTest.city);
            sleep(3000);
        });


    }
}
