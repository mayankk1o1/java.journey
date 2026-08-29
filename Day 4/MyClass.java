class computer
{   
    public void playMusic()
    {
        System.out.println("Music Playing....");
    }
    public int displaynumber()
    {
        // num+=1;
        return 56;
    }
}
public class MyClass{
        public static void main(String[] a) {
        
            computer comp= new computer();
            comp.playMusic();
            int num2 = comp.displaynumber();
            System.out.println(num2);
    }
}