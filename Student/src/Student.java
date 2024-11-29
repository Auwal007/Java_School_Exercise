public class Student {

    private String name;
    private String regno;
    private int age;
    public static int studentCount = 0; // Static variable to count student objects

    // Constructor
    public Student(String newName, String newRegno, int newAge) {
        name = newName;
        regno = newRegno;
        age = newAge;

        studentCount++; // Increment the student count whenever a new Student object is created
    }

    // Getter methods
    public String getName() {
        return name;
    }
    public String getRegno() {
        return regno;
    }

    public int getAge() {
        return age;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }
    public void setRegno(String regno) {
        this.regno = regno;
    }
    public void setAge(int age) {
        this.age = age;
    }

}
