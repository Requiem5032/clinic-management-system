package clinic.database;
import clinic.entities.Nurse;

class NurNode {
  Nurse data;
  NurNode prev;
  NurNode next;

  NurNode() {
    prev = null;
    next = null;
  }

  NurNode(Nurse data) {
    this.data = data;
    prev = null;
    next = null;
  }
}


public class NurseDB {
  NurNode head;
  NurNode tail;

  public NurseDB() {
    head = null;
    tail = null;
  }

  private void push(Nurse newData) {
    NurNode temp = new NurNode(newData);
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

  private void delNode(NurNode temp) {
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

  private NurNode searchNode(String name) {
    NurNode temp = head;

    while (temp != null) {
      if (temp.data.getName() == name) {
        return temp;
      }

      temp = temp.next;
    }

    return null;
  }

  public void printData() {
    NurNode temp = head;
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
    Nurse newData = new Nurse(name, ID, pos);
    push(newData);
  }

  public void remove(String name) {
    NurNode temp = searchNode(name);
    delNode(temp);
  }

  public void search(String name) {
    NurNode temp = searchNode(name);
    temp.data.printInfo();
  }
}
