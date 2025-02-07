package com.example;

import java.util.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.*;

import com.example.model.User;
import com.example.model.UserData;

public class LoginTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @DataProvider(name = "userData")
    public Object[][] getUserData() {
        List<User> users = UserData.getUsers();
        Object[][] data = new Object[users.size()][1];

        for (int i = 0; i < users.size(); i++) {
            data[i][0] = users.get(i); // Mengembalikan satu objek User
        }
        return data;
    }

    @Test(dataProvider = "userData")
    public void testLogin(User user) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        // Buka halaman login
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys(user.username);
        driver.findElement(By.id("password")).sendKeys(user.password);
        driver.findElement(By.id("login-button")).click();

        if (user.statusLogin) {
            // assertion untuk cek ketika login berhasil, url akan berubah
            wait.until(ExpectedConditions.urlContains("inventory.html"));
            Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"), "URL tidak sesuai setelah login sukses!");
        }
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}



// latihan 1
  // @Test
  // public void TestValidLogin() {
  //   System.out.println("Login berhasil");
  // }

  // @Test
  // public void TestInvalidLogin() {
  //   System.out.println("Login tidak berhasil");
  // }

  //latihan 2
  // @Test
  // public void testOpenLogin() {
  //   driver.get("https://www.saucedemo.com");
  //   String expectedTitlePage = "Swag Labs";
  //   String actualTitlePage = driver.getTitle();
  //   Assert.assertEquals(actualTitlePage, expectedTitlePage, "Judul halaman tidak sesuai");
  //   // System.out.println("Berhasil open page");
  // }


        //     // membersihkan data Logout setelah login berhasil**
        //     try {
        //         WebElement menuButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("react-burger-menu-btn")));
        //         menuButton.click();
        //         WebElement logoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));
        //         logoutButton.click();

        //         //Pastikan kembali ke halaman login setelah logout
        //         wait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/"));
        //     } catch (Exception e) {
        //         System.out.println("Logout gagal atau tidak diperlukan: " + e.getMessage());
        //     }
        // } else {
        //     //Verifikasi error message jika login gagal
        //     WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".error-message-container")));
        //     Assert.assertEquals(errorMessage.getText(), user.expectedErrorMessage, "Pesan error tidak sesuai!");
        // }