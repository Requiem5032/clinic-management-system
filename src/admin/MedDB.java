package admin;

/**
 * Medicine database using hash table
 */
class MedDB {
  static final HashTable table = new HashTable();

  /** Insert a med to the hash table */
  static void insertMed(String n, String ID, double p, int q) {
    Med newData = new Med(n, ID, p, q);
    table.insert(newData);
  }

  /** Remove med using name */
  static void removeMed(String name) {
    table.del(name);
  }

  static class Node {
    Med data;
    Node prev;
    Node next;

    Node(Med data) {
      this.data = data;
    }
  }

  static class DoublyLinkedList {
    Node head;
    Node tail;

    DoublyLinkedList() {
      head = null;
      tail = null;
    }

    /** Push a node of new Med data */
    void push(Med newData) {
      Node newNode = new Node(newData);

      newNode.next = head;
      newNode.prev = null;

      if (head != null) {
        head.prev = newNode;
      }

      if (tail == null) {
        tail = newNode;
      }

      head = newNode;
    }

    /** Delete a node */
    void delNode(Node del) {
      if (head == null || del == null) {
        return;
      }

      if (head == del) {
        head = del.next;
      }

      if (tail == del) {
        tail = del.prev;
      }

      if (del.next != null) {
        del.next.prev = del.prev;
      }

      if (del.prev != null) {
        del.prev.next = del.next;
      }

      return;
    }

    /** Search and return a node using a name */
    Node searchNode(String name) {
      Node temp = head;

      while (temp != null) {
        if (temp.data.n == name) {
          return temp;
        }

        temp = temp.next;
      }

      return null;
    }

    /** Print doubly linked list */
    void printList() {
      Node node = head;

      while (node != null && node != tail) {
        node.data.printInfo();
        node = node.next;
        System.out.print(" ----> ");
      }

      if (node == tail) {
        node.data.printInfo();
      }
    }

    void printData() {
      Node node = head;

      while (node != null) {
        node.data.printInfo();
        node = node.next;
        System.out.println();
      }
    }
  }

  static class HashTable {
    static final int size = 30;
    DoublyLinkedList[] table = new DoublyLinkedList[size];

    HashTable() {
      for (int i = 0; i < size; i++) {
        table[i] = null;
      }
    }

    /** Hash function */
    int hashFunc(Med data) {
      int number = data.n.charAt(0);
      return number % size;
    }

    /** Insert a Med object */
    void insert(Med data) {
      int hash = hashFunc(data);

      if (table[hash] == null) {
        table[hash] = new DoublyLinkedList();
      }

      table[hash].push(data);
    }

    /** Search med using med name */
    void search(String name) {
      int number = name.charAt(0);
      int hash = number % size;
      Node resNode = null;
      DoublyLinkedList temp = table[hash];

      if (temp != null) {
        resNode = temp.searchNode(name);

        if (resNode != null) {
          resNode.data.printInfo();
        }

        else {
          System.out.println("Name not found.");
        }
      }

      else {
        System.out.println("Name not found.");
      }
    }

    /** Delete med using med name */
    void del(String name) {
      int number = name.charAt(0);
      int hash = number % size;
      DoublyLinkedList temp = table[hash];

      if (temp != null) {
        Node tempNode = temp.searchNode(name);
        temp.delNode(tempNode);

        if (temp.head == null) {
          table[hash] = null;
        }

        return;
      }
    }

    /** Print the hashmap */
    void printTable() {
      for (int i = 0; i < size; i++) {
        if (table[i] != null) {
          System.out.print(i + ". ");
          table[i].printList();
          System.out.println();
        }

        else {
          System.out.println(i + ". NULL");
        }
      }
    }

    void printMedList() {
      for (int i = 0; i < size; i++) {
        if (table[i] != null) {
          table[i].printData();
        }
      }
    }
  }
}
