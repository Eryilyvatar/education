package home_works;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.RegistrationPage;

public class TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    String firstName = "Miroslav";
    String lastName = "Hess";
    String userEmail = "hess04@tut.by";
    String userGender = "Male";
    String userNumber = "2965842365";
    String monthBirthUser = "October";
    String yearBirthUser = "1989";
    String dayBirthUser = "10";
    String userSubjects = "Math";
    String hobbie1 = "Sports";
    String hobbie2 = "Reading";
    String hobbie3 = "Music";
    String pictureUrl = "my_nero_picture.jpg";
    String userAddress = "8150 Padberg Mountain";
    String userState = "Uttar Pradesh";
    String userCity = "Agra";

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "2560x1440";
        Configuration.baseUrl = "https://demoqa.com";
    }
}
