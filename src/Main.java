import java.io.Reader;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //1
        String BMW;
        //2
        final int NUM= 15;
        //3
        String word = "The";
        //4
        String Bmw =word+""+NUM;
        System.out.println (Bmw);
        //5
        String BmwWord;
        //6
        if (NUM <0){
            System.out.println("вы сохранили отрицательное число");
        }
        if (NUM >0){
            System.out.println("вы сохранили положительное число");
        } else{
            System.out.println("вы сохранили ноль");
        }

        //7
        System.out.println("Enter your name");
        //8
       Scanner a  = new Scanner(System.in);
       String name = a.nextLine();
       System.out.println(name);
       //9
        System.out.println (" Hi " + name);

    }
}