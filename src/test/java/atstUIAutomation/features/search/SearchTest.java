package atstUIAutomation.features.search;

import atstUIAutomation.steps.serenity.HeaderSteps;
import atstUIAutomation.steps.serenity.NavigationSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


@RunWith(SerenityRunner.class)
public class SearchTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

/*    @Before
    public void initTest(){
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.WINDOWS);
        try {
            webdriver = new RemoteWebDriver(new URL("http://192.168.56.1:4444/wd/hub"), cap);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
*/
    @Steps
    NavigationSteps navigationSteps;

    @Steps
    HeaderSteps headerSteps;

    @Test
    public void add_to_cart_searched_product_dress(){
        navigationSteps.navigate_to_homepage();
        headerSteps.search_product("dress");
    }


    @Test
    public void add_to_cart_searched_product_pants(){
        navigationSteps.navigate_to_homepage();
        headerSteps.search_product("pants");
    }

    @Test
    public void add_to_cart_searched_product_shirt(){
        navigationSteps.navigate_to_homepage();
        headerSteps.search_product("shirt");
    }

}
