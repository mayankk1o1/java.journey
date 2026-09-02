public class string{
    public static void main(String[] a){
        //Srings are immutable 

        String str = "Mayank"; 
        System.out.println(str);


        //mutable strings can be defined as Stringbuffer
        //we can change this 
        //this keeps extra 16 spaces after anything given to it

        StringBuffer sb = new StringBuffer("Maxy waxy");

        //to add anything after it or make changes
        sb.append(" ehehehehe");
        System.out.println(sb);
        
    }
}