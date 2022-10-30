package guest;

public class Patient {
  String PID;
  String NID;
  String name;
  int age;
  boolean gender;
  String DoB;
  String PoB;
  String addr;

  Patient(String PID, String NID, String name, int age, boolean gender, String DoB, String PoB,
      String addr) {
    this.PID = PID;
    this.NID = NID;
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.DoB = DoB;
    this.PoB = PoB;
    this.addr = addr;
  }

  String getPID() {
    return PID;
  }

  String getNID() {
    return NID;
  }

  String getName() {
    return name;
  }

  int getAge() {
    return age;
  }

  boolean getGender() {
    return gender;
  }

  String getDoB() {
    return DoB;
  }

  String getPoB() {
    return PoB;
  }

  String getAddr() {
    return addr;
  }

  void setPID(String PID) {
    this.PID = PID;
  }

  void setNID(String NID) {
    this.NID = NID;
  }

  void setName(String name) {
    this.name = name;
  }

  void setAge(int age) {
    this.age = age;
  }

  void setGender(boolean gender) {
    this.gender = gender;
  }

  void setDoB(String DoB) {
    this.DoB = DoB;
  }

  void setPoB(String PoB) {
    this.PoB = PoB;
  }

  void setAddr(String addr) {
    this.addr = addr;
  }
}
