package pages.componenents;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationResultModal {

            public void verifyModalAppears() {
                $(".modal-dialog").should(appear);
                $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
            }

            public void verifyResult(String key, String value) {
                $(".table-responsive").$(byText(key)).parent()
                        .shouldHave(text(value));
            }

    }


