package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelTask {
    @Test
    public void hotel() throws Exception{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String website_url = "http://adactinhotelapp.com";
        driver.get(website_url);
        waitforsometime(2000);
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("aswinishiva");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Ashu@2001");
        WebElement login = driver.findElement(By.id("login"));
        login.click();
        WebElement location_Dropdown = driver.findElement(By.id("location"));
        Select location_Dropdown_Select = new Select(location_Dropdown);
        location_Dropdown_Select.selectByValue("Sydney");
        WebElement search = driver.findElement(By.id("Submit"));
        search.click();
        WebElement yes_radio_button = driver.findElement(By.xpath("//input[@name='radiobutton_1']"));
        boolean is_yes_radio_button_selected = yes_radio_button.isSelected();

        yes_radio_button.click();
        WebElement con = driver.findElement(By.id("continue"));
        con.click();
        WebElement fname = driver.findElement(By.id("first_name"));
        fname.sendKeys("Pravallika");
        WebElement lname = driver.findElement(By.id("last_name"));
        lname.sendKeys("Inkula");
        WebElement address = driver.findElement(By.id("address"));
        address.sendKeys("10-9-47,sudda street, vizianagaram");
        WebElement credit = driver.findElement(By.id("cc_num"));
        credit.sendKeys("1234567890123456");
        WebElement credit_Dropdown = driver.findElement(By.id("cc_type"));
        Select credit_Dropdown_Select = new Select(credit_Dropdown);
        credit_Dropdown_Select.selectByValue("VISA");
        WebElement mon_Dropdown = driver.findElement(By.id("cc_exp_month"));
        Select month_Select = new Select(mon_Dropdown);
        month_Select.selectByIndex(10);
        WebElement year_Dropdown = driver.findElement(By.id("cc_exp_year"));
        Select year_Select = new Select(year_Dropdown);
        year_Select.selectByValue("2024");
        WebElement cvv = driver.findElement(By.id("cc_cvv"));
        cvv.sendKeys("1345");

        WebElement booknow = driver.findElement(By.id("book_now"));
        booknow.click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        WebElement orderno = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("order_no")));
        String text = orderno.getAttribute("value");
        System.out.println("order number "+text);
        WebElement search_hotel = driver.findElement(By.id("search_hotel"));
        search_hotel.click();
    }

    }

