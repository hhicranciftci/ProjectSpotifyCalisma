package testmaster.selenium.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import testmaster.selenium.methods.Methods;

public class HomePage extends Methods{

    Methods methods;

    public HomePage(){

        methods = new Methods();
    }

    public boolean loginControl(){

        Assertions.assertTrue(isElementVisible(By.xpath("//button[@data-testid=\"user-widget-link\"]"),30));
        return true;

    }
    public void calmaListesiCreate(){
        Assertions.assertTrue(isElementVisible(By.xpath("//div[@class=\"GlueDropTarget GlueDropTarget--albums GlueDropTarget--tracks GlueDropTarget--local-tracks GlueDropTarget--episodes GlueDropTarget--playlists GlueDropTarget--folders\"]"),30));
        clickElement(By.xpath("//button[@data-testid=\"create-playlist-button\"]"));
        waitBySeconds(3);
    }
}
