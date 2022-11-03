package clinic.entities;

interface Employee {
  public String getName();

  public String getID();

  public void setName(String name);

  public void setID(String ID);

  public abstract void printInfo();
}
