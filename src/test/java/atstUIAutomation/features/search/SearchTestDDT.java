package atstUIAutomation.features.search;

import atstUIAutomation.steps.serenity.HeaderSteps;
import atstUIAutomation.steps.serenity.NavigationSteps;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

// Each row of test data needs to be distinguished in the generated reports. By default, Serenity will call the toString() method.
// If you provide a public method returning a String that is annotated by the @Qualifier annotation, then this method will be used to distinguish data sets.
// It should return a value that is unique to each data set.


@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("src/test/java/atstUIAutomation/helpers/searchTerms.csv")
public class SearchTestDDT {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    NavigationSteps navigationSteps;

    @Steps
    HeaderSteps headerSteps;


    public String searchedTerm;
    @Qualifier
    public String getQualifier(){return searchedTerm;}

    public String getSearchedTerm(){return searchedTerm;}
    public void setSearchedTerm(String searchedTerm){this.searchedTerm = searchedTerm;}

    @Test
    public void add_to_cart_searched_product(){
        navigationSteps.navigate_to_homepage();
        //headerSteps.search_product("shirt");
        headerSteps.search_product(getSearchedTerm());
    }



}
