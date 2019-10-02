import java.util.Scanner;

public class C {
    public int a, b, c;

    public void firstMethod() {
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
    }

    public int secondMethod() {
        return a % 10;
    }

    public int thirdMethod() {
        while (b >= 10) b /= 10;

        return b;
    }

    public int fourthMethod() {
        int res = 0, temp = 0;

        while(c != 0) {
            res = c % 10;
            res += temp;
            c /= 10;
        }

        return res;
    }

    public void fifthMethod() {
        System.out.println(secondMethod() * thirdMethod());
    }

    public int fifthMethodReturn() {
        return secondMethod() * thirdMethod();
    }

    public void sixthMethod() {
        System.out.println(thirdMethod() + fifthMethodReturn());
    }
}
