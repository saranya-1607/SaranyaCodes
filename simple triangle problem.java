//Prob 2: Write a program to check whether a triangle can be formed with the given values for the angles.
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a num1:");
      int num1 = sc.nextInt();
      System.out.println("enter a num2:");
      int num2 = sc.nextInt();
      System.out.println("enter a num3:");
      int num3 = sc.nextInt();
      if(num1+num2+num3==180){
          System.out.println("triangle can be formed");
      }else{
          System.out.println("triangle can't be formed.");
      }
      
    }
}
