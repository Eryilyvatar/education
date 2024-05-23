package selenide;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch {

    @Test
    void shouldFineSelenideRepositoryAtTheTop(){
        // открыть главную страницу
        open("https://github.com/");
        // ввести в поле поиска selenide и нажать enter
        $("[class=search-input]").click();
        $("[class=search-input expanded]");
        $("[name=query-builder-test]").setValue("selenide").pressEnter();
        // кликнуть на первый репозитории из списка найденых
        $$("div.Box-sc-g0xbh4-0.kXssRI div.Box-sc-g0xbh4-0.Qaxme").first().$("a").click();
        // проверка: заголовок selenide/selenide
        $(".flex-auto.min-width-0.width-fit.mr-3").shouldHave(text("selenide / selenide"));
    }
}
