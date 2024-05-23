package selenide;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class BestContributorToSelenide {

    @Test
    void solntsevShoudBeTheTopContributor(){
        Configuration.holdBrowserOpen = true;
        // открыть страницу репозитория селенида
        open("https://github.com/selenide/selenide");
        // подвести мышку к первому аватару из блока contributors
        $(".BorderGrid.about-margin").$(byText("Contributors")).ancestor(".BorderGrid-row")
                .$$("ul li").first().hover();
        // проверка: во всплывающем окне есть текст Andrei Solntsev
        $(".Popover .Popover-message").shouldHave(text("Andrei Solntsev"));
    }
}
