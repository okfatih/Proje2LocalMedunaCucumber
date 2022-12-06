package pojos;

public class MedunnaCountryPojo {
    private Integer id;
    private String name;

    public MedunnaCountryPojo(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    public MedunnaCountryPojo(){

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

    @Override
    public String toString() {
        return "CountryPojo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
