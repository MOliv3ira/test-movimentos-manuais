$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/MovimentosManuais.feature");
formatter.feature({
  "name": "Testar a plataforma do Movimentos Manuais.",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Testar funcionalidade de novo lançamento",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@MovimentosManuais"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que o usuario esta no sistema movimentosManuais",
  "keyword": "Dado "
});
formatter.embedding("image/png", "embedded0.png");
formatter.match({
  "location": "MovimentosManuaisSteps.queOUsuarioEstaNoSistemaMovimentosManuais()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario clicar em novo",
  "keyword": "Quando "
});
formatter.embedding("image/png", "embedded1.png");
formatter.match({
  "location": "MovimentosManuaisSteps.oUsuarioClicarEmNovo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario preenche o campo \"mes\" com \"06\"",
  "keyword": "E "
});
formatter.embedding("image/png", "embedded2.png");
formatter.match({
  "location": "MovimentosManuaisSteps.oUsuarioPreencheOCampoCom(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario preenche o campo \"ano\" com \"2022\"",
  "keyword": "E "
});
formatter.embedding("image/png", "embedded3.png");
formatter.match({
  "location": "MovimentosManuaisSteps.oUsuarioPreencheOCampoCom(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario seleciona o campo produto",
  "keyword": "E "
});
formatter.embedding("image/png", "embedded4.png");
formatter.match({
  "location": "MovimentosManuaisSteps.oUsuarioSelecionaOCampoProduto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario seleciona o campo cosif",
  "keyword": "E "
});
formatter.embedding("image/png", "embedded5.png");
formatter.match({
  "location": "MovimentosManuaisSteps.oUsuarioSelecionaOCampoCosif()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario preenche o campo \"valor\" com \"200,00\"",
  "keyword": "E "
});
formatter.embedding("image/png", "embedded6.png");
formatter.match({
  "location": "MovimentosManuaisSteps.oUsuarioPreencheOCampoCom(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario preenche o campo \"observação\" com \"ESSA MENSAGEM FOI FEITA POR UMA AUTOMAÇÃO\"",
  "keyword": "E "
});
formatter.embedding("image/png", "embedded7.png");
formatter.match({
  "location": "MovimentosManuaisSteps.oUsuarioPreencheOCampoCom(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuaria clicar em incluir",
  "keyword": "Entao "
});
formatter.embedding("image/png", "embedded8.png");
formatter.match({
  "location": "MovimentosManuaisSteps.usuariaClicarEmIncluir()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});