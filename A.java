class A {
  public static void main(String[] args) {
    System.out.printf("From class B:\n static age: %d\n public static name: %s\n", B.age, B.name);
    B b = new B();
    B c = new B();
    System.out.println("Non static vars: " + b.rpassword);
    c = b;
    c.rpassword = "REPEAT";
    System.out.println("Non static vars: " + b.rpassword);
    System.out.println("Non static vars: " + c.rpassword);
    System.out.println("Static vars in class: " + b.HEIGHT);
    System.out.println("Static vars in class: " + B.HEIGHT);
  }
}
