package projeto.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuscaTest {


    WebDriver driver;

    final String CELECIONAR = "search-open";
    final String BUSCA = "search-field";
    final String PESQUISA = "search-submit";


    public BuscaTest(WebDriver driver){
        this.driver = driver;
        driver.manage().window().maximize();
    }
    public void realizaBusca(String informacao){

        driver.findElement(By.id(CELECIONAR)).click();
        driver.findElement(By.className(BUSCA)).sendKeys(informacao);
        driver.findElement(By.className(PESQUISA)).click();

    }

    
}
