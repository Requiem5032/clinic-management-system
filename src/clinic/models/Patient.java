package clinic.models;

public class Patient {
  private String PID;
  private String NID;
  private String firstName;
  private String lastName;
  private int age;
  private boolean gender;
  private String addr;

  public Patient(String PID, String NID, String firstName, String lastName, int age, boolean gender,
      String addr) {
    this.PID = PID;
    this.NID = NID;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.gender = gender;
    this.addr = addr;
  }

  public String getPID() {
    return PID;
  }

  public String getNID() {
    return NID;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getAge() {
    return age;
  }

  public boolean getGender() {
    return gender;
  }

  public String getAddr() {
    return addr;
  }

  public void setPID(String PID) {
    this.PID = PID;
  }

  public void setNID(String NID) {
    this.NID = NID;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setGender(boolean gender) {
    this.gender = gender;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }

  public void printInfo() {
    System.out.println("Patient ID: " + PID);
    System.out.println("National ID: " + NID);
    System.out.println("First name: " + firstName);
    System.out.println("Last name: " + lastName);
    System.out.println("Age: " + age);
    if (gender == true) {
      System.out.println("Gender: Male");
    } else {
      System.out.println("Gender: Female");
    }
    System.out.println("Address: " + addr);
  }
}
