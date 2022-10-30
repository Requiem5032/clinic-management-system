package admin;

class Doctor extends Employee {
  String pos;

  Doctor() {
    super();
  }

  Doctor(String name, String ID, String pos) {
    super(name, ID);
    this.pos = pos;
  }

  String getPos() {
    return pos;
  }

  void setPos(String pos) {
    this.pos = pos;
  }

  public static void main(String[] args) {
    MedDB.insertMed("Paracetamol", "001", 3.90, 400);
    MedDB.insertMed("Aspirin", "002", 5.90, 300);
    MedDB.insertMed("Benzonatate", "003", 2.90, 450);
    MedDB.insertMed("Melatonin", "004", 4.50, 600);
    MedDB.insertMed("Entyvio", "005", 3.70, 250);
    MedDB.insertMed("Methamphetamine", "006", 20.90, 500);

    MedDB.removeMed("Entyvio");

    MedDB.table.printMedList();

    System.out.println("\nThe searched result: ");
    MedDB.table.search("Melatonin");
  }
}
