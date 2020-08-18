public class Classes {
  public static void main(String[] args) {
    User u1 = new User(21);
    u1.print();

    User s = new Student();
    // User => Type statique (compilation)
    // Student => Type dynamique (execution)

    // A ref = new B();
    // A == B or B extends A

    // void f(A a) {...}
    // f(x)

    f(s);
  }

  static void f(User r) {

  }

  static void f(Student f) {

  }
}

class User {
  // Attributs
  String name;
  int age;
  int year;

  // Constructor
  User(String name, int age, int year) {
    this.name = name;
    this.age = age;
    this.year = year;
  }

  User(String name) {
    this.name = name;
  }

  User(int age) {
    this.age = age;
  }

  User(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Methodes
  void print() {
    System.out.printf("User { name: %s, age: %d }", name, age);
  }
}

class Student extends User {
}