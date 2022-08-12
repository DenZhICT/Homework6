package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import guru.qa.pages.RegFromPage;
import guru.qa.restaker.Inf;
import guru.qa.restaker.Reader;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;




public class ToolsQATest {
    Reader takeData = new Reader();
    RegFromPage autopractform = new RegFromPage();

    @BeforeAll
    static void configure(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.browserPosition = "0x0";

    }
    @Test
    void check() throws IOException {
        Inf data = takeData.read();
        autopractform
                .openPage()
                .fillPageForm(data)
                .checkPageFrom(data);
    }
}


