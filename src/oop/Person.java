package oop;

import java.time.LocalDate;

public class Person {
    public static void main(String[] args) {
        String name = "Ion";
        LocalDate birthDate = LocalDate.of(2003, 5, 16);
        Person person = new Person();
        person.setName(name);
        person.setBirthDate(birthDate);
        System.out.println(person.isBirthday());
        System.out.println(person);

    }

    String name;
    LocalDate birthDate;

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBirthday() {
        LocalDate today = LocalDate.now();
        today.getMonth();
        return today.getDayOfMonth() == this.birthDate.getDayOfMonth() && today.getMonthValue() == this.birthDate.getMonthValue();
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
