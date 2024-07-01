package home_works;

import org.junit.jupiter.api.Test;
import java.io.File;

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
        String userSubjects = "Math";
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
                .setBirthDate(dayBirthUser, monthBirthUser, yearBirthUser)
                .setUserSubjects(userSubjects)
                .setUserHobbie(hobbie1, hobbie2, hobbie3)
                .setUserPicture(pictureUrl)
                .setUserAddres(userAddress)
                .setUserState(userState)
                .setUserCity(userCity)
                .submitUserData()
                .verifyResultModalAppears()
                .verifyResultData("Student Name", firstName + " " + lastName)
                .verifyResultData("Student Email", userEmail)
                .verifyResultData("Gender", userGender)
                .verifyResultData("Mobile", userNumber)
                .verifyResultData("Date of Birth", dayBirthUser + " " + monthBirthUser + "," + yearBirthUser)
                .verifyResultData("Hobbies", hobbie1 + ", " + hobbie2 + ", " + hobbie3)
                .verifyResultData("Picture", pictureUrl)
                .verifyResultData("Address", userAddress)
                .verifyResultData("State and City", userState + " " + userCity);

    }
}
