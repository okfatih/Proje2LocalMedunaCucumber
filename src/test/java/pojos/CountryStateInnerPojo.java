package pojos;

public class CountryStateInnerPojo {
    private Integer id;
    private String name;

    public CountryStateInnerPojo(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public CountryStateInnerPojo() {
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
        return "CountryInnerPojo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
