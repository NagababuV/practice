package practice;

import java.util.Arrays;
import java.util.List;

public class StreamsSum {
    public static void main(String[] args) {

        List<Integer> listOfNums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        int sumOfEven = listOfNums.stream()
                .filter(i -> i % 2 == 0)
                .reduce(0, Integer::sum);

        List<Integer> listOfMultipleEvens = listOfNums.stream().filter(i -> i % 2 == 0).map(i -> i * 2).toList();

        System.out.println(sumOfEven);
        System.out.println(listOfMultipleEvens);

    }
}
