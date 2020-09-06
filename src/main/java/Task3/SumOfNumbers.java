package Task3;

import java.util.HashSet;

public class SumOfNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 5, 4, 3, 5};
        int sum;
        HashSet<Integer> sumOfNumbers = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length; j++) {
                sum = numbers[i] + numbers[j];
                sumOfNumbers.add(sum);
            }
        }
        sumOfNumbers.forEach(System.out::println);
    }
}
