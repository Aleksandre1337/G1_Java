import java.util.Scanner;

public class B extends A {
    public int y;

    public void firstMethodB() {
        Scanner scanner = new Scanner(System.in);

        y = scanner.nextInt();
    }

    public int secondMethodB() {
        return x + y;
    }
}
