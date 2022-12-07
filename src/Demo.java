public class Demo {
  public static void main(String[] args) throws Exception {
    // clinic.controller.PatientController ctrl = new clinic.controller.PatientController();
    // ctrl.insertRecord("1", "null", "null", "null", 0, false, "null");
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
}
