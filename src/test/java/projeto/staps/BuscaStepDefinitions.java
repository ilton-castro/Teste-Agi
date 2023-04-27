package projeto.staps;

import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import projeto.tests.BuscaSqlInje;
import projeto.tests.BuscaTest;
import projeto.tests.ResultadoBusca;
import projeto.tests.ResultadoSqlInje;

import java.util.concurrent.TimeUnit;

public class BuscaStepDefinitions {
    WebDriver driver;
    @Before
    public void before(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @After
    public void after(){
        driver.quit();
    }
    @Dado("que esteja na pagina: {string}")
    public void que_esteja_na_pagina(String url) {
        driver.get(url);
    }
    @Quando("realizado uma busca {string}")
    public void realizado_uma_busca(String informacao) {

        BuscaTest buscaTest = new BuscaTest(driver);
        buscaTest.realizaBusca(informacao);
    }
    @Então("o resultado é apresentado na tela {string}")
    public void o_resultado_é_apresentado_na_tela(String retornoBusca) {
        ResultadoBusca resultadoBusca = new  ResultadoBusca(driver);
        resultadoBusca.clicarBusca();
        Assert.assertEquals(retornoBusca, resultadoBusca.retornoPesquisa());
    }
    @Quando("realizado uma busca com o comando {string}")
    public void realizado_uma_busca_com_o_comando(String select) {
        BuscaSqlInje buscaSqlInje = new BuscaSqlInje(driver);
        buscaSqlInje.realizaBuscaSqlInj(select);

    }
    @Então("resultado é apresentado na tela {string}")
    public void resultado_é_apresentado_na_tela(String retornoSqlInj) {
        ResultadoSqlInje resultadoSqlInje = new ResultadoSqlInje(driver);
        resultadoSqlInje.clicarBusc();
        Assert.assertEquals(retornoSqlInj, resultadoSqlInje.retornoSqlInj());

    }

}
