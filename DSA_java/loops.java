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
import java.util.Scanner;
class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();
        int a = 1 , r = 2;
        for (int i = 1; i<=n; i++){
            System.out.println(a+" ");
            a*=r;
        }
    }
}
















