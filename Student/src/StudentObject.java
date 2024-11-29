public class StudentObject {

    public static void main(String[] args) {
        // Create a new Student object
        Student s1 = new Student("Mahmud", "22/56003/5", 24);
        Student s2 = new Student("Auwal","20/55584/5",32);
        Student s3 = new Student("Anas","23/25284/3",40);
        Student s4 = new Student("Fatima","23/25774/3",30);
        Student s5 = new Student("Ali","18/25DD4/3",90);


        // Print the details of student 1
        System.out.println("Name: " + s1.getName());
        System.out.println("Reg No: " + s1.getRegno());
        System.out.println("Age: " + s1.getAge());

        System.out.println("...............................................");

        // Print the details of student 2
        System.out.println("Name: " + s2.getName());
        System.out.println("Reg No: " + s2.getRegno());
        System.out.println("Age: " + s2.getAge());

        System.out.println("...............................................");

        // Print the details of student 3
        System.out.println("Name: " + s3.getName());
        System.out.println("Reg No: " + s3.getRegno());
        System.out.println("Age: " + s3.getAge());

        System.out.println("...............................................");


        // Print the details of student 4
        System.out.println("Name: " + s4.getName());
        System.out.println("Reg No: " + s4.getRegno());
        System.out.println("Age: " + s4.getAge());

        System.out.println("...............................................");


        // Print the details of student 4
        System.out.println("Name: " + s5.getName());
        System.out.println("Reg No: " + s5.getRegno());
        System.out.println("Age: " + s5.getAge());

        System.out.println("...............................................");

        // Print the number of student objects created so far
        System.out.println("The number of student objects created so far is: " + Student.studentCount);
    }

}