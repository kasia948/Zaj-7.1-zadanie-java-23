public class Teacher extends Person {
    private int salary;

    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Teacher(String fn, String ln, int salary) {
        super(fn, ln);
        this.salary = salary;
    }

    void showInfo() {
        System.out.println(getFirstName() + " " + getLastName() + ", " + getSalary());
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}