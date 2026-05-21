
 // pattern printing rectangle .............. 

// import java.util.Scanner;
// class pattern{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("enter row :");
//     int a = sc.nextInt();
//     System.out.print("enter column :");
//     int b  = sc.nextInt();
//     for(int i =  1; i<=a; i++){
//         for(int j=1; j<=b; j++){
//             System.out.print("*"+ " ");
//         }
//         System.out.println();
//     }
//   }
// }

// Square pattern printing...............

// import java.util.Scanner;
// class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number :");
//         int n = sc.nextInt();
//         for(int i= 1; i<=n; i++){
//             for(int j = 1; j<=n; j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// number pattern printing ( 1 2 3 )....................

// import java.util.Scanner;
// class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number :");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// pattern printing (A B C D)................

// import java.util.Scanner;
// class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number :");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n; j++){
//                System.out.print((char)(j+64)+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// pattern printing (a b c d )................

// import java.util.Scanner;
// class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number :");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n; j++){
//                System.out.print((char)(j+96)+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// // pattern printing (1 1 1 1)................


// import java.util.Scanner;
// class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number :");
//         int n = sc.nextInt();
//         for(int i = 1; i<=n; i++){
//             for(int j=1; j<=n; j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// // pattern printing (A A A A )................

// import java.util.Scanner;
// class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number :");
//         int n = sc.nextInt();
//         for(int i = 1; i<=n; i++){
//             for(int j=1; j<=n; j++){
//                 System.out.print((char)(i+64)+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// pattern printing star triangle..........

// import java.util.Scanner;
// class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number :");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// pattern printing number triangle..........

// import java.util.Scanner;
// class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number :");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }



// pattern printing reverse star triangle..........

//  import java.util.Scanner;
// class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number :");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){         // using condition j<= (n+1-i)
//             for(int j=1; j<=n+1-i; j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//     }
// }



// print hollow rectangle pattern............

// import java.util.Scanner;
// class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number :");
//         int m = sc.nextInt();
//         System.out.println("Enter number :");
//         int n = sc.nextInt();
//         for(int i=1; i<=m; i++){
//             for(int j=1; j<=n; j++){
//                 if(i==1 || i==m || j==1 || j==n)
//                 System.out.print("* ");
//                 else System.out.print("# ");
//             }
//             System.out.println();
//         }
//     }
// }

// print floyd's triangle pattern.................

// import java.util.Scanner;
// class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter number :");
//         int n = sc.nextInt();
//         int a = 1;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(a++ +" ");
//             }
//             System.out.println();
//         }

//     }
// }



//Print binary triangle pattern ................

// import java.util.Scanner;
// class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number :");
//         int n = sc.nextInt();
//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j<=i; j++){
//                 if((i+j)%2==0)System.out.print(1+" ");
//                 else System.out.print(0+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// print star triangle vertically flipped....................

// import java.util.Scanner;
// class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number :");
//         int n = sc.nextInt();
//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j<=n; j++){
//                 if(i+j>n)System.out.print("*"+" ");
//                 else System.out.print(" " +" ");
//             }
//             System.out.println();
//         }
//     }
// }


// print star triangle vertically flipped second method....................

// import java.util.Scanner;
// class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number :");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" "+" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// print number triangle vertically flipped....................

// import java.util.Scanner;
// class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number :");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" "+" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// print rhombus Star pattern...................

// import java.util.Scanner;
// class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number :");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" "+" ");
//             }
//             for(int j=1; j<=n; j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//     }
// }



// print pyramid star pattern...................

// import java.util.Scanner;
// class pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number :");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//             System.out.print(" "+" "); 
//             }
//             for(int j=1; j<=2*i-1; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }



