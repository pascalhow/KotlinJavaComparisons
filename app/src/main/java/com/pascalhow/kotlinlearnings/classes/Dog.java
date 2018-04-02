package com.pascalhow.kotlinlearnings.classes;

public class Dog {

    private final String name;
    private final int age;
    private final boolean isTrained;

    public Dog(String name, int age, boolean isTrained) {
        this.name = name;
        this.age = age;
        this.isTrained = isTrained;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isTrained() {
        return isTrained;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        if (age != dog.age) return false;
        if (isTrained != dog.isTrained) return false;
        return name != null ? name.equals(dog.name) : dog.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (isTrained ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isTrained=" + isTrained +
                '}';
    }

}
