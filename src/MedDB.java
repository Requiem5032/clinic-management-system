class MedDB {
    static class Med {
        String n;
        int ID;
        double p;
        int q;

        Med(String n, int ID, double p, int q) {
            this.n = n;
            this.ID = ID;
            this.p = p;
            this.q = q;
        }

        void printInfo() {
            System.out.print("Name: " + n);
            System.out.print(", ID: " + ID);
            System.out.print(", Price: " + p);
            System.out.print(", Quantity: " + q);
        }
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

        void printList() {
            Node Node = head;

            while (Node != null && Node != tail) {
                Node.data.printInfo();
                Node = Node.next;
                System.out.print(" ----> ");
            }

            if (Node == tail) {
                Node.data.printInfo();
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

        int hashFunc(Med data) {
            int number = data.n.charAt(0);
            return number % size;
        }

        void insert(Med data) {
            int hash = hashFunc(data);

            if (table[hash] == null) {
                table[hash] = new DoublyLinkedList();
            }

            table[hash].push(data);
        }

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

        void del(Med data) {
            int hash = hashFunc(data);
            DoublyLinkedList temp = table[hash];

            if (temp != null) {
                Node tempNode = temp.searchNode(data.n);
                temp.delNode(tempNode);

                if (temp.head == null) {
                    table[hash] = null;
                }

                return;
            }
        }

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
    }
}