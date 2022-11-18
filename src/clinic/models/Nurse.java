package clinic.models;

public class Nurse implements Employee {
  private String id;
  private String firstName;
  private String lastName;
  private String position;

  public Nurse(String id, String firstName, String lastName, String position) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.position = position;
  }

  @Override
  public String getID() {
    return id;
  }

  @Override
  public String getFirstName() {
    return firstName;
  }

  @Override
  public String getLastName() {
    return lastName;
  }

  @Override
  public String getPosition() {
    return position;
  }
  
  @Override
  public void setID(String id) {
    this.id = id;
  }

  @Override
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  @Override
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public void setPosition(String position) {
    this.position = position;
  }

  @Override
  public void printInfo() {
    System.out.println("ID: " + this.id);
    System.out.println("First name: " + this.firstName);
    System.out.println("Last name: " + this.lastName);
    System.out.println("Position: " + this.position);
  }
}
