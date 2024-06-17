package home_works;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HomeWork6 {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "2560x1440";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void formVerification() {

        String firstName = "Miroslav";
        String lastName = "Hess";
        String userEmail = "hess04@tut.by";
        String userGender = "Male";
        String userNumber = "2965842365";
        String monthBirthUser = "October";
        String yearBirthUser = "1989";
        String userSubjects = "java, selenium, selenide, junit5";
        String hobbie1 = "Sports";
        String hobbie2 = "Reading";
        String hobbie3 = "Music";
        String pictureUrl = "my_nero_picture.jpg";
        String userAddress = "8150 Padberg Mountain";
        String userState = "Uttar Pradesh";
        String userCity = "Agra";


        open("/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        $(".text-center").shouldHave(text("Practice Form"));
        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(userEmail);
        $(byText(userGender)).click();
        $("#userNumber").setValue(userNumber);
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").click();
        $(byText(monthBirthUser)).click();
        $(".react-datepicker__year-select").click();
        $(byText(yearBirthUser)).click();
        $(".react-datepicker__day.react-datepicker__day--010").click();
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


        $(".modal-content").shouldBe(visible);
        $(".table").$(byText("Student Name")).sibling(0).shouldHave(text(firstName + " " + lastName));
        $(".table").$(byText("Student Email")).sibling(0).shouldHave(text(userEmail));
        $(".table").$(byText("Gender")).sibling(0).shouldHave(text(userGender));
        $(".table").$(byText("Mobile")).sibling(0).shouldHave(text(userNumber));
        $(".table").$(byText("Date of Birth")).sibling(0).shouldHave(text("10" + " " + monthBirthUser + "," + yearBirthUser));
        //$(".table").$(byText("Subjects")).sibling(0).shouldHave(text(userSubjects));
        $(".table").$(byText("Hobbies")).sibling(0).shouldHave(text(hobbie1 + ", " + hobbie2 + ", " + hobbie3));
        $(".table").$(byText("Picture")).sibling(0).shouldHave(text(pictureUrl));
        $(".table").$(byText("Address")).sibling(0).shouldHave(text(userAddress));
        $(".table").$(byText("State and City")).sibling(0).shouldHave(text(userState + " " + userCity));
    }
}
