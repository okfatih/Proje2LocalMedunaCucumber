package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class MedunaBaseUrl {
    public static  RequestSpecification spec;
    public static  RequestSpecification spec1;


    @Before
    public static void medunnaSetup(){
        spec1 = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();

        spec = new RequestSpecBuilder().setBaseUri("https://www.medunna.com/api").build();

    }



}
