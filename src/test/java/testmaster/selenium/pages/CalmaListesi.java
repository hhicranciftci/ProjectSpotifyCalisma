package testmaster.selenium.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import testmaster.selenium.methods.Methods;

public class CalmaListesi extends Methods {

     public void calmaListesiİcerisi(){
        Assertions.assertTrue(isElementVisible(By.xpath("(//h1[@dir=\"auto\"])[1]"),30));
        clickElement(By.xpath("(//h1[@dir=\"auto\"])[1]"));
        waitBySeconds(3);
        sendKeys(By.xpath("//input[@data-testid=\"playlist-edit-details-name-input\"]"),"Spotify Listem");
        waitBySeconds(3);
        clickElement(By.xpath("//button[@data-testid=\"playlist-edit-details-save-button\"]"));
        waitBySeconds(3);
        Assertions.assertTrue(isElementVisible(By.xpath("//button[@aria-label=\"Spotify Listem – Ayrıntıları düzenler\"]"),30));
        clickElement(By.xpath("//a[@href=\"/search\"]"));


    }
    public void calmaListesiIslemleri(){

         scrollElement(By.xpath("(//button[@data-testid=\"play-button\"])[2]"));
         hoverElement(By.xpath("(//div[@data-testid=\"tracklist-row\"])[2]"));
         clickElement(By.xpath("//button[@aria-label=\"Daft Punk, Julian Casablancas'den Instant Crush (feat. Julian Casablancas) parçasını çal\"]"));
         waitBySeconds(10);
         hoverElement(By.xpath("(//div[@data-testid=\"tracklist-row\"])[2]"));
         clickElement(By.xpath("(//button[@aria-label=\"Duraklat\"])[3]"));
         waitBySeconds(2);
         hoverElement(By.xpath("(//div[@data-testid=\"tracklist-row\"])[3]"));
         clickElement(By.xpath("(//button[@aria-label=\"Daft Punk - Veridis Quo için diğer seçenekler\"])[1]"));
         waitBySeconds(2);
         clickElement(By.xpath("(//span[@class=\"Type__TypeElement-goli3j-0 cPwEdQ ellipsis-one-line PDPsYDh4ntfQE3B4duUI\"])[7]"));
         waitBySeconds(2);
         scrollElementCenter(By.xpath("(//button[@data-testid=\"play-button\"])[2]"));
         waitBySeconds(2);
         clickElement(By.xpath("(//button[@aria-label=\"Spotify Listem için diğer seçenekler\"])[1]"));
         waitBySeconds(2);
         clickElement(By.xpath("(//button[@role=\"menuitem\"])[5]"));
         waitBySeconds(2);
         clickElement(By.xpath("//button[@aria-label=\"Spotify Listem silinsin mi?\"]"));
         waitBySeconds(3);
    }

}
