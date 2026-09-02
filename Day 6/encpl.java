//what we are doing here is making our variable private
//only was to access them is thru the methods we have set and get

class Human
{
    private int age;
    private String name;


    //Below are setters and getters
    //ALways use names to make it look good and readble

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}

public class encpl{
    public static void main(String[] args) {

        Human hum= new Human();  //Assigning the value with the help of
        hum.setName("maxxxx"); //methods
        hum.setAge(15);

        System.out.println(hum.getName() + " : " +  hum.getAge());
    }
}