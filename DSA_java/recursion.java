// print recursion ..................

// import java.util.Scanner;
// public class recursion {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         print(1,n);
//     } 
//     public static void print(int x, int n){
//         if(x>n) return;
//         System.out.println(x);
//         print(x+1,n);
//     }
// }


// second method ...............

// import java.util.Scanner;
// class recursion{
//     static int n;
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         n = sc.nextInt();
//         print(n);


//     }
//     public static void print(int n){
//         if(n==0) return;
//         print(n-1);
//         System.out.println(n+" ");
//     } 
// }

// print decreasing and increasing ............

// import java.util.Scanner;
// class recursion{
//     static int n;
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         n = sc.nextInt();
//         print(n);

//     }
//     public static void print(int n){
//         if(n==0)return;
//         System.out.println(n+" ");
//         print(n-1);
//         System.out.println(n+" ");
//     }
// }


// print decreasing and increasing without double 1 ............

// import java.util.Scanner;
// class recursion{
//     static int n;
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         n = sc.nextInt();
//         print(n);

//     }
//     public static void print(int n){
//         if(n==0)return;
//         System.out.print(n+" ");
//         print(n-1);
//         if(n!=1) System.out.print(n+" ");
//     }
// }



// a raised to the power b ...............

import java.util.Scanner;
class recursion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st number :");
        int a = sc.nextInt();
        System.out.print("enter 2nd number :");
        int b = sc.nextInt();
        System.out.println(pow(a,b));

    }
    public static int pow (int a , int b){
        if(b==0) return 1;
        int call = pow(a,b/2);
        if(b%2==0) return call*call;
        else return a*call*call;

    }
}









