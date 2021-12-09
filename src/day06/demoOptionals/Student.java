package day06.demoOptionals;

import java.util.Optional;

public class Student {
    private Optional<Integer> age; // `Optional`: may or may not have Value

    public Student(Integer age) {
        this.age = Optional.ofNullable(age);
    }

    public Optional<Integer> getAge() {
        return age;
    }


    public void setAge(Optional<Integer> age) {
        this.age = age;
    }
}
