package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.Home;
import pages.NewInclude;

public class MovimentosManuaisSteps {
    private Home home = new Home();
    private NewInclude include = new NewInclude();

    @Dado("que o usuario esta no sistema movimentosManuais")
    public void queOUsuarioEstaNoSistemaMovimentosManuais(){
        home.acessarSistema();
    }

    @Quando("o usuario clicar em novo")
    public void oUsuarioClicarEmNovo() {
        include.novoLancamento();
    }

    @E("o usuario preenche o campo {string} com {string}")
    public void oUsuarioPreencheOCampoCom(String field, String value) {
        include.preencherCampo(field, value);
    }

    @E("o usuario seleciona o campo produto")
    public void oUsuarioSelecionaOCampoProduto() {
        include.selecionarCampoProduto();
    }

    @E("o usuario seleciona o campo cosif")
    public void oUsuarioSelecionaOCampoCosif() {
        include.selecionarCampoCosif();
    }

    @Entao("usuaria clicar em incluir")
    public void usuariaClicarEmIncluir() {
        include.clicarIncluir();
    }
}
