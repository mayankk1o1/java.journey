public class array{
    public static void main(String[] a){

        int num[] = {1,3,45,6};

        num[2] = 67; //Updating the array

        //dynamic array 

        // int num1[] = new int[5]; //5 is the size of array and all values are 0 

        // for(int i=0; i<5;i++){
        //     num1[i] = i+5;
        //     System.out.println(num1[i]);
        // }
        
        //multi-dimensional array 

        int num2[][]= new int[3][4];

        for(int i=0; i<3;i++){
            for(int j=0; j<4;j++){
                num2[i][j]= i*10;
                System.out.print(num2[i][j] + " ");
            }
            System.out.println();
        }
    }
}