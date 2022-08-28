package testmaster.selenium.test;

import org.junit.jupiter.api.Test;
import testmaster.selenium.driver.Driver;
import testmaster.selenium.pages.*;

public class SpotifyTest extends Driver {

    GuestPage guestPage;
    LoginPage loginPage;
    HomePage homePage;

    CalmaListesi calmaListesi;

    AraSayfası araSayfası;

    @Test
    public void loginTest(){

        /**
        https://github.com/YunusBalaman/TestmasterSeleniumProject
         */
        System.out.println("Spotify");
        init();
        guestPage.controlGuestPage();
        guestPage.clickLoginButton();
        loginPage.controlLoginPage();
        loginPage.validLogin("hicrancciftci@gmail.com","hhh122448.");
        homePage.loginControl();
        homePage.calmaListesiCreate();
        calmaListesi.calmaListesiİcerisi();
        araSayfası.sarkıArama();
        araSayfası.sarkıEkleme();
        calmaListesi.calmaListesiIslemleri();

    }

    public void init(){

        guestPage = new GuestPage();
        loginPage = new LoginPage();
        homePage = new HomePage();
        calmaListesi = new CalmaListesi();
        araSayfası = new AraSayfası();

    }
}
