package home_works;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HomeWork3 {
    @Test
    void pageSoftAssertions() {
        Configuration.holdBrowserOpen = true;
        // Откройте страницу Selenide в Github
        open("https://github.com/");
        $(".search-input").click();
        $("[name=query-builder-test]").setValue("home_works").pressEnter();
        $$("div.Box-sc-g0xbh4-0.kXssRI div.Box-sc-g0xbh4-0.Qaxme").first().$("a").click();
        // Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();
        // Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $("#wiki-pages-filter").setValue("SoftAssertions");
        // Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        $("div#wiki-body").shouldHave(text("3. Using JUnit5 extend test class:"));
    }

}
