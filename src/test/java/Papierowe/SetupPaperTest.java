package Papierowe;

import org.testng.annotations.Test;

public class SetupPaperTest extends Setup{
    @Test

    public void StartSell(){
        this.driver = driver;
        setupPaperPage setupPaperPage = new setupPaperPage(driver);
        setupPaperPage.Enterpaper();
        setupPaperPage.Ticket("1R nor.MP");
        setupPaperPage.AfterPaper();
    }
}
