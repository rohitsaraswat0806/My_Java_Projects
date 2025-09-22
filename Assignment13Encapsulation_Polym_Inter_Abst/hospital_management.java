package Assignment13Encapsulation_Polym_Inter_Abst;
	import java.util.ArrayList;
	import java.util.List;

	interface MedicalRecord {
	    void addRecord(String record);
	    void viewRecords();
	}


	abstract class Patient implements MedicalRecord {
	    protected int patientId;
	    protected String name;
	    protected int age;

	    private String diagnosis;
	    private List<String> medicalHistory;

	    public Patient(int patientId, String name, int age) {
	        this.patientId = patientId;
	        this.name = name;
	        this.age = age;
	        this.medicalHistory = new ArrayList<>();
	    }

	    public abstract double calculateBill();

	
	    public String getPatientDetails() {
	        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
	    }

	    public void setDiagnosis(String diagnosis) {
	        this.diagnosis = diagnosis;
	    }

	    public String getDiagnosis() {
	        return this.diagnosis;
	    }

	    public void addRecord(String record) {
	        this.medicalHistory.add(record);
	        System.out.println("Record added for patient " + this.name);
	    }

	    public void viewRecords() {
	        System.out.println("--- Medical History for " + name + " ---");
	        if (medicalHistory.isEmpty()) {
	            System.out.println("No records found.");
	        } else {
	            for (String record : medicalHistory) {
	                System.out.println("- " + record);
	            }
	        }
	        System.out.println("------------------------------------");
	    }
	}

	class InPatient extends Patient {
	    private int daysAdmitted;
	    private double roomChargePerDay;

	    public InPatient(int patientId, String name, int age, int daysAdmitted, double roomChargePerDay) {
	        super(patientId, name, age);
	        this.daysAdmitted = daysAdmitted;
	        this.roomChargePerDay = roomChargePerDay;
	    }

	    public double calculateBill() {
	        System.out.println("Calculating In-Patient Bill...");
	        return this.daysAdmitted * this.roomChargePerDay;
	    }
	}


	class OutPatient extends Patient {
	    private double consultationFee;
	    private double testCharges;

	    public OutPatient(int patientId, String name, int age, double consultationFee, double testCharges) {
	        super(patientId, name, age);
	        this.consultationFee = consultationFee;
	        this.testCharges = testCharges;
	    }

	    public double calculateBill() {
	        System.out.println("Calculating Out-Patient Bill...");
	        return this.consultationFee + this.testCharges;
	    }
	}

	public class hospital_management {
	    public static void main(String[] args) {
	     
	        Patient inPatient = new InPatient(101, "Amit Sharma", 45, 5, 2500.0);
	        inPatient.setDiagnosis("Pneumonia");
	        inPatient.addRecord("Admitted on Sept 17, 2025. Prescribed antibiotics.");
	        inPatient.addRecord("Condition stable. Vitals normal on Sept 18, 2025.");


	        Patient outPatient = new OutPatient(202, "Priya Singh", 30, 800.0, 1500.0);
	        outPatient.setDiagnosis("Common Cold");
	        outPatient.addRecord("Visited on Sept 22, 2025. Prescribed medication for flu symptoms.");

	       
	        Patient[] patients = {inPatient, outPatient};

	        System.out.println("\n--- Processing Patient Records and Bills ---\n");

	        for (Patient patient : patients) {
	            System.out.println("==========================================");
	            System.out.println(patient.getPatientDetails());
	            System.out.println("Diagnosis: " + patient.getDiagnosis());
	            patient.viewRecords();

	            double bill = patient.calculateBill();
	            System.out.printf("Total Bill Amount: ₹%.2f\n", bill);
	            System.out.println("==========================================\n");
	        }
	    }
	}


