package biglogformpratice.asserttests;

import biglogformpratice.dataforpageform.DataForTest;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;


public class Verification {
        static DataForTest data = new DataForTest();

        static Stream<Arguments> verifyValuesEnteredInTable() {
            return Stream.of(
                    Arguments.of("Student Name", (data.getFirstName() +
                            " " + data.getLastName())),
                    Arguments.of("Student Email", data.getUserEmail()),
                    Arguments.of("Gender", data.getGender()),
                    Arguments.of("Mobile", data.getUserNumber()),
                    Arguments.of("Date of Birth", (data.getDayOfBirth() +
                            " " + data.getMonthOfBirth() + " " + data.getYearOfBirth())),
                    Arguments.of("Subjects", data.getSubject()),
                    Arguments.of("Hobbies", (data.getFirstHobby() + ", "
                            + data.getSecondHobby() + ", " + data.getThirdHobby())),
                    Arguments.of("Picture", data.getPicture()),
                    Arguments.of("Address", data.getAddress()),
                    Arguments.of("State and City", (data.getState() + " "
                            + data.getCity()))
            );
        }

}

