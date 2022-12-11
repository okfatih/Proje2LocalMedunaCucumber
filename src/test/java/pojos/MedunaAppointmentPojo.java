//package pojos;
//
//import org.codehaus.jackson.annotate.JsonIgnoreProperties;
//
//@JsonIgnoreProperties(ignoreUnknown = true)
//public class MedunaAppointmentPojo {
//    private String createdBy;
//    private String createdDate;
//    private int id;
//    private String startDate;
//    private String endDate;
//    private String status;
//    private String anamnesis;
//    private String treatment;
//    private String diagnosis;
//    private String prescription;
//    private String description;
//    private PhysicianPojo physician;
//    private Patient_Pojo patientPojo;
//    private String ctests;
//
//    public MedunaAppointmentPojo(String createdBy, String createdDate, int id, String startDate, String endDate, String status, String anamnesis, String treatment, Object diagnosis, Object prescription, Object description, PhysicianPojo physician, Patient_Pojo patientPojo, Object ctests) {
//
//        this.createdBy = createdBy;
//        this.createdDate = createdDate;
//        this.id = id;
//        this.startDate = startDate;
//        this.endDate = endDate;
//        this.status = status;
//        this.anamnesis = anamnesis;
//        this.treatment = treatment;
//        this.diagnosis = diagnosis;
//        this.prescription = prescription;
//        this.description = description;
//        this.physician = physician;
//        this.patientPojo = patientPojo;
//        this.ctests = ctests;
//    }
//
//    public MedunaAppointmentPojo() {
//    }
//
//    public String getCreatedBy() {
//        return createdBy;
//    }
//
//    public void setCreatedBy(String createdBy) {
//        this.createdBy = createdBy;
//    }
//
//    public String getCreatedDate() {
//        return createdDate;
//    }
//
//    public void setCreatedDate(String createdDate) {
//        this.createdDate = createdDate;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getStartDate() {
//        return startDate;
//    }
//
//    public void setStartDate(String startDate) {
//        this.startDate = startDate;
//    }
//
//    public String getEndDate() {
//        return endDate;
//    }
//
//    public void setEndDate(String endDate) {
//        this.endDate = endDate;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    public String getAnamnesis() {
//        return anamnesis;
//    }
//
//    public void setAnamnesis(String anamnesis) {
//        this.anamnesis = anamnesis;
//    }
//
//    public Object getTreatment() {
//        return treatment;
//    }
//
//    public void setTreatment(Object treatment) {
//        this.treatment = treatment;
//    }
//
//    public Object getDiagnosis() {
//        return diagnosis;
//    }
//
//    public void setDiagnosis(Object diagnosis) {
//        this.diagnosis = diagnosis;
//    }
//
//    public Object getPrescription() {
//        return prescription;
//    }
//
//    public void setPrescription(Object prescription) {
//        this.prescription = prescription;
//    }
//
//    public Object getDescription() {
//        return description;
//    }
//
//    public void setDescription(Object description) {
//        this.description = description;
//    }
//
//    public PhysicianPojo getPhysicianPojo() {
//        return physician;
//    }
//
//    public void setPhysicianPojo(PhysicianPojo physicianPojo) {
//        this.physician = physicianPojo;
//    }
//
//    public Patient_Pojo getPatientPojo() {
//        return patientPojo;
//    }
//
//    public void setPatientPojo(Patient_Pojo patientPojo) {
//        this.patientPojo = patientPojo;
//    }
//
//    public Object getCtests() {
//        return ctests;
//    }
//
//    public void setCtests(Object ctests) {
//        this.ctests = ctests;
//    }
//
//    @Override
//    public String toString() {
//        return "MedunaAppointmentPojo{" +
//                "createdBy='" + createdBy + '\'' +
//                ", createdDate='" + createdDate + '\'' +
//                ", id=" + id +
//                ", startDate='" + startDate + '\'' +
//                ", endDate='" + endDate + '\'' +
//                ", status='" + status + '\'' +
//                ", anamnesis='" + anamnesis + '\'' +
//                ", treatment=" + treatment +
//                ", diagnosis=" + diagnosis +
//                ", prescription=" + prescription +
//                ", description=" + description +
//                ", physicianPojo=" + physician +
//                ", patientPojo=" + patientPojo +
//                ", ctests=" + ctests +
//                '}';
//    }
//}
