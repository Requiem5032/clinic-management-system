import clinic.database.*;

public class Demo {
  public static void main(String[] args) {
    MedDB med = new MedDB();
    med.insertMed("Melatonin", "2819", 2.90, 300);
    med.insertMed("Paracetamol", "5832", 2.40, 300);
    med.insertMed("Doxycycline", "8102", 1.90, 300);
    med.insertMed("Cyclobenzaprine", "1085", 2.20, 300);
    med.insertMed("Acetaminophen", "4952", 1.20, 300);

    med.printData();
  }
}
