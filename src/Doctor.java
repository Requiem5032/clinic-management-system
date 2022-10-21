class Doctor {
    public static void main(String[] args) {
        MedDB.HashTable db = new MedDB.HashTable();

        MedDB.Med m1 = new MedDB.Med("Paracetamol", 001, 3.90, 400);
        MedDB.Med m2 = new MedDB.Med("Aspirin", 002, 5.90, 300);
        MedDB.Med m3 = new MedDB.Med("Benzonatate", 003, 2.90, 450);
        MedDB.Med m4 = new MedDB.Med("Melatonin", 004, 4.50, 600);
        MedDB.Med m5 = new MedDB.Med("Entyvio", 005, 3.70, 250);

        db.insert(m1);
        db.insert(m2);
        db.insert(m3);
        db.insert(m4);
        db.insert(m5);

        db.del(m5);

        db.printTable();

        System.out.println("\nThe searched result: ");
        db.search("Melatonin");
    }
}
