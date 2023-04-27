# language: pt
  Funcionalidade: Gerencimaneto de busca na Petstore


    Cenario: Realizar uma busca
      Dado   que esteja na pagina: "https://blogdoagi.com.br/"
      Quando realizado uma busca "AGI"
      Então  o resultado é apresentado na tela "Agibank registra aumento de 121,7% em pagamentos por aproximação no primeiro trimestre de 2023"


      Cenario: Realizar SQL INJECTION
        Dado que esteja na pagina: "https://blogdoagi.com.br/"
        Quando realizado uma busca com o comando "SELECT * FROM Users; DROP TABLE Suppliers"
        Então  resultado é apresentado na tela "Nenhum resultado"



