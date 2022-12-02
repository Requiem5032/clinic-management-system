package clinic.model;

public class Med {
  private String name;
  private String id;
  private double price;
  private int quantity;

  public Med(String id, String name, double price, int quantity) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public String getName() {
    return name;
  }

  public String getId() {
    return id;
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

  public void setId(String id) {
    this.id = id;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
}
