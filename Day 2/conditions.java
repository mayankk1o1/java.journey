import java.util.Scanner;

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();

//         if (age>18){
//             System.out.println("Adult");
//         } else {
//             System.out.println("Not Adult");
//         }
//     }
    
// }


// If else with even and odd using %

public class conditions{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a % 2 == 0 ){
            System.out.println(a + " is a Even Number");
        }else {
            System.out.println(a + " is a Odd number");
        
        }


    }
}