package admin;

class Med {
  String n;
  String ID;
  double p;
  int q;

  Med(String n, String ID, double p, int q) {
    this.n = n;
    this.ID = ID;
    this.p = p;
    this.q = q;
  }

  /** Print med info */
  void printInfo() {
    System.out.print("Name: " + n);
    System.out.print(", ID: " + ID);
    System.out.print(", Price: " + p + "$");
    System.out.print(", Quantity: " + q + " Box(es)");
  }
}
