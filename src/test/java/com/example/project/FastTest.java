package com.example.project;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.open;
import static com.example.project.OversPage.*;

public class FastTest {
    @BeforeAll
    public static void setup(){
            Configuration.browser = "chrome";
    }
    @Test
    public void shortTest(){
            OversPage form = new OversPage();
            open("https://forum.overclockers.ua/");
            searchField()
                    .exists();
            openMenu()
                    .click();
            menu()
                    .isDisplayed();
            users("Пользователи")
                    .click();
            titleH1()
                    .shouldBe(Condition.text("Пользователи"));
            SelenideElement a = OversPage.titleH1();
        }
}
