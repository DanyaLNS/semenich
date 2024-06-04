package org.example;

public class NumberOperations {
    public static int _min(int[] numbers) {
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int _max(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int _sum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static int _mult(int[] numbers) {
        int mult = 1;
        for (int num : numbers) {
            mult *= num;
        }
        return mult;
    }
}
