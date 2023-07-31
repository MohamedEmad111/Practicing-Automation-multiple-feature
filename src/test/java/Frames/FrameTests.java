package Frames;

import Base.BastTests;
import Pages.FramePage;
import org.testng.annotations.Test;

public class FrameTests extends BastTests {
    @Test
    public void frametestTc1() throws InterruptedException {
        FramePage framePage = homePage.clickonFrameLink();
        framePage.clearText();
        framePage.insertText("mohamed emad elbaz");
        framePage.ClickonAlignRightButton();
        Thread.sleep(4000);

    }
}
