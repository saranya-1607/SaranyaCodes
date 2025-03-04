import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a value:");
      int size= sc.nextInt();
      switch(size){
          case 29: System.out.println("Small");
                   break;
          case 30:System.out.println("medium");
                  break;
          case 38:System.out.println("Large");  
                  break;
          case 42:System.out.println("XLarge");
                  break;
          default:System.out.println("INVALID");
      }
      
    }
}
