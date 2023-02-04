import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter X, Y and N: ");
        int X = input.nextInt();
        int Y = input.nextInt();
        int N = input.nextInt();
        
            if (X % N == 0) {
                System.out.print(X + " ");
                  if(Y%N==0)
                    { System.out.print(Y + " ");}
                         
        }if (X%N!=0)
         {
             if(Y%N==0)
             {System.out.print(Y + " ");}
             else
             {System.out.print("NO OUTPUT");}
             
         }
       }
}
