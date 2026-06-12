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
// class student{
//     String name;
//     int age;
//     double cgpa;

//     void display(){
//         System.out.println(name +" "+ age +" "+cgpa);
//     }
// }
// class oops{
//     public static void main(String[] args) {
//         student s = new student();
//         s.name = "shubham";
//         s.age = 20;
//         s.cgpa = 8.5;

//         s.display();
//      }
// }


// polymorphism ................

// class math{
//   int add (int a , int b){
//     return a+b;
//   }
//   int add (int a ,int b ,int c){
//     return a+b+c;
//   }
// }
// class oops{
//     public static void main(String[] args) {
//         math m = new math();
//         System.out.println(m.add(10,20));
//         System.out.println(m.add(10,20,30));
//     }
// }

// private specifier.....................

// class student{
//     String name = "shuham";
//     int age = 20;
//     private int marks = 90;

//     void display(){
//         System.out.println(name+" "+age+" "+marks);
//     }
// }
// class oops{
//     public static void main(String[] args) {
//         student s = new student();
//         s.display();
//     }
// }

// getter and setter ....................

// class student{
//     String name = "shuham";
//     int age = 20;
//     private int marks;

//    void setMarks(int n){
//     marks = n;
//    }
//    int getMarks(){
//     return marks;
//    }
// }


// class oops{
//     public static void main(String[] args) {
//         student s = new student();
//         s.setMarks(20);  // set value 
//         System.out.println(s.getMarks()); // get value 
//         System.out.println(s.name);
//     }
// }

// default constructors.................

// class student{
//     String name ;
//     int rno;

//     student(){
//         name = "Shubham";
//         rno = 20;
//     }
//     // void display(){
//     //     System.out.println(name+" "+rno);
//     // }
// }
// class oops{
//     public static void main(String[] args) {
//         student s = new student();
//         //s.display();
//     System.out.println(s.name+" "+s.rno);
//     }
// }


// parameterized constructors...............

// class student{
//     String name ;
//     int rno;

//     student(String n , int r){
//         name = n;
//         rno = r;
//     }
//     void display(){
//         System.out.println(name+" "+rno);
//     }
// }
// class oops{
//     public static void main(String[] args) {
//         student s = new student("shubham" , 22);
//         s.display();
   
//     }
// }

// this Ketwords .................

// class pokemon{
//     int power;
//     String type;

//     pokemon(int power , String type){
//         this.power = power;
//         this.type = type;
//     }
//      void print(){
//             System.out.println(this.power+" "+this.type);
//         }
// }
// class oops{
//     public static void main(String[] args) {
//         pokemon p = new pokemon(80,"electric");
//         p.print();

//     }
// }


// Final keywords .................

// class student{
//     final int rollno = 10;
//     String name = "Shubham";

//     void display(){
//         System.out.println(rollno+" "+name);
//     }
// }
// class oops{
//     public static void main(String[] args) {
//         student s = new student();
//         s.display();
//        //  s.rollno = 11; cannot change final variable;
//     }
// }

// Static keywords...................

// class student{
//     static String college = "Galgotia";
//     String name;
//     student(String n){
//         name = n;
//     }

//     void display(){
//         System.out.println(name + " " + college);
//     }
// }

// class oops{
//     public static void main(String[] args) {
//         student s1 = new student("shubham");
//         s1.display();
//         student s2 = new student("shubham srivastav");
//         s2.display();
//     }
// }

// complex number ....................

// class complex{
//     int real;
//     int imagin;

//     complex(int r , int i){
//         real = r;
//         imagin = i;
//     }
//     void display(){
//         System.out.println(real+" + "+imagin+" i ");
//     }
// }
// class oops{
//     public static void main(String[] args) {
//         complex c = new complex(4,5);
//         c.display();
//     }
// }

// Fraction ....................

//class fraction{
//     int num;
//     int den;

//     fraction(int num , int den){
//         this.num = num;
//         this.den = den;
//     }
//     void print(){
//         System.out.println(num+"/"+den);
//     }
//     void add(fraction f){
//         num = num*f.den+den*f.num;
//         den = den *f.den;
//     }
// }
// class oops{
//     public static void main(String[] args) {
//         fraction f = new fraction(3,7);
//         f.print();

//         fraction f2 = new fraction(7,3);
//         f.add(f2);
//         f.print();
//     }
// }