package clinic.entities;

public class Patient {
  private String PID;
  private String NID;
  private String name;
  private int age;
  private boolean gender;
  private String DoB;
  private String PoB;
  private String addr;

  public Patient(String PID, String NID, String name, int age, boolean gender, String DoB,
      String PoB, String addr) {
    this.PID = PID;
    this.NID = NID;
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.DoB = DoB;
    this.PoB = PoB;
    this.addr = addr;
  }

  public String getPID() {
    return PID;
  }

  public String getNID() {
    return NID;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public boolean getGender() {
    return gender;
  }

  public String getDoB() {
    return DoB;
  }

  public String getPoB() {
    return PoB;
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

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setGender(boolean gender) {
    this.gender = gender;
  }

  public void setDoB(String DoB) {
    this.DoB = DoB;
  }

  public void setPoB(String PoB) {
    this.PoB = PoB;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }

  public void printInfo() {
    System.out.print("Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Patient ID: "
        + PID + ", National ID: " + NID + ", Date of birth: " + DoB + ", Place of birth: " + PoB
        + ", Address: " + addr);
  }
}
