package clinic.database;

import clinic.entities.Med;;

class MedNode {
  Med data;
  MedNode prev;
  MedNode next;

  public MedNode(Med data) {
    this.data = data;
    prev = null;
    next = null;
  }
}


public class MedDB {
  MedNode head;
  MedNode tail;

  public MedDB() {
    head = null;
    tail = null;
  }

  private void push(Med newData) {
    MedNode temp = new MedNode(newData);
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

  private void delNode(MedNode temp) {
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

  private MedNode searchNode(String name) {
    MedNode temp = head;

    while (temp != null) {
      if (temp.data.getName() == name) {
        return temp;
      }

      temp = temp.next;
    }

    return null;
  }

  public void printData() {
    MedNode temp = head;
    int index = 1;

    while (temp != null) {
      System.out.print(index + ". ");
      temp.data.printInfo();
      temp = temp.next;
      System.out.println();
      index++;
    }
  }

  public void insertMed(String name, String ID, double price, int quantity) {
    Med newData = new Med(name, ID, price, quantity);
    push(newData);
  }

  public void removeMed(String name) {
    MedNode temp = searchNode(name);
    delNode(temp);
  }

  public void searchMed(String name) {
    MedNode temp = searchNode(name);
    temp.data.printInfo();
  }
}
