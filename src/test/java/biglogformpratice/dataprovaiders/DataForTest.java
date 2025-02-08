package biglogformpratice.dataprovaiders;

import com.github.javafaker.*;

import java.text.SimpleDateFormat;
import java.util.*;

public class DataForTest {

    public final String STUDENT_NAME = "Student Name";
    public final String STUDENT_EMAIL = "Student Email";
    public final String GENDER = "Gender";
    public final String MOBILE = "Mobile";
    public final String DATE_OF_BIRTH = "Date of Birth";
    public final String SUBJECTS = "Subjects";
    public final String HOBBIES = "Hobbies";
    public final String PICTURE = "Picture";
    public final String ADDRESS = "Address";
    public final String STATE_AND_CITY = "State and City";

    Random random = new Random();
    Calendar calendar = Calendar.getInstance();
    Faker data = new Faker(new Locale("en-AU"));
    int day = random.nextInt(28) + 1;
    int year = 1900 + random.nextInt(126);
    SimpleDateFormat sdf = new SimpleDateFormat("MMMM", new Locale("en"));

    public String firstName = data.name().firstName();
    public String lastName = data.name().lastName();
    public String userEmail = data.internet().emailAddress();
    public String gender = "Male";
    public String userNumber = data.numerify("##########");
    public String dayOfBirthForEnter = String.format("%03d", day);
    public String dayOfBirthForAssert = String.format("%02d", day);
    public String monthOfBirth = sdf.format(calendar.getTime());
    public String yearOfBirth = String.format("%d", year);
    public String state = "NCR";
    public String city = "Delhi";
    public String subject = "Maths";
    public String picture = "picture.jpg";
    public String address = String.valueOf(data.address().fullAddress());
    public String firstHobby = "Sports";
    public String secondHobby = "Reading";
    public String thirdHobby = "Music";

}

