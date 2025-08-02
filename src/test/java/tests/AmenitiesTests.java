package tests;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmenitiesPage;
import pages.BookingPage;

public class AmenitiesTests extends Base {


    @Test
    public void ValidateSectionOfAmenities (){  //TC-016, TC-019
        AmenitiesPage amenities = new AmenitiesPage(driver);
        amenities.clickOnAmenities();
        boolean sectionVisible = amenities.isAmenitiesSectionDisplayed(); //debe fallar

        Assert.assertTrue(sectionVisible, "La sección de Amenities NO se mostró, pero esperábamos que SÍ cargara.");



    }//ValidateSectionOfAmenities
}//AmenitiesTests
