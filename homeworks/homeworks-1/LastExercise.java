import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LastExercise {

    //        შეიტანეთ a და b მთელი რიცხვები, გამოიტანეთ [a; b] შუალედიდან 40
//
//შემთხვევითი რიცხვი (თუ a მეტია b-ზე, ამ ორი ცვლადის მნიშვნელობას გაუცვა-
//ლეთ ადგილები). დაადგინეთ რამდენი ლუწი და რამდენი კენტი რიცხვია
//
//გამოტანილ რიცხვებს შორის, გამოიტანეთ ლუწი და კენტი რიცხვების ჯამი, მიღე-
//ბულ ჯამებს შორის გამოიტანეთ 5 შემთხვევითი რიცხვი.
    public static void main() {
        int a, b, temp, evenCount = 0, oddCount = 0, evenSum = 0, oddSum = 0;

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        Random random = new Random();
        int[] randomIntegers = new int[40];

        for (int i = 0; i < randomIntegers.length; i++) {
            int randomInteger = random.nextInt(b - a + 1) + a;
            randomIntegers[i] = randomInteger;

            if ((randomInteger & 1) == 0) {
                evenCount++;
                evenSum += randomInteger;
            } else {
                oddCount++;
                oddSum += randomInteger;
            }
        }

        System.out.println(Arrays.toString(randomIntegers));

        System.out.println(String.format("#%d even numbers; sum = %d", evenCount, evenSum));
        System.out.println(String.format("#%d odd numbers; sum = %d", oddCount, oddSum));

        if (oddSum > evenSum) {
            temp = oddSum;
            oddSum = evenSum;
            evenSum = temp;
        }

        int[] randomFiveIntegers = new int[5];
        
        for (int i = 0; i < randomFiveIntegers.length; i++) {
            int randomInt = random.nextInt(evenSum - oddSum + 1) + oddSum;
            randomFiveIntegers[i] = randomInt;
        }

        System.out.println(Arrays.toString(randomFiveIntegers));
    }
}
