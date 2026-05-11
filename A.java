class A {
  public static void main(String[] args) {
    System.out.printf("From class B:\n static age: %d\n public static name: %s\n", B.age, B.name);
    B b = new B();
    System.out.println("Non static vars: " + b.rpassword);
  }
}
