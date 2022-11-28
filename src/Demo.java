import clinic.controller.*;

public class Demo {
  public static void main(String[] args) throws Exception {
    DoctorController doctorCtrl = new DoctorController();
    NurseController nurseCtrl = new NurseController();

    nurseCtrl.deleteRecord("test");
    nurseCtrl.showList();

  }
}
