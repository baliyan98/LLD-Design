package creational.design.pattern.prototype;

public class Student implements Prototype {

    private String name;
    private int id;
    private int rollNo;

    public Student(String name, int id, int rollNo) {
        this.name = name;
        this.id = id;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public Student cloneobj() {
        return new Student(name, id, rollNo);
    }

}
