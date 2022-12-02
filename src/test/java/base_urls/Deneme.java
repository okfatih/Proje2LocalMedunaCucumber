package base_urls;

import org.testng.annotations.Test;
import pojos.CountryStateInnerPojo;
import pojos.CountryStateOuterPojo;

public class Deneme {
    @Test
    public void testName() {
        CountryStateInnerPojo countryInnerPojo = new CountryStateInnerPojo(124,"Adana");
        System.out.println("countryInnerPojo = " + countryInnerPojo);
        CountryStateOuterPojo countryOuterPojo = new CountryStateOuterPojo(125,"Tarsus",countryInnerPojo);
        System.out.println("countryOuterPojo = " + countryOuterPojo);
    }
}
