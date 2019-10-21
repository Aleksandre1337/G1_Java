package com.example;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        firstExercise();
        secondExercise();
    }

    private static void firstExercise() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("function.txt"));

            for (double i = 1.00; i < 2.00 + 0.01; i += 0.01) {
                bw.write((Math.pow(i, 2) + i * 2 + 3) + "\n");
            }

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void secondExercise() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("function.txt"));

            double[] nums = new double[101];
            int i = 0;
            String s;

            while ((s = br.readLine())!=null) {
                nums[i] = Double.parseDouble(s);
                i++;
            }

            double min = Double.MAX_VALUE, max = Double.MIN_VALUE;

            for (i = 0; i < nums.length; i++) {
                if (nums[i] < min) {
                    min = nums[i];
                }
            }

            for (i = 0; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                }
            }

            System.out.println("min number - " + min);
            System.out.println("max number - " + max);

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
