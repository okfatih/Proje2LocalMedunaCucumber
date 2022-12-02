package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CountryStateOuterPojo {
    private  Integer id;
    private  String name;
    private CountryStateInnerPojo country;

    public CountryStateOuterPojo(Integer id, String name, CountryStateInnerPojo country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public CountryStateOuterPojo() {
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

    public CountryStateInnerPojo getCountry() {
        return country;
    }

    public void setCountry(CountryStateInnerPojo country) {
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
