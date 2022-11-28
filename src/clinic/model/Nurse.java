package clinic.model;

public class Nurse extends Employee {
  private String position;

  public Nurse(String id, String firstName, String lastName, String position) {
    super(id, firstName, lastName);
    this.position = position;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }
}

