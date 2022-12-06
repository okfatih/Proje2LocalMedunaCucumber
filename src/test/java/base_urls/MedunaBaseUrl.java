package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class MedunaBaseUrl {
    public static  RequestSpecification spec;
    @Before
    public static void medunnaSetup(){
        spec = new RequestSpecBuilder().setBaseUri("https://www.medunna.com/api").build();
    }

}
