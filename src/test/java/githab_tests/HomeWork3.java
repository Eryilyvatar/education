package githab_tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class HomeWork3 {
    @Test
    void pageSoftAssertions() {
        Configuration.holdBrowserOpen = true;
        // Откройте страницу Selenide в Github
        open("https://github.com/");
        $(".search-input").click();
        $("[name=query-builder-test]").setValue("selenide").pressEnter();
        $$("div.Box-sc-g0xbh4-0.kXssRI div.Box-sc-g0xbh4-0.Qaxme").first().$("a").click();
        // Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();
        // Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $(".Link--muted.js-wiki-more-pages-link.btn-link.mx-auto.f6").click();
        // Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
        $$("[data-filterable-for=wiki-pages-filter] li").get(17).shouldHave(text("SoftAssertions")).click();
    }
}
