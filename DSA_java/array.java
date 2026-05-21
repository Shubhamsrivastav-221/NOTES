
// indexing and updating basic..........

// public class array {
//     public static void main(String[] args) {
//        int [] arr = {1,5,5,8,6,1,4,};

//         System.out.println(arr[2]); // indexing 

//        arr[3] = 18;     // updating 
//        System.out.println(arr[3]);
//     }
// }


 // traversing ..............

// class array{
//     public static void main(String[] args) {
//         int [] arr = {5,9,6,4,7,15,25,45,75,12,32};
//        for(int i=0; i<arr.length; i++){
//         System.out.print(arr[i]+" ");
//     }
// }
// }


// array length.................

// class array{
//     public static void main(String[] args) {
//         int [] arr = {8,25,5,8,5,5,5,5,5,5,5,4,4,8,8,5,5};
//         System.out.println(arr.length);
     
//     }
// }


// input value..................

// import java.util.Scanner;
// class array{
//     public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//         System.out.print("enter number :");
//         int[] arr = new int[9];
//         for(int i=0; i<9; i++){      // input 
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0; i<9; i++){
//             System.out.print(arr[i]+" ");  // print
//         }

//     }
// }



// print double input value .............

// import java.util.Scanner;
// class array{
//     public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//         System.out.print("enter number :");
//         int[] arr = new int[6];
//         for(int i=0; i<6; i++){      // input 
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0; i<6; i++){
//             System.out.print(2*arr[i]+" ");  // print
//         }

//     }
// }


 // printing negative value................

// import java.util.Scanner;
// class array{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("ENTER NUMBER :");
//         int n = sc.nextInt();
//         int [] arr = new int[n];
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0; i<n; i++){
//             if(arr[i]<0) System.out.print(arr[i]+" ");
//         }
//     }
// }


// print sum of element ............

// class array{
//     public static void main(String[] args) {
//         int[] arr = {5,6,8,5,7,15,2};
//         int sum = 0;
//         for(int i=0; i<arr.length; i++){
//             sum +=arr[i];
//         }
//         System.out.println(sum);
//     }

// }


// pasing array to method.........

// class array{
//     public static void main(String[] args) {
//         int[] x = {5,4,7,8,12,45,25,};
//         System.out.println(x[2]);
//         change(x);
//         System.out.println(x[2]);
//     }
//     public static void change(int [] y){
//         y[2] = 50;
//     }
// }



// sort arrayy builtin.............

// import java.util.Arrays;
// class array{
//     public static void main(String[] args) {
//         int [] arr = {4,5,2,1,6,3,};
//         print(arr);
//         Arrays.sort(arr);
//         print (arr);
//     }
//     public static void print(int [] arr){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
// }


// product of array ................

// class array{
//     public static void main(String[] args) {
//         int [] arr = {2,5,6,7,};
//         int product = 1;
//         for(int i=0; i<arr.length; i++){
//             product *=arr[i];
//         }
//         System.out.println(product);

//     }
// }


// print the second maximum element ..........

// class array{
//     public static void main(String[] args) {
//         int [] arr = {5,8,8,65,4,87,2,35};
//         int max = Integer.MIN_VALUE;
//         int smax = Integer.MIN_VALUE;

//         for(int i=0; i<arr.length; i++){
//             if(arr[i]>max) max = arr[i];
//         }
//         for(int i=0; i<arr.length; i++){
//             if(arr[i]>smax && arr[i]!= max) smax = arr[i];
//         }
//         System.out.println(max);
//         System.out.println(smax);
//     }
// }



// for each loop...................

// class array{
//     public static void main(String[] args) {
//         int [] arr = {4,5,2,1,6,8,9,7};
//         for(int ele : arr){
//             System.out.print(ele + " ");
//         }
//     }
// }



// Reverse array ................
 
// class array{
//     public static void main(String[] args) {
//         int [] arr = {4,5,6,2,4,8,6,5,7,5,};
//         int n = arr.length;
//         int i = 0, j = n-1;
//         while(i<j){
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//             i++;
//             j--;
//         }
//         for(int ele :arr) System.out.print(ele+" ");

//     }
// }


// two pointer techinque............. 

class array{
    public static void main(String[] args) {
        int [] arr = {4,5,6,2,4,8,6,5,7,5,};
        int n = arr.length;
        int i = 2, j = 6;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int ele :arr) System.out.print(ele+" ");

    }
}



















