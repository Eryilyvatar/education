package home_works;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.RegistrationPage;

public class TestBase extends TestData{
    RegistrationPage registrationPage = new RegistrationPage();

//    static String firstName,
//     lastName,
//     userEmail,
//     userNumber,
//     userGender,
//     monthBirthUser,
//     yearBirthUser,
//     dayBirthUser,
//     userSubjects,
//     hobbie1,
//     hobbie2,
//     hobbie3,
//     pictureUrl,
//     userAddress,
//     userState,
//     userCity;

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "2560x1440";
        Configuration.baseUrl = "https://demoqa.com";
    }

//    @BeforeEach
//    void beforeEach() {
//         firstName = "Miroslav";
//         lastName = "Hess";
//         userEmail = "hess04@tut.by";
//         userGender = "Male";
//         userNumber = "2965842365";
//         monthBirthUser = "October";
//         yearBirthUser = "1989";
//         dayBirthUser = "10";
//         userSubjects = "Math";
//         hobbie1 = "Sports";
//         hobbie2 = "Reading";
//         hobbie3 = "Music";
//         pictureUrl = "my_nero_picture.jpg";
//         userAddress = "8150 Padberg Mountain";
//         userState = "Uttar Pradesh";
//         userCity = "Agra";
//    }
}
