//print 1 to 10 number ...........

// public class loops {
// public static void main(String[] args) {
//     for(int i=1; i<=10; i++){
//         System.out.println(i);
//     }
// }    
// }

// print even number ...........

// class loops{
//     public static void main(String[] args) {
//         for(int i=1; i<=50; i++){
//             if (i%2==0) System.out.println(i);
//         }
//     }
// }

// print odd number ...........

// class loops{
//     public static void main(String[] args){
//         for (int i = 1; i<=100; i++){
//             if(i%2!=0) System.out.println(i);
//         }
//     }
// }


// printing table of n number .................. 

// class loops {
//     public static void main(String[] args) {
//         for (int i = 1; i<=10; i++){
//             System.out.println(i*5);
//         }
//     }
// }

// printing table of n number .................. 

// import java.util.Scanner;
// class loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter number :");
//         int a = sc.nextInt();
//         for (int i = 1; i<=10; i++){
//             System.out.print(i*a+" ");
//         }

//     }
// }


// arithmetic progression (AP)................
// import java.util.Scanner;
// class loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a = 4 , d = 6;
//         for (int i = 1; i<=n; i++){
//             System.out.print(a+" ");
//             a = a + d;
//         }

//     }
// }

// geometric progression (GP).................

// import java.util.Scanner;
// class loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number :");
//         int n = sc.nextInt();
//         int a = 1 , r = 2;
//         for (int i = 1; i<=n; i++){
//             System.out.println(a+" ");
//             a*=r;
//         }
//     }
// }
 

// continue for skip iteretion ............

// class loops{
//     public static void main(String[] args) {
//         for(int i = 1; i<=20; i++ ){
//             System.out.println(i);
//             if (i == 13) continue;
//             System.out.println("shubham");
//         }
//     }
// }


// while loop..............
// class loops{
//     public static void main(String[] args) {
//         int i = 1;
//         while (i<=10){
//             System.out.println(i);
//             i++;
            
//         }
       
//     }
// }


// count digits of a number ...........
 
// import java.util.Scanner;
// class loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number :");
//         int n = sc.nextInt();
//         int count = 0;
//         while (n!=0){
//             n/=10;
//             count++;
//         }
//         System.out.println(count);


//     }
// }



// sum of digit of a number ...............

// import java.util.Scanner;
// class loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number :");
//         int num = sc.nextInt();
//         int sum = 0;
//         while(num > 0){
//             int digit = num%10;
//             sum +=digit;
//             num /=10;
//         }
//         System.out.println(sum);


//     }
// }


// Factorial.......................

// import java.util.Scanner;
// class loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number :");
//         int n = sc.nextInt();
//         int fact = 1;
//         for(int i = 1; i<=n; i++){
//             fact*=i;
//         //  System.out.println(fact);

//         }
//         System.out.println(fact);
//     }
// }


// Reverse a number  ..............

// import java.util.Scanner;
// class loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number :" );
//         int n = sc.nextInt();
//         int r = 0;
//         while (n!=0){
//             r*=10;
//             r+=(n%10);
//             n/=10;
//         }
//         System.out.println(r);
//     }
// }
