package clinic.database;
import clinic.entities.Doctor;

class DocNode {
  Doctor data;
  DocNode prev;
  DocNode next;

  DocNode() {
    prev = null;
    next = null;
  }

  DocNode(Doctor data) {
    this.data = data;
    prev = null;
    next = null;
  }
}

public class DoctorDB {
  DocNode head;
  DocNode tail;

  public DoctorDB() {
    head = null;
    tail = null;
  }

  private void push(Doctor newData) {
    DocNode temp = new DocNode(newData);
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

  private void delNode(DocNode temp) {
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

  private DocNode searchNode(String name) {
    DocNode temp = head;

    while (temp != null) {
      if (temp.data.getName() == name) {
        return temp;
      }

      temp = temp.next;
    }

    return null;
  }

  public void printData() {
    DocNode temp = head;
    int index = 1;

    while (temp != null) {
      System.out.print(index + ". ");
      temp.data.printInfo();
      temp = temp.next;
      System.out.println();
      index++;
    }
  }

  public void insert(String name, String ID, String pos) {
    Doctor newData = new Doctor(name, ID, pos);
    push(newData);
  }

  public void remove(String name) {
    DocNode temp = searchNode(name);
    delNode(temp);
  }

  public void search(String name) {
    DocNode temp = searchNode(name);
    temp.data.printInfo();
  }
}
