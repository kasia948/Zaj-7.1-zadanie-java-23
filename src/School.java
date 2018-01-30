public class School {
    public static void main(String[] args) {
        Student student1 = new Student("Adam", "Nowak", 22222);
        student1.showInfo();
        Teacher teacher1 = new Teacher("Zofia","Jakubiak, ", 2200);
        teacher1.showInfo();
    }
}