package clinic.entities;

public class Nurse implements Employee {
  private String name;
  private String ID;
  private String pos;

  public Nurse(String name, String ID, String pos) {
    this.name = name;
    this.ID = ID;
    this.pos = pos;
  }

  public String getName() {
    return name;
  }

  public String getID() {
    return ID;
  }

  public String getPos() {
    return pos;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public void setPos(String pos) {
    this.pos = pos;
  }

  public void printInfo() {
    System.out.print("Name: " + name);
    System.out.print(", ID: " + ID);
    System.out.print(", Position: " + pos);
  }
}
