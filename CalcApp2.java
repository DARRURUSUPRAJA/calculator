// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class CalcApp2 {
   public CalcApp() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Calculator Application");
      System.out.println("1. Addition");
      System.out.println("2. Subtraction");
      System.out.println("3. Multiplication");
      System.out.println("4. Division");
      System.out.print("Enter your choice (1-4): ");
      int var2 = var1.nextInt();
      System.out.print("Enter first number: ");
      double var3 = var1.nextDouble();
      System.out.print("Enter second number: ");
      double var5 = var1.nextDouble();
      switch (var2) {
         case 1:
            System.out.println("Result = " + (var3 + var5));
            break;
         case 2:
            System.out.println("Result = " + (var3 - var5));
            break;
         case 3:
            System.out.println("Result = " + var3 * var5);
            break;
         case 4:
            if (var5 != 0.0) {
               System.out.println("Result = " + var3 / var5);
            } else {
               System.out.println("Error: Cannot divide by zero");
            }
            break;
         default:
            System.out.println("Invalid choice");
      }

      var1.close();
   }
}
