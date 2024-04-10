package Inheritance;

class Multi
{
    void Biology(){
        System.out.println("This is Boilogy");
    }
}
    class Student extends Multi{

        }

        class Man extends Multi{

        }
public class Animal {
    public static void main(String[] args) {
        Multi d = new Multi();
        d.Biology();
        d.Biology();
    }

}
