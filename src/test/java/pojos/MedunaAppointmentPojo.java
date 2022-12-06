package pojos;

public class MedunaAppointmentPojo {
    private String createdBy;
    private String createdDate;
    private Integer id;
    private String startDate;
    private String endDate;
    private String status;
    private String anamnesis;
    private String treatment;
    private String diagnosis;
    private String prescription;
    private String description;
    private MedunnaPhysicianPojo physicianPojo;
    private MedunaPatientPojo patientPojo;
    private String ctests;


    public MedunaAppointmentPojo(String createdBy, String createdDate, Integer id, String startDate, String endDate, String status, String anamnesis, String treatment, String diagnosis, String prescription, String description, MedunnaPhysicianPojo physicianPojo, MedunaPatientPojo patientPojo, String ctests) {

        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.anamnesis = anamnesis;
        this.treatment = treatment;
        this.diagnosis = diagnosis;
        this.prescription = prescription;
        this.description = description;
        this.physicianPojo = physicianPojo;
        this.patientPojo = patientPojo;
        this.ctests = ctests;
    }

    public MedunaAppointmentPojo() {

    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAnamnesis() {
        return anamnesis;
    }

    public void setAnamnesis(String anamnesis) {
        this.anamnesis = anamnesis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MedunnaPhysicianPojo getPhysicianPojo() {
        return physicianPojo;
    }

    public void setPhysicianPojo(MedunnaPhysicianPojo physicianPojo) {
        this.physicianPojo = physicianPojo;
    }

    public MedunaPatientPojo getPatientPojo() {
        return patientPojo;
    }

    public void setPatientPojo(MedunaPatientPojo patientPojo) {
        this.patientPojo = patientPojo;
    }

    public String getCtests() {
        return ctests;
    }

    public void setCtests(String ctests) {
        this.ctests = ctests;
    }

    @Override
    public String toString() {
        return "MedunaAppointmentPojo{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", id=" + id +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", status='" + status + '\'' +
                ", anamnesis='" + anamnesis + '\'' +
                ", treatment='" + treatment + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", prescription='" + prescription + '\'' +
                ", description='" + description + '\'' +
                ", physicianPojo=" + physicianPojo +
                ", patientPojo=" + patientPojo +
                ", ctests='" + ctests + '\'' +
                '}';
    }
}
