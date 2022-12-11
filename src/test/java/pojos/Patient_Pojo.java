package pojos;


import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Patient_Pojo {
    private String createdBy;
    private String CreatedDate;
    private int id;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String phone;
    private String gender;
    private String bloodGroup;
    private String adress;
    private String email;
    private String description;
    private UserPojo user;
    private String inPatients;
    private MedunnaCountryPojo country;
    private String cstate;

    public Patient_Pojo(String createdBy, String createdDate, int id, String firstName, String lastName, String birthDate, String phone, String gender, String bloodGroup, String adress, String email, String description, UserPojo user, String inPatients, MedunnaCountryPojo country, String cstate) {

        this.createdBy = createdBy;
        CreatedDate = createdDate;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.adress = adress;
        this.email = email;
        this.description = description;
        this.user = user;
        this.inPatients = inPatients;
        this.country = country;
        this.cstate = cstate;
    }

    public Patient_Pojo() {
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(String createdDate) {
        CreatedDate = createdDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserPojo getUser() {
        return user;
    }

    public void setUser(UserPojo user) {
        this.user = user;
    }

    public String getInPatients() {
        return inPatients;
    }

    public void setInPatients(String inPatients) {
        this.inPatients = inPatients;
    }

    public MedunnaCountryPojo getCountry() {
        return country;
    }

    public void setCountry(MedunnaCountryPojo country) {
        this.country = country;
    }

    public String getCstate() {
        return cstate;
    }

    public void setCstate(String cstate) {
        this.cstate = cstate;
    }

    @Override
    public String toString() {
        return "PatientPojo{" +
                "createdBy='" + createdBy + '\'' +
                ", CreatedDate='" + CreatedDate + '\'' +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", adress='" + adress + '\'' +
                ", email='" + email + '\'' +
                ", description='" + description + '\'' +
                ", user=" + user +
                ", inPatients='" + inPatients + '\'' +
                ", country='" + country + '\'' +
                ", cstate='" + cstate + '\'' +
                '}';
    }
}