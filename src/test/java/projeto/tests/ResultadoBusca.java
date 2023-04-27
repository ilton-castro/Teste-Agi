package projeto.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultadoBusca {

    WebDriver driver;

    final String R_VALIDA = "//article[@id='post-3394']/header/div[2]/h1";
    final String R_CLICAR = "//a[contains(text(),'Agibank registra aumento de 121,7% em pagamentos por aproximação no primeiro trimestre de 2023')]";

    public ResultadoBusca(WebDriver driver){
        this.driver = driver;
        driver.manage().window().maximize();
    }
    public void clicarBusca(){
        driver.findElement(By.xpath(R_CLICAR)).click();
    }
    public String retornoPesquisa(){
        return driver.findElement(By.xpath(R_VALIDA)).getText();
    }

}
