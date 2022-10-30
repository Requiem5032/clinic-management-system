package admin;

class Employee {
  String name;
  String ID;

  Employee() {}

  Employee(String name, String ID) {
    this.name = name;
    this.ID = ID;
  }

  String getName() {
    return name;
  }

  String getID() {
    return ID;
  }

  void setName(String name) {
    this.name = name;
  }

  void setID(String ID) {
    this.ID = ID;
  }
}
