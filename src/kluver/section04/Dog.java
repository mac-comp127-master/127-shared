package kluver.section04;

public class Dog implements Comparable<Dog> {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name) {
        this(name, 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }




    public void feed() {
        System.out.println("You feed "+name+" they LOVE it");
    }

    public static void main(String[] args) {
        Dog dougie = new Dog("Dougie", 12);
    }

    @Override
    public int compareTo(Dog o) {
        int nameC =  this.name.compareTo(o.name);
        if(nameC == 0) {
            return this.age - o.age;
        } else {
            return nameC;
        }
    }
}











