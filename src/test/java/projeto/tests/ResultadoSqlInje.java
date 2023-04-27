package projeto.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultadoSqlInje {
    WebDriver driver;
    final String R_VALIDA = "//div[@id='primary']/section/header/h1";
    final String R_CLICAR = "entry-title";
    public ResultadoSqlInje(WebDriver driver){
        this.driver = driver;
        driver.manage().window().maximize();
    }
    public void clicarBusc(){
        driver.findElement(By.className(R_CLICAR)).click();
    }
    public String retornoSqlInj(){
        return driver.findElement(By.xpath(R_VALIDA)).getText();
    }
}
