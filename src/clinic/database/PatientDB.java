package clinic.database;
import clinic.entities.Patient;

class PatientNode {
  Patient data;
  PatientNode prev;
  PatientNode next;

  PatientNode() {
    prev = null;
    next = null;
  }

  PatientNode(Patient data) {
    this.data = data;
    prev = null;
    next = null;
  }
}

public class PatientDB {
  PatientNode head;
  PatientNode tail;

  public PatientDB() {
    head = null;
    tail = null;
  }

  private void push(Patient newData) {
    PatientNode temp = new PatientNode(newData);
    temp.next = head;
    temp.prev = null;

    if (head != null) {
      head.prev = temp;
    }

    if (tail == null) {
      tail = temp;
    }

    head = temp;
  }

  private void delNode(PatientNode temp) {
    if (head == null || temp == null) {
      return;
    }

    if (head == temp) {
      head = temp.next;
    }

    if (tail == temp) {
      tail = temp.prev;
    }

    if (temp.next != null) {
      temp.next.prev = temp.prev;
    }

    if (temp.prev != null) {
      temp.prev.next = temp.next;
    }

    return;
  }

  private PatientNode searchNode(String name) {
    PatientNode temp = head;

    while (temp != null) {
      if (temp.data.getName() == name) {
        return temp;
      }

      temp = temp.next;
    }

    return null;
  }

  public void printData() {
    PatientNode temp = head;
    int index = 1;

    while (temp != null) {
      System.out.print(index + ". ");
      temp.data.printInfo();
      temp = temp.next;
      System.out.println();
      index++;
    }
  }

  public void insert(String PID, String NID, String name, int age, boolean gender, String DoB,
  String PoB, String addr) {
    Patient newData = new Patient(PID, NID, name, age, gender, DoB, PoB, addr);
    push(newData);
  }

  public void remove(String name) {
    PatientNode temp = searchNode(name);
    delNode(temp);
  }

  public void search(String name) {
    PatientNode temp = searchNode(name);
    temp.data.printInfo();
  }
}
