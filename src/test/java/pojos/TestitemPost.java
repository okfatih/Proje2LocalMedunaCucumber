package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TestitemPost {
    private String name;
    private Double price;

    public TestitemPost(String name, Double price) {
        this.name = name;
       this.price = price;
    }
    private TestitemPost(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TestitemPost{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
