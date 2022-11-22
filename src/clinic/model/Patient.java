package clinic.model;

public class Patient {
  private String pid;
  private String nid;
  private String firstName;
  private String lastName;
  private int age;
  private boolean gender;
  private String addr;

  public Patient(String pid, String nid, String firstName, String lastName, int age, boolean gender,
      String addr) {
    this.pid = pid;
    this.nid = nid;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.gender = gender;
    this.addr = addr;
  }

  public String getPid() {
    return pid;
  }

  public String getNid() {
    return nid;
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

  public void setpid(String pid) {
    this.pid = pid;
  }

  public void setnid(String nid) {
    this.nid = nid;
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
}
