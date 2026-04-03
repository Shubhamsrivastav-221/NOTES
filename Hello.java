// For loop 
// The for loop is used when the number of iterations is known in advance.

// class Hello {
//     public static void main(String[] args) {

//         for (int i = 1; i <= 5; i++) {
//             System.out.println(i);
//         }
//     }
// }

//While loop
//The while loop executes a block of code as long as the condition is true.

// class Hello {
//     public static void main(String[] args) {
//         int i = 1;
//         while (i <= 5) {
//             System.out.println(i);
//             i++;
//         }
//     }
// }

// Do-while loop
//The do-while loop executes the code at least once, even if the condition is false.

// class Hello {
//     public static void main (String[] args){
//         int i = 1;
//         do {
//             System.out.println(i);
//             i++;
//         }while (i <=5);
//     }
// }

// One Dimensional Array
// A one-dimensional array is a collection of elements of the same type
// stored in continuous memory locations and accessed using a single index.

// class Hello {
//     public static void main (String[] args){
//         int [] arr = {1, 2, 3, 4, 5, 6};
//         for (int i = 0; i < arr.length; i++){
//             System.out.println(arr[i]);
//         }

//     }
// }

// Two Dimensional Array
// A two-dimensional array is an array of arrays where 
// elements are stored in row and column form and accessed using two indices.

// class Hello {
//     public static void main(String[] args) {
//         int[][] arr = { { 1, 2, 3 },
//                 { 4, 5, 6 }};
//         for (int i = 0; i < 2; i++) {
//             for (int j = 0; j < 3; j++) {
//                 System.out.println(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// Vector
// A vector is a dynamic array that can grow or shrink in size as needed.

// import java.util.Vector;
// class Hello {
//     public static void main (String[]args){
//         Vector<Integer> v = new Vector<>();
//         v.add(10);
//         v.add(20);
//         v.add(30);
//         System.out.println(v);
//     }
// }

class Hello {
    public static void main(String[] args) {
        int number = 15;

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        // nested if-else example
        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println(number + " is zero.");
        }
    }
}

