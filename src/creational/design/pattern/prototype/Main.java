package creational.design.pattern.prototype;

public class Main {

    public static void main(String[] args) {
        Student stu = new Student("Vishal", 1, 1);
        Student clone = (Student) stu.cloneobj();
        System.out.println(clone.getName());
    }

}
