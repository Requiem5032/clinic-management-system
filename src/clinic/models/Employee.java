package clinic.models;

public interface Employee {
  String getID();

  String getFirstName();

  String getLastName();

  String getPosition();

  void setID(String ID);

  void setFirstName(String firstName);

  void setLastName(String lastName);

  void setPosition(String position);

  void printInfo();
}
