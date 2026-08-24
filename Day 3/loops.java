import java.util.Scanner;

public class loops{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many time you want the loop to run - ");
        int a = sc.nextInt();
        for (int counter = 0; counter<a; counter+=1 ){
            System.out.println("Hey, I am Max " + counter);
        }
    }
}