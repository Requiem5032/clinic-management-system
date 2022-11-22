package clinic.model;

public class Employee {
  private String id;
  private String firstName;
  private String lastName;
  private String position;

  public Employee(String id, String firstName, String lastName, String position) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.position = position;
  }

  public String getID() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getPosition() {
    return position;
  }

  public void setID(String id) {
    this.id = id;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public void printInfo() {
    System.out.println("ID: " + this.id);
    System.out.println("First name: " + this.firstName);
    System.out.println("Last name: " + this.lastName);
    System.out.println("Position: " + this.position);
  }
}
