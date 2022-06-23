package pages;

import org.openqa.selenium.By;
import support.Action;
import support.driver.DriverManager;
import support.report.Report;

public class NewInclude extends DriverManager {

    private By btnNovo = By.id("btnNovo");
    private By inputObservacao = By.id("txtObservacao");
    private By inputValor = By.id("txtValor");
    private By inputAno = By.id("txtAno");
    private By inputMes = By.id("txtMes");
    private By ddlProduto = By.xpath("//*[@name='ddlProduto']");
    private By ddlSelectProduct = By.xpath("//*[contains(text(),' Produto 01 ')]");
    private By ddlCosif = By.xpath("//*[@name='ddlCosif']");
    private By ddlSelectCosif = By.xpath("//*[contains(text(), ' COSIF 07 ')]");
    private By btnIncluir = By.xpath("//*[contains(text(),'Incluir')]");

    public void novoLancamento() {
        Action.getVisibleElement(btnNovo);
        getDriver().findElement(btnNovo).click();
        Report.takeScreenShot();
    }

    public void preencherCampo(String field, String value) {
        switch (field) {
            case "mes": fillMes(value);break;
            case "ano": fillAno(value);break;
            case "valor": fillValor(value);break;
            case "observação": fillObservacao(value);break;
        }
    }

    private void fillObservacao(String value) {
        Action.getVisibleElement(inputObservacao);
        getDriver().findElement(inputObservacao).sendKeys(value);
        Report.takeScreenShot();
    }

    private void fillValor(String value) {
        Action.getVisibleElement(inputValor);
        getDriver().findElement(inputValor).sendKeys(value);
        Report.takeScreenShot();
    }

    private void fillAno(String value) {
        Action.getVisibleElement(inputAno);
        getDriver().findElement(inputAno).sendKeys(value);
        Report.takeScreenShot();
    }

    private void fillMes(String value) {
        Action.getVisibleElement(inputMes);
        getDriver().findElement(inputMes).sendKeys(value);
        Report.takeScreenShot();
    }

    public void selecionarCampoProduto() {

        Action.getVisibleElement(ddlProduto);
        getDriver().findElement(ddlProduto).click();

        Action.getVisibleElement(ddlSelectProduct);
        getDriver().findElement(ddlSelectProduct).click();

        Report.takeScreenShot();
    }

    public void selecionarCampoCosif() {
        Action.getVisibleElement(ddlCosif);
        getDriver().findElement(ddlCosif).click();

        Action.getVisibleElement(ddlSelectCosif);
        getDriver().findElement(ddlSelectCosif).click();

        Report.takeScreenShot();
    }

    public void clicarIncluir() {
        Action.getVisibleElement(btnIncluir);
        getDriver().findElement(btnIncluir).click();

        Report.takeScreenShot();
    }
}
