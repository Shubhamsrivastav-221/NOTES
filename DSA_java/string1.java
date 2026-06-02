// class string1{
//     public static void main(String[] arge){
//         char[] arr = {'s' ,'h','u','b','h' ,'a', 'm'};
//         for(char ele : arr){
//             System.out.print(ele+" ");
//         }
//     }
// }

// taking input.............  

// import java.util.Scanner;
// class string1{
//     public static void main(String[] args){
//         System.out.println("enter char :");
//         Scanner sc = new Scanner(System.in);
//         String S = sc.next();
//         System.out.println(S);
//     }
// }


// inbuilt function ...............

// import java.util.Scanner;
// class string1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter char :");
//         String s = sc.nextLine();
//         System.out.println(s);
//         System.out.println(s.charAt(4)); // give char at index 4
//         System.out.println(s.toUpperCase());
//         System.out.println(s.endsWith("m"));
//         System.out.println(s.startsWith(s));
//         System.out.println(s.contains("shub"));

//     }

// }


// count the number of vowels in a given string..................

// class string1{
//     public static void main(String[] args) {
//         String s = "aeiousadgfmhbhgf";
//         int count = 0;
//         for(int i=0; i<s.length(); i++){
//             char ch = s.charAt(i);
//             if(ch == 'a' || ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'){
//                 count++;
//             }
//             System.out.println(count);
//         }

//     }
// }



 // compare string ................

// class string1{
//     public static void main(String[] args) {
//         String s1 = new String ("shubham");
//         String s2 = new String ("shubham");
//         System.out.println(s1.equals(s2));

//     }
// }


// String builders................

// class string{
//     public static void main(String[] args) {
//          StringBuilder s = new StringBuilder("shubham");
//         s.append("srivastav");
//         System.out.println(s); 
//     }
// }

// reverse string ..................

// class string1{
//     public static void main(String[] args) {
//         String s = "Shubham";
//         StringBuilder sb = new StringBuilder(s);
//         sb.reverse();
//         System.out.println(sb);

//     }
// }

