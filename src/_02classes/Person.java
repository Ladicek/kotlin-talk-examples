package _02classes;

public final class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

        new Person4("aaa", 100).
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
