# language: pt
# charset: UTF-8

  Funcionalidade: Testar a plataforma do Movimentos Manuais.

    @MovimentosManuais
    Cenario: Testar funcionalidade de novo lançamento
      Dado que o usuario esta no sistema movimentosManuais
      Quando o usuario clicar em novo
      E o usuario preenche o campo "mes" com "06"
      E o usuario preenche o campo "ano" com "2022"
      E o usuario seleciona o campo produto
      E o usuario seleciona o campo cosif
      E o usuario preenche o campo "valor" com "200,00"
      E o usuario preenche o campo "observação" com "ESSA MENSAGEM FOI FEITA POR UMA AUTOMAÇÃO"
      Entao usuaria clicar em incluir
