package tests;

import base.Base;
import org.testng.annotations.Test;
import pages.FooterPage;

public class FooterTests extends Base {

    @Test
    public void isPresentFooterInPage() { //TC-032
        FooterPage footerPage = new FooterPage(driver);
        footerPage.isFooterPresent();
        footerPage.validationOfFooter(); //Assert en el metodo
    }//isPresentFooterInPage

    @Test
    public void socialMediaLinksIsWorkingInFooterFacebook() {
        FooterPage footerPage = new FooterPage(driver);
        footerPage.isFooterPresent();
        footerPage.validationOfFooter();
        footerPage.clickAndValidateFooterIcon(footerPage.faceIcono, "facebook");
    } // socialMediaLinksIsWorkingInFooter

@Test
public void socialMediaLinksIsWorkingInFooterTwitter() {
    FooterPage footerPage = new FooterPage(driver);
    footerPage.isFooterPresent();
    footerPage.validationOfFooter();
    footerPage.clickAndValidateFooterIcon(footerPage.twitterIcono, "twitter");
}//socialMediaLinksIsWorkingInFooterTwitter
    @Test
    public void socialMediaLinksIsWorkingInFooterInstagram() {
        FooterPage footerPage = new FooterPage(driver);
        footerPage.isFooterPresent();
        footerPage.validationOfFooter();
        footerPage.clickAndValidateFooterIcon(footerPage.instaIcono, "Instagram");
    }//socialMediaLinksIsWorkingInFooterTwitter
}

