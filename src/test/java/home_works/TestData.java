package home_works;



import com.github.javafaker.Faker;

import java.util.Locale;

import static utils.RandomUtils.*;

public class TestData{

    Faker faker = new Faker(new Locale("it"));

    String firstName = faker.name().firstName(),
    lastName = faker.name().lastName(),
    userEmail = faker.internet().emailAddress(),
    userGender = getRandomValue("Male", "Female", "Other"),
    userNumber = faker.number().numberBetween(1000000000L, 9999999999L) + "",
    monthBirthUser = randomMonth(),
    yearBirthUser = faker.number().numberBetween(1940,2005) + "",
    dayBirthUser = randomInt(1, 28),
    userSubjects = getRandomValue("English", "Arts", "History", "Hindi"),
    hobbie1 = "Sports",
    hobbie2 = "Reading",
    hobbie3 = "Music",
    pictureUrl = "my_nero_picture.jpg",
    userAddress = faker.address().fullAddress(),
    userState = getRandomValue("NCR", "Uttar Pradesh", "Haryana", "Rajasthan"),
    userCity = getCityData(userState);
}
