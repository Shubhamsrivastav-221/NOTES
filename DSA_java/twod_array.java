// empty array..............

// public class twod_array {
//    public static void main(String[] args) {
//     int[][] arr = new int [3][4];
//     for(int i=0; i<3; i++){
//         for(int j=0; j<4; j++){
//             System.out.print(arr[i][j] + " ");

//         }
//         System.out.println();
//     }
//    }

// }


// print two D array.............

// class twod_array{
//     public static void main(String[] args) {
//         int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//         for(int i=0; i<arr.length; i++){
//             for(int j=0; j<arr[0].length; j++){
//                 System.out.print(arr[i][j]+ " ");
//             }
//             System.out.println();
//         }
//     }
// }



// taking input....................

// import java.util.Scanner;
// class twod_array{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[][] arr = new int [3][4];
//         for(int i=0; i<arr.length; i++){
//             for(int j=0; j<arr[0].length; j++){
//                 arr[i][j] = sc.nextInt();
//             }
//             System.out.println();
//         }

//     }
// }

// sum of 2D array..................

// class twod_array{
//     public static void main(String[] args) {
//         int[][] arr = {{1,2,3},{4,5,6}};
//         int sum = 0;
//         for(int i=0; i<arr.length; i++){
//             for(int j=0; j<arr[0].length; j++){
//                 sum += arr[i][j];
//             }
            
//         }
//         System.out.println(sum);
//     }
// }


// column wise print ................

// class twod_array{
//     public static void main(String[] args) {
//         int[][] arr = {{1,2,3},{4,5,6}};
//         for(int j=0; j<arr[0].length; j++){
//             for(int i =0; i<arr.length; i++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// transpose of matrix ...............

// class twod_array{
//     public static void main(String[] args) {
//         int[][] arr = {{2,8,6},{6,4,2},{3,4,9}};
//         for(int i=1; i<arr.length; i++){
//             for(int j=0; j<i; j++){
//                 int temp = arr[i][j];
//                 arr[i][j] = arr[j][i];
//                 arr[j][i] = temp;
//             }
//         }
//         print(arr);
//     }
//     private static void print(int[][] arr){
//       for(int[] a : arr){
//         for(int ele : a ){
//             System.out.print(ele+" ");

//         }
//         System.out.println();
//       }
//       System.out.println();
            
//         }
        
//     }


// 2D array list....................

// import java.util.ArrayList;

// class twod_array {
//     public static void main(String[] args) {

//         ArrayList<Integer> a = new ArrayList<>();
//         a.add(3); 
//         a.add(13); 
//         a.add(36);

//         ArrayList<Integer> b = new ArrayList<>();
//         b.add(5); 
//         b.add(15); 
//         b.add(96);

//         ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
//         arr.add(a);
//         arr.add(b);

//         for(ArrayList<Integer> List : arr) {
//             for(int ele : List) {
//                 System.out.print(ele + " ");
//             }
//             System.out.println();
//         }
//     }
// }



// print materix in snake pattern..............

// class twod_array {
//     public static void main(String[] args) {
//         int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//         for(int i=0; i<arr.length; i++){
//             if(i%2 == 0){
//                 for(int j=0; j<arr[0].length; j++){
//                     System.out.print(arr[i][j]+" ");
//                 }
//             }else{
//                 for(int j=arr[0].length-1; j>=0; j--){
//                     System.out.print(arr[i][j]+" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }































