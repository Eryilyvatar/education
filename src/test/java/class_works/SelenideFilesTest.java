package class_works;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SelenideFilesTest {

    @Test
    void selenideDownloadTest() throws Exception {
        open("https://github.com/selenide/selenide/blob/main/README.md");
        File downloadedFile = $("[data-testid=raw-button]").download();
        try (InputStream is = new FileInputStream(downloadedFile)){
            byte[] bytes = is.readAllBytes();
            String textContent = new String(bytes, StandardCharsets.UTF_8);
            assertThat(textContent).contains("Selenide is based on and is compatible to Selenium WebDriver 4.0+");
        }
    }
}
