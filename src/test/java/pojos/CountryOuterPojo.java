package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CountryOuterPojo {
    private  Integer id;
    private  String name;
    private CountryInnerPojo country;

    public CountryOuterPojo(Integer id, String name, CountryInnerPojo country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public CountryOuterPojo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CountryInnerPojo getCountry() {
        return country;
    }

    public void setCountry(CountryInnerPojo country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "CountryOuterPojo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country=" + country +
                '}';
    }
}
