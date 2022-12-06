// import clinic.controller.*;

public class Demo {
  public static void main(String[] args) throws Exception {
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
          .getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (Exception e) {
      System.out.println(e);
    }

    clinic.view.MainPage gui = new clinic.view.MainPage();
    gui.setVisible(true);
  }
  
    // DoctorController doctorCtrl = new DoctorController();
    // NurseController nurseCtrl = new NurseController();
    // MedController medCtrl = new MedController();
    // PatientController patientCtrl = new PatientController();

    // clinic.view.doctor.Add addDoc = new clinic.view.doctor.Add();
    // addDoc.setTitle("Add doctor");
    // addDoc.setVisible(true);

    // clinic.view.nurse.Add addNur = new clinic.view.nurse.Add();
    // addNur.setTitle("Add nurse");
    // addNur.setVisible(true);

    // clinic.view.med.Add addMed = new clinic.view.med.Add();
    // addMed.setTitle("Add medicine");
    // addMed.setVisible(true);

    // clinic.view.doctor.ShowList docList = new clinic.view.doctor.ShowList();
    // docList.setTitle("Show doctor list");
    // docList.setVisible(true);

    // clinic.view.nurse.ShowList nurList = new clinic.view.nurse.ShowList();
    // nurList.setTitle("Show nurse list");
    // nurList.setVisible(true);

    // clinic.view.med.ShowList medList = new clinic.view.med.ShowList();
    // medList.setTitle("Show medicine list");
    // medList.setVisible(true);

    // doctorCtrl.updateRecord("test", "null", "null", "null");
    // nurseCtrl.updateRecord("null", "1", "1", "1");
    // medCtrl.updateRecord("null", "1", 3.2, 120);
    // patientCtrl.updateRecord("null", "1", "1", "1", 20, true, "1");

    // doctorCtrl.showList();
    // nurseCtrl.showList();
    // medCtrl.showList();
    // patientCtrl.showList();
}
