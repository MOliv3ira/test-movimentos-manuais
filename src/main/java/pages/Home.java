package pages;

import support.driver.DriverManager;
import support.report.Report;

public class Home extends DriverManager {

    public void acessarSistema() {
        getDriver().get(configuration.url());
        Report.takeScreenShot();

    }
}
