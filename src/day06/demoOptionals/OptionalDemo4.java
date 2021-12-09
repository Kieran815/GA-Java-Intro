package day06.demoOptionals;

import java.util.Optional;

public class OptionalDemo4 {

    public static void main(String[] args) {
        Student student = new Student(22);
        boolean canBuy = Optional.ofNullable(student)
                .flatMap(Student::getAge)
                .filter(age -> age >= 21)
                .isPresent();
        System.out.println(canBuy);




        Student nullStudent = new Student(null);
        boolean canBuyNull = Optional.ofNullable(nullStudent)
                .flatMap(Student::getAge)
                .filter(age -> age >= 21)
                .isPresent();
        System.out.println(canBuyNull); // age is `null`, so this will not return(
    }
}
