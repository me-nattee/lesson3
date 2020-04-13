
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.geekbrains.main.site.at.base.BaseTest;


import static java.lang.Thread.sleep;

public class NavigationTest extends BaseTest {


    @Test
    void checkNavigation() throws InterruptedException {
         driver.get("https://geekbrains.ru/career");

         WebElement buttonCourses = driver.findElement(By.cssSelector("[class*=\"gb-left-menu\"] [href=\"/courses\"]")); // страница курсов
         buttonCourses.click();
         WebElement headerPageCourses = driver.findElement(By.cssSelector("[class=\"gb-header__title\"]")); // хэдер страницы курсов
         Assertions.assertEquals("Курсы", headerPageCourses.getText());
         WebElement footerCourses = driver.findElement(By.cssSelector("[class=\"site-footer__content\"]")); // footer
         Assertions.assertNotNull(footerCourses);

         sleep(2000); // ¯\_(ツ)_/¯
         driver.findElement(By.cssSelector("div button svg[class = \"svg-icon icon-popup-close-button \"]")).click();

         WebElement buttonEvents = driver.findElement(By.cssSelector("[class*=\"gb-left-menu\"] [href=\"/events\"]")); // страница Вебинаров
         buttonEvents.click();
         WebElement headerPageEvents = driver.findElement(By.cssSelector("[class=\"gb-header__title\"]")); // хэдер страницы вебинаров
        Assertions.assertEquals("Вебинары", headerPageEvents.getText());
        WebElement footerEvents = driver.findElement(By.cssSelector("[class=\"site-footer__content\"]")); // footer
        Assertions.assertNotNull(footerEvents);

        WebElement buttonTopics = driver.findElement(By.cssSelector("[class*=\"gb-left-menu\"] [href=\"/topics\"]")); // страница форума
        buttonTopics.click();
        WebElement headerPageTopics = driver.findElement(By.cssSelector("[class=\"gb-header__title\"]")); // хэдер страницы форума
        Assertions.assertEquals("Форум", headerPageTopics.getText());
        WebElement footerTopics = driver.findElement(By.cssSelector("[class=\"site-footer__content\"]")); // footer
        Assertions.assertNotNull(footerTopics);

        WebElement buttonPosts = driver.findElement(By.cssSelector("[class*=\"gb-left-menu\"] [href=\"/posts\"]")); // страница Блог
        buttonPosts.click();
        WebElement headerPagePosts = driver.findElement(By.cssSelector("[class=\"gb-header__title\"]")); // хэдер страницы Блог
        Assertions.assertEquals("Блог", headerPagePosts.getText());
        WebElement footerPosts = driver.findElement(By.cssSelector("[class=\"site-footer__content\"]")); // footer
        Assertions.assertNotNull(footerPosts);

        WebElement buttonTests = driver.findElement(By.cssSelector("[class*=\"gb-left-menu\"] [href=\"/tests\"]")); // страница Тесты
        buttonTests.click();
        WebElement headerPageTests = driver.findElement(By.cssSelector("[class=\"gb-header__title\"]")); // хэдер страницы Тесты
        Assertions.assertEquals("Тесты", headerPageTests.getText());
        WebElement footerTests = driver.findElement(By.cssSelector("[class=\"site-footer__content\"]")); // footer
        Assertions.assertNotNull(footerTests);

        WebElement buttonCareer = driver.findElement(By.cssSelector("[class*=\"gb-left-menu\"] [href=\"/career\"]")); // страница Карьера
        buttonCareer.click();
        WebElement headerPageCareer = driver.findElement(By.cssSelector("[class=\"gb-header__title\"]")); // хэдер страницы Карьера
        Assertions.assertEquals("Карьера", headerPageCareer.getText());
        WebElement footerCareer = driver.findElement(By.cssSelector("[class=\"site-footer__content\"]")); // footer
        Assertions.assertNotNull(footerCareer);


     }


}
