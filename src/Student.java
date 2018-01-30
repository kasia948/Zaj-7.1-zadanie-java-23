public class Student extends Person {
    private int indexNumber;

    private Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Student(String fn, String ln, int indexNumber) {
        super(fn, ln);
        this.indexNumber = indexNumber;
    }

    void showInfo(){
        System.out.println(getFirstName()+" "+getLastName()+", "+getIndexNumber());
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }
}