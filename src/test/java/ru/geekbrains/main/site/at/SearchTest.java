package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.geekbrains.main.site.at.base.BaseTest;

public class SearchTest extends BaseTest {
    @Test
    void name() {
        driver.get("https://geekbrains.ru/career");
        WebElement buttonSearch = driver.findElement(By.cssSelector("[id=\"top-menu\"] [class=\"show-search-form\"] svg"));
        buttonSearch.click();

        WebElement inputSearch = driver.findElement(By.cssSelector("[class=\"search-panel__search-field\"][type=\"search\"]"));
        inputSearch.sendKeys("java");


        WebElement textProfessions = driver.findElement(By.xpath("//header/h2[text()='Профессии']"));
        WebElement textCourses = driver.findElement(By.xpath("//header/h2[text()='Курсы'']"));
        WebElement textWebinars = driver.findElement(By.xpath("//header/h2[text()='Вебинары']"));
        WebElement textBlogs = driver.findElement(By.xpath("//header/h2[text()='Блоги']"));
        WebElement textForums = driver.findElement(By.xpath("//header/h2[text()='Форум']"));
        WebElement textTests = driver.findElement(By.xpath("//header/h2[text()='Тесты']"));
        WebElement textProjects = driver.findElement(By.xpath("//header/h2[text()='Проекты и компании']"));

//        Assertions.assertEquals("Профессии", textProfessions.getText());
//        Assertions.assertEquals("Курсы", textCourses.getText());
//        Assertions.assertEquals("Вебинары", textWebinars.getText());
//        Assertions.assertEquals("Блоги", textBlogs.getText());
//        Assertions.assertEquals("Форумы", textForums.getText());
//        Assertions.assertEquals("Тесты", textTests.getText());
//        Assertions.assertEquals("Проекты и компании", textProjects.getText());


        WebDriverWait wait = new WebDriverWait(driver, 40);

        wait.until(ExpectedConditions.textToBePresentInElement(textProfessions,"Профессии"));
        wait.until(ExpectedConditions.textToBePresentInElement(textCourses,"Курсы"));
        wait.until(ExpectedConditions.textToBePresentInElement(textWebinars,"Вебинары"));
        wait.until(ExpectedConditions.textToBePresentInElement(textBlogs,"Блоги"));
        wait.until(ExpectedConditions.textToBePresentInElement(textForums,"Форум"));
        wait.until(ExpectedConditions.textToBePresentInElement(textTests,"Тесты"));
        wait.until(ExpectedConditions.textToBePresentInElement(textProjects,"Проекты и компании"));



    }


}