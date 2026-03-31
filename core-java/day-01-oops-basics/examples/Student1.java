// this is the example of encapsulation where we are hiding the data members and providing public methods to access them
class Student1{
    String name;
    int age;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if(age>0){
            this.age=age;
        }
    }

    public void displaystudentdetails(){
        System.out.println("Name is :"+name+" and age is : "+age);
    }
}