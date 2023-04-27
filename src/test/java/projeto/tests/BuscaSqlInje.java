package projeto.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuscaSqlInje {
    WebDriver driver;

    final String CELECIONAR = "search-open";
    final String BUSCA = "search-field";
    final String PESQUISA = "search-submit";

    public BuscaSqlInje(WebDriver driver){
        this.driver = driver;
        driver.manage().window().maximize();
    }
    public void realizaBuscaSqlInj(String select){
        driver.findElement(By.id(CELECIONAR)).click();
        driver.findElement(By.className(BUSCA)).sendKeys(select);
        driver.findElement(By.className(PESQUISA)).click();
    }

}
