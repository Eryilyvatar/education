package home_works;

import org.junit.jupiter.api.Test;
import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HomeWork7 extends TestBase {


    @Test
    void formVerification() {

        String firstName = "Miroslav";
        String lastName = "Hess";
        String userEmail = "hess04@tut.by";
        String userGender = "Male";
        String userNumber = "2965842365";
        String monthBirthUser = "October";
        String yearBirthUser = "1989";
        String dayBirthUser = "10";
        String userSubjects = "java, selenium, selenide, junit5";
        String hobbie1 = "Sports";
        String hobbie2 = "Reading";
        String hobbie3 = "Music";
        String pictureUrl = "my_nero_picture.jpg";
        String userAddress = "8150 Padberg Mountain";
        String userState = "Uttar Pradesh";
        String userCity = "Agra";


        registrationPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(userEmail)
                .setGender(userGender)
                .setNumber(userNumber)
                .setBirthDate(dayBirthUser, monthBirthUser, yearBirthUser);


        $("#subjectsContainer input").setValue(userSubjects);
        $(byText(hobbie1)).click();
        $(byText(hobbie2)).click();
        $(byText(hobbie3)).click();
        $("#uploadPicture").uploadFile(new File("src/test/resources/" + pictureUrl));
        $("#currentAddress").setValue(userAddress);
        $(byText("Select State")).click();
        $(byText(userState)).click();
        $(byText("Select City")).click();
        $(byText(userCity)).click();
        $("#submit").click();


        registrationPage.verifyResultModalAppears();
    }
}
