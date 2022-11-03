import clinic.database.*;

public class Demo {
  public static void main(String[] args) {
    MedDB med = new MedDB();
    DoctorDB doc = new DoctorDB();
    NurseDB nur = new NurseDB();
    PatientDB pat = new PatientDB();

    med.insert("Melatonin", "2819", 2.90, 300);
    med.insert("Paracetamol", "5832", 2.40, 300);
    med.insert("Doxycycline", "8102", 1.90, 300);
    med.insert("Cyclobenzaprine", "1085", 2.20, 300);
    med.insert("Acetaminophen", "4952", 1.20, 300);

    med.printData();
    System.out.println();

    doc.insert("Emma", "781563", "Surgeon");
    doc.insert("William", "854296", "Psychologist");
    doc.insert("Noah", "547312", "Anesthesiologist");
    doc.insert("Michael", "154864", "Cardiologist");
    doc.insert("Oliver", "842271", "Dermatologist");

    doc.printData();
    System.out.println();

    nur.insert("Amelia", "365578", "Registered nurse");
    nur.insert("Sophia", "765862", "Licensed practical nurse");
    nur.insert("Evelyn", "679120", "Medical-surgical nurse");
    nur.insert("Isabella", "125697", "Intensive care unit");
    nur.insert("Charlotte", "812547", "Emergency room nurse");

    nur.printData();
    System.out.println();

    pat.insert("875412", "59431587", "Hai Nam", 20, true, "10/03/2002", "Ho Chi Minh", "District 12");
    pat.insert("548135", "94515753", "Thi No", 22, false, "20/09/2000", "Ho Chi Minh", "District 9");
    pat.insert("489302", "78512567", "Chi Pheo", 24, true, "16/10/1998", "Ho Chi Minh", "District 7");
    pat.insert("265874", "01367639", "Lao Hac", 80, true, "05/03/1942", "Ha Noi", "District Tan Binh");
    pat.insert("057795", "00358774", "Be Thu", 10, false, "06/08/2012", "Ho Chi Minh", "District 1");

    pat.printData();
    System.out.println();
  }
}
