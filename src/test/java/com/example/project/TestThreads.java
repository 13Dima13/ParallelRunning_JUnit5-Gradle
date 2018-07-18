package com.example.project;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.appears;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.System.out;


public class TestThreads {

    @BeforeAll
    public static void setup() {
        Configuration.browser = "chrome";
    }

    @Test
    @DisplayName("First Parallel")
    @Tag("smoke")
    public void test1() {
        open("https://mvnrepository.com/artifact/log4j/log4j/1.2.17");
        $("#maincontent > table > tbody > tr:nth-child(1) > th").waitUntil(appears, 120000).shouldBe(text("License"));
        out.println("test1 Passed");
    }

    @Test
    @Tag("regression")
    public void test2() {
        open("https://mvnrepository.com/");
        $("#maincontent > h1").waitUntil(appears, 120000);
        $("#maincontent > h1").shouldBe(text("What's New in Maven"));
        out.println("test2 Passed");
    }

    @Test
    @DisplayName("Second Parallel")
    @Tag("smoke")
    public void test3() {
        open("https://mvnrepository.com/artifact/log4j/log4j/1.2.17");
        $("#maincontent > table > tbody > tr:nth-child(1) > th").waitUntil(appears, 120000);
        $("#maincontent > table > tbody > tr:nth-child(1) > th").shouldBe(text("License"));
        out.println("test3 Passed");
    }

    @Test
    public void test4() {
        open("https://mvnrepository.com/artifact/log4j/log4j/1.2.17");
        $("#maincontent > table > tbody > tr:nth-child(1) > th").waitUntil(appears, 120000);
        $("#maincontent > table > tbody > tr:nth-child(1) > th").shouldBe(text("License"));
        out.println("test4 Passed");
    }

    @Test
    public void test5() {
        open("https://mvnrepository.com/");
        $("#maincontent > h1").waitUntil(appears, 120000);
        $("#maincontent > h1").shouldBe(text("What's New in Maven"));
        out.println("test5 Passed");
    }

    @Test
    public void test6() {
        open("https://mvnrepository.com/artifact/log4j/log4j/1.2.17");
        $("#maincontent > table > tbody > tr:nth-child(1) > th").waitUntil(appears, 120000);
        $("#maincontent > table > tbody > tr:nth-child(1) > th").shouldBe(text("License"));
        out.println("test6 Passed");
    }

    @Test
    public void test7() {
        open("https://mvnrepository.com/artifact/log4j/log4j/1.2.17");
        $("#maincontent > table > tbody > tr:nth-child(1) > th").waitUntil(appears, 120000);
        $("#maincontent > table > tbody > tr:nth-child(1) > th").shouldBe(text("License"));
        out.println("test7 Passed");
    }

    @Test
    public void test8() {
        open("https://mvnrepository.com/");
        $("#maincontent > h1").waitUntil(appears, 120000);
        $("#maincontent > h1").shouldBe(text("What's New in Maven"));
        out.println("test8 Passed");
    }

    @Test
    public void test9() {
        open("https://mvnrepository.com/artifact/log4j/log4j/1.2.17");
        $("#maincontent > table > tbody > tr:nth-child(1) > th").waitUntil(appears, 120000);
        $("#maincontent > table > tbody > tr:nth-child(1) > th").shouldBe(text("License"));
        out.println("test9 Passed");
    }
}
