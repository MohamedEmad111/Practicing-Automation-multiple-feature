package Modals;

import Base.BastTests;
import Pages.EntryAdPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ModalsTests extends BastTests {
@Test
public void modalsTestTC1() throws InterruptedException {
    EntryAdPage entryAdPage =homePage.clickonEntryAd();
    Thread.sleep(2000);
    String actual_result=entryAdPage.getmodalText();
    String expected_result="It's commonly";
    assertTrue(actual_result.contains(expected_result));
    entryAdPage.ClickoncloseModalButton();
}

}
