class Student{
    String name;
    int age;

    void display(){
        System.out.println("Name is :"+name+" and age is : "+age);
    }
}

public class Main{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name="Guruvishnu";
        s1.age= 20;
        s1.display();
    }
}