package Papierowe;

import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SetupPaperTest extends Setup{
    @Test

//    public void StartSell(){
//        this.driver = driver;
//        setupPaperPage setupPaperPage = new setupPaperPage(driver);
//        setupPaperPage.Enterpaper();
//        setupPaperPage.Ticket("1R nor.MP");
//        setupPaperPage.AfterPaper();
//    }

    public void SellWroclawTicketsPart1() {
        List<String> ticketsList = readTicketsFromFile("src/test/resources/bilet/bilety.txt");
        if (ticketsList.isEmpty()) {
            System.out.println("Brak dostępnych biletów do przetestowania.");
            return;
        }

        for (String ticket : ticketsList) {
            setupPaperPage setupPaperPage = new setupPaperPage(driver);
            setupPaperPage.Enterpaper();
            setupPaperPage.Ticket(ticket);
            setupPaperPage.AfterPaper();
        }
    }

    private List<String> readTicketsFromFile(String filePath) {
        List<String> tickets = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                tickets.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tickets;
    }
@Test
    public void SellWroclawTicketsPart2() {
        List<String> ticketsList = readTicketsFromFile1("src/test/resources/bilet/bilety.txt");
        if (ticketsList.isEmpty()) {
            System.out.println("Brak dostępnych biletów do przetestowania.");
            return;
        }

        for (String ticket : ticketsList) {
            setupPaperPage setupPaperPage = new setupPaperPage(driver);
            setupPaperPage.Enterpaper();
            setupPaperPage.Ticket(ticket);
            setupPaperPage.AfterPaper();
        }
    }

    private List<String> readTicketsFromFile1(String filePath) {
        List<String> tickets = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                tickets.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tickets;
    }



@Test
    public void SellOneTicket(){

        setupPaperPage setupPaperPage = new setupPaperPage(driver);
        setupPaperPage.Enterpaper();
        setupPaperPage.Ticket("168-godz.w.l. N");
        setupPaperPage.AfterPaper();
    }
    @Test
    public void SellOneTicketWhithScroll() {

        setupPaperPage setupPaperPage = new setupPaperPage(driver);
        setupPaperPage.Enterpaper();
        setupPaperPage.Scroll();
        setupPaperPage.Ticket("168-godz.w.l. N");
        setupPaperPage.AfterPaper();
    }

}
