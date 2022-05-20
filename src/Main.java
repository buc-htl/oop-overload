class Main {
  public static void main(String[] args) {
   
    Bottle b1 = new Bottle();
    System.out.println("****");
    Bottle b2 = new Bottle(200.5);
     System.out.println("****");
    Bottle b3 = new Bottle(125);
     System.out.println("****");
    Bottle b4 = new Bottle(500,100);

    System.out.println("\n**** **** ****\n");
    b4.reset();
    System.out.println("****");
    b4.reset(700);
    System.out.println("****");
    b4.reset(900,890);
  }
}