package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class MedunaBaseUrl {
    protected RequestSpecification spec;
    @Before
    public void setup(){
        spec = new RequestSpecBuilder().setBaseUri("https://www.medunna.com/api").build();
    }

}
