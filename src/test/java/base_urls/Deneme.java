package base_urls;

import org.testng.annotations.Test;
import pojos.CountryInnerPojo;
import pojos.CountryOuterPojo;

public class Deneme {
    @Test
    public void testName() {
        CountryInnerPojo countryInnerPojo = new CountryInnerPojo(124,"Adana");
        System.out.println("countryInnerPojo = " + countryInnerPojo);
        CountryOuterPojo countryOuterPojo = new CountryOuterPojo(125,"Tarsus",countryInnerPojo);
        System.out.println("countryOuterPojo = " + countryOuterPojo);
    }
}
