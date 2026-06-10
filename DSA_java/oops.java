// user define data type ........


// class Student {
//     String name;
//     int age;
// }

// public class oops {
//     public static void main(String[] args) {

//         Student s = new Student();

//         s.name = "Shubham";
//         s.age = 20;

//         System.out.println( s.name +" "+ s.age);
       
//     }
// }


// passing object to method ...........
class student{
    String name;
    int age;
    double cgpa;

    void display(){
        System.out.println(name +" "+ age +" "+cgpa);
    }
}
class oops{
    public static void main(String[] args) {
        student s = new student();
        s.name = "shubham";
        s.age = 20;
        s.cgpa = 8.5;

        s.display();
     }
}