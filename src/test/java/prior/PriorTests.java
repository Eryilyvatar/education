package prior;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PriorTests {
    @Test
    void successfulSearchTest() {
        Configuration.holdBrowserOpen = true;

        open("https://www.ibank.priorbank.by/");
        $("[name=UserName]").setValue("kozachenkoartem");
        $("[name=Password]").setValue("Nazafi95prioR").pressEnter();
    }
}



