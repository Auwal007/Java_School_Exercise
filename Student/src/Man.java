public class Man {
    private String name;
    private int age;

    public Man(String newName, int newAge){
        name=newName;
        age=newAge;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age>0){
            this.age=age;
        } else {
            System.out.println("Age must be greater than 0");
        }
    }

    public static void main(String[] args){
        Man bigMan = new Man("Abubakar", -5);
        System.out.println("My name is " + bigMan.getName() + " and I'm " + bigMan.getAge() + " years old");
        System.out.println(bigMan.getName());
        System.out.println(bigMan.getAge());

    }
}
