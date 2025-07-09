package tests;

import com.cube.qa.framework.utils.BaseTest;
import org.testng.annotations.Test;

public class SearchTests extends BaseTest {

    @Test(groups = {"wip"})
    public void selectSearchResult() {
        continueAsGuest();
        learnPageFull.isSearchFieldVisible();
        learnPageFull.tapSearchField();
        learnPageFull.enterSearchTerm("test\n");
        searchScreen.tapFirstResultButton();
        searchResult.isPageTitleVisible();
    }
}
