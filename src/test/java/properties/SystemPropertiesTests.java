package properties;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


public class SystemPropertiesTests {

    @Test
    void simplePropertyTest(){
        String browserName = System.getProperty("browser");
        System.out.println(browserName);
    }

    @Test
    void simpleProperty1Test(){
        System.setProperty("browser", "Opera");
        String browserName = System.getProperty("browser");
        System.out.println(browserName);
    }

    @Test
    @Tag("property_test")
    void simpleProperty2Test(){
        String browserName = System.getProperty("browser", "firefox");
        System.out.println(browserName);
    }

    @Test
    @Tag("hello")
    void simpleProperty3Test(){
        System.out.println("Hello " + System.getProperty("user_name", "unknown student"));

    }
}
