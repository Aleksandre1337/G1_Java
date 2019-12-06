package btu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String language;
        String parameters;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter language");
        language = scanner.nextLine();
        System.out.println("enter params (p-2-3-s-5-17-w-7-9)");
        parameters = scanner.nextLine();
//        language = "en";
//        parameters = "p-2-3-s-5-17-w-7-9";
        String[] parametersArray = parameters.split("-");
        ArrayList param = new ArrayList();
        for (String parameter: parametersArray) {
//            System.out.println(parameter);
            try {
                param.add(Integer.parseInt(parameter));
            } catch (NumberFormatException e) {
//                e.printStackTrace();
            }
        }
        Generator generator = new Generator(language, param);
        generator.generateAlphabet();

        System.out.println(generator.main());
    }
}