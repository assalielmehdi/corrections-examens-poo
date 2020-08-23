import java.util.*;
import java.io.*;

public class Basics {
  public static void main(String[] args) throws Throwable {
    // boolean: true or false
    boolean isTrue = false;
    // char: 1 byte
    char c = '\0';
    // int: 4 bytes
    int a = -1, b = 213242;
    // long: 8 bytes
    long d = 0L, e = 20000000000L;
    // float
    float f = 3.4F;
    // double
    double g = 3232.4233434;
    // String
    String s = "Barca";
    s = "Bayern";
    s.length();
    // [a, b[
    s.substring(0, 3);
    // r == 'r'
    char r = s.charAt(2);

    // if else
    if (1 == 4) {
      // ...
    } else if (s.length() > 10) {
      // ...
    } else {
      // ...
    }

    // switch case
    switch (a) {
      case 1:
        // ...
        break;
      case 2:
        // ...
        break;
      case 3:
      case 4:
      case 5:
        // ...
        break;
      default:
        // ...
    }

    // for(init; condition; increment)
    for (int i = 0; i < 10; i++) {
      // ...
    }

    // init
    // while (condition) {
    // ...
    // increment
    // }
    int i = 0;
    while (i < 10) {
      //
      i++;
    }

    // <type> <name> = <value>
    // <type>[] <name> = <value>
    String[] names = { "Barca", "Bayern" };
    // <type>[] <name> = new <type>[<size>]
    int[] ages = new int[10];

    for (int j = 0; j < ages.length; i++) {
      ages[i] = 20;
    }

    // Read from stdin
    Scanner scanner = new Scanner(System.in);
    // <type> <name> = scanner.next[Int, Double, Long, Line]()
    int v = scanner.nextInt();
    double v1 = scanner.nextDouble();
    String v2 = scanner.next();
    String line = scanner.nextLine();

    // Read from file
    scanner = new Scanner(new File("./README.md"));
    int v3 = scanner.nextInt();

    // Write to stdout
    System.out.println("Hello World!");
    System.out.printf("%d %s %ld", 13, "Hi", 1L);
    System.out.print("Hello World!");

    // Write to file
    PrintWriter writer = new PrintWriter(new File("./out.txt"));
    writer.println("Hello World!");
  }
}
