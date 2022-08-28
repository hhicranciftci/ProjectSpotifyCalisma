package testmaster.selenium.pages;

import org.openqa.selenium.By;
import testmaster.selenium.methods.Methods;

public class AraSayfası extends Methods {
    public void sarkıArama(){
        sendKeys(By.xpath("//input[@data-testid=\"search-input\"]"),"Daft Punk");
        waitBySeconds(3);
        clickElement(By.xpath("(//button[@role=\"checkbox\"])[3]"));
        waitBySeconds(3);

    }
    public void sarkıEkleme(){
        hoverElement(By.xpath("(//div[@data-testid=\"tracklist-row\"])[1]"));
        clickElement(By.xpath("//button[@aria-label=\"Daft Punk, Pharrell Williams, Nile Rodgers - Get Lucky (feat. Pharrell Williams & Nile Rodgers) - Radio Edit için diğer seçenekler\"]"));
        waitBySeconds(3);
        hoverElement(By.xpath("(//button[@role=\"menuitem\"])[6]"));
        clickElement(By.xpath("(//button[@role=\"menuitem\"])[8]"));
        waitBySeconds(1);
        //1.
        hoverElement(By.xpath("(//div[@data-testid=\"tracklist-row\"])[2]"));
        clickElement(By.xpath("//button[@aria-label=\"Daft Punk, Julian Casablancas - Instant Crush (feat. Julian Casablancas) için diğer seçenekler\"]"));
        waitBySeconds(3);
        hoverElement(By.xpath("(//button[@role=\"menuitem\"])[6]"));
        clickElement(By.xpath("(//button[@role=\"menuitem\"])[8]"));
        waitBySeconds(1);
        //2
        hoverElement(By.xpath("(//div[@data-testid=\"tracklist-row\"])[3]"));
        clickElement(By.xpath("//button[@aria-label=\"Daft Punk - Veridis Quo için diğer seçenekler\"]"));
        waitBySeconds(3);
        hoverElement(By.xpath("(//span[@class=\"Type__TypeElement-goli3j-0 cPwEdQ ellipsis-one-line\"])[1]"));
        clickElement(By.xpath("(//span[@class=\"Type__TypeElement-goli3j-0 cPwEdQ ellipsis-one-line PDPsYDh4ntfQE3B4duUI\"])[8]"));
        waitBySeconds(1);
        //3
        clickElement(By.xpath("(//li[@role=\"listitem\"])[1]"));
        waitBySeconds(2);

    }
}
