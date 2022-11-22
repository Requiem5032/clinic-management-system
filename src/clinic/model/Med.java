package clinic.model;

public class Med {
  private String name;
  private String ID;
  private double price;
  private int quantity;

  public Med(String ID, String name, double price, int quantity) {
    this.ID = ID;
    this.name = name;
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
}
