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

// import java.util.Scanner;
// class recursion{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter 1st number :");
//         int a = sc.nextInt();
//         System.out.print("enter 2nd number :");
//         int b = sc.nextInt();
//         System.out.println(pow(a,b));

//     }
//     public static int pow (int a , int b){
//         if(b==0) return 1;
//         int call = pow(a,b/2);
//         if(b%2==0) return call*call;
//         else return a*call*call;

//     }
// }


// recursion on array ...............

// class recursion{
//    public static void main(String[] args) {
//     int [] arr = {2,5,6,6,4,8,9,1,4,6,12,3,5};
//     print(arr,0);
//    }
//    public static void print(int[] arr, int idx){
//     int n = arr.length;
//     if(idx==n) return;
//     System.out.print(arr[idx]+" ");
//     print(arr,idx+1);
//    }
// }


//  reverse recursion on array ...............

// class recursion{
//    public static void main(String[] args) {
//     int [] arr = {2,5,6,6,4,8,9,1,4,6,12,3,5};
//     int n = arr.length;
//     print(arr,n-1);
//    }
//    public static void print(int[] arr, int idx){
//     if(idx<0) return;
//     System.out.print(arr[idx]+" ");
//     print(arr,idx-1);
//    }
// }


// search on array.....................

// class recursion{
//     public static void main(String[] args) {
//         int[] arr = {1,2,6,3,2,1,4,5,12,14,15,16,18};
//         int target = 17;
//         System.out.println(exists(arr,target,0));
//     }
//     public static boolean exists(int[]arr, int target, int idx){
//         if(idx==arr.length) return false;
//         if(arr[idx]==target) return true;
//         return exists(arr,target,idx+1);
//     }
// }


// pre In post .....................


// class recursion{
//  public static void main(String[] args) {
//     pip(2);
//  }
//  public static void pip(int n){
//     if(n==0) return;
//     System.out.print(n+" "); // pre 
//     pip(n-1);
//      System.out.print(n+" "); // In 
//     pip(n-1);
//     System.out.print(n+" "); // post 

//  }
// }


// Tower of hanoi ............
// class recursion{
//     public static void main(String[] args) {
//         hanoi(5,'A','B','C');
//     }
//     private static void hanoi(int n,char a, char b,char c){
//         if(n==0) return;
//         hanoi(n-1,a,c,b);  // n-1 disk from A to B via C
//         System.out.println(a+"->"+c); // largest from A to C
//         hanoi(n-1,b,a,c); // n-1 disk from B to C via A
//     }
// }