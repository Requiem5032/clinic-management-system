import clinic.controller.*;

public class Demo {
  public static void main(String[] args) throws Exception {
    DoctorController doctorCtrl = new DoctorController();
    NurseController nurseCtrl = new NurseController();
    MedController medCtrl = new MedController();
    PatientController patientCtrl = new PatientController();

    // clinic.view.doctor.Add addDoc = new clinic.view.doctor.Add();
    // addDoc.setVisible(true);

    // clinic.view.nurse.Add addNur = new clinic.view.nurse.Add();
    // addNur.setVisible(true);

    // clinic.view.med.Add addMed = new clinic.view.med.Add();
    // addMed.setVisible(true);

    clinic.view.doctor.ShowList docList = new clinic.view.doctor.ShowList();
    docList.setVisible(true);

    clinic.view.nurse.ShowList nurList = new clinic.view.nurse.ShowList();
    nurList.setVisible(true);

    clinic.view.med.ShowList medList = new clinic.view.med.ShowList();
    medList.setVisible(true);

    // doctorCtrl.insertRecord("test", "test", "test", "test");
    // nurseCtrl.insertRecord("null", "null", "null", "null");
    // medCtrl.insertRecord("null", "null", 0, 0);
    // patientCtrl.insertRecord("null", "null", "null", "null", 0, false, "null");

    // doctorCtrl.deleteRecord("3");
    // nurseCtrl.deleteRecord("2");
    // medCtrl.deleteRecord("1");
    // patientCtrl.deleteRecord("null");

    // doctorCtrl.updateRecord("test", "null", "null", "null");
    // nurseCtrl.updateRecord("null", "1", "1", "1");
    // medCtrl.updateRecord("null", "1", 3.2, 120);
    // patientCtrl.updateRecord("null", "1", "1", "1", 20, true, "1");

    // doctorCtrl.showList();
    // nurseCtrl.showList();
    // medCtrl.showList();
    // patientCtrl.showList();
  }
}
