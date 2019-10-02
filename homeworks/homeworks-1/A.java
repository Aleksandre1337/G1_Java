import java.util.Scanner;

public class A {
    public static int x;

    public A() {
        System.out.println("Hello");
    }

    public void firstMethod() {
        Scanner scanner = new Scanner(System.in);

        x = scanner.nextInt();
    }

    public void secondMethod() {
        System.out.println(x + 12);
    }

    public void thirdMethod() {
        if ((x & 1) == 0)
            System.out.println(x + " is even");
        else
            System.out.println(x + " is odd");
    }
}
