package clinic.entities;

public class Med {
  private String name;
  private String ID;
  private double price;
  private int quantity;

  public Med(String name, String ID, double price, int quantity) {
    this.name = name;
    this.ID = ID;
    this.price = price;
    this.quantity = quantity;
  }

  public String getName() {
    return name;
  }

  public String getID() {
    return ID;
  }

  public double getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public void printInfo() {
    System.out.print("Name: " + name);
    System.out.print(", ID: " + ID);
    System.out.print(", Price: " + price + "$");
    System.out.print(", Quantity: " + quantity + " Box(es)");
  }
}
