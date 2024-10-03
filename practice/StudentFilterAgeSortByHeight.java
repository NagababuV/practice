package practice;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentFilterAgeSortByHeight {
    public static void main(String[] args) {

        List<Student> listOfStudents = Arrays.asList(new Student(1, "Abhay", 21, "Male", "CSE", "Banglore", 163, Arrays.asList("98", "90")),
                new Student(2, "Harvey", 41, "Male", "BSE", "USA", 170, Arrays.asList("94", "90")),
                new Student(3, "Donna", 31, "Female", "ECE", "UK", 153, Arrays.asList("90", "87")));

        //filter by basis of age <25 and sort in ascending order by name;
        List<String> listSortedStudents = listOfStudents.stream().filter(i -> i.getAge() > 25).map(i -> i.getName()).sorted().toList();

        System.out.println(listSortedStudents);

        //using streams of numbers filter even numbers and find sum of all

        List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        int sumOfEven = listOfIntegers.stream().filter(i -> i % 2 == 0).reduce(0, Integer::sum);


        System.out.println(sumOfEven);

        String str = "Abhay";

        str.split("");

        char c[] = str.toCharArray();


        //Arrange in desending order by calculating the avg marks (marks details present in subject class meaning : calculate the total avg score of all the subjects of an individual student and compare and arrange )Solve using java8

        //phone number  == marks consideration
       // List<String> sortNameByAvgmarks= listOfStudents.stream().map(Collectors.averagingDouble(Student::)).filter()











    }


}
