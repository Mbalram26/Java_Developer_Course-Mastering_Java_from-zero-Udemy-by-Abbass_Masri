import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        /**** coding challenge #1 ****/

//    Write a java program that allow the user to  enter his weight and height.
//    and display the BMI (Body Mass Index) for this user.
//    The formula for BMI = Kg/m2
//    where Kg is persons weight in Kilograms
//    and m2 is height in meter square.

        // write your code here
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Weight:- ");
        float Weight=sc.nextFloat();
//        int Weight=sc.nextInt
        System.out.print("Enter The Height:- ");
        float Height=sc.nextFloat();
//        int Weight=sc.nextInt
        float BMI=Weight/(Height*Height);
        System.out.println("BMI IS :- " + BMI);
    }
}
