package home_works;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HomeWork4 {
    @Test
    void requiredPageHasLoaded () {
        //Configuration.holdBrowserOpen = true;
        open("https://github.com/");
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $(byText("The AI-powered")).shouldHave(text("developer platform."));
    }
}
