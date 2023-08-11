// package Function_Ques;
// import java.util.Scanner;



// public class Emirp_num {

//     static boolean Find_Emirp(int n){       
//         // int rem = 0, rev = 0, temp = n;        
//         boolean primeNum = FindPrime(n);

//         if (primeNum == true) {
//             int rev = FindReverse(n);
//         }
//         boolean result = FindPrime(rev);
        

        
        
//     }
    
//     static boolean FindPrime(int n){ 
//         for (int i = 2; i <=n/2; i++) {

//             if (n%2==0) {
//                 return false;
//             }        
            
//         }
//         return true;       
//     }
    
//     static int FindReverse(int primeNum){

//         int rem = 0, rev = 0;

//         while (primeNum > 0) {
//             rem = primeNum % 10;
//             rev = rev * 10 + rem;
//             primeNum = primeNum / 10;
//         }
//         return rev;
//     }
    
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("ENTER A NUMBER : ");
//         int num = sc.nextInt();

//         boolean result = Find_Emirp(num);

//         if (result == true) {
//             System.out.println("NUMBER IS PALINDROME");            
//         } else {
//             System.out.println("NUMBER IS NOT A PALINDROME");            
//         }
//     }
// }
