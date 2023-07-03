import java.util.Scanner;
public class addition{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        char operator=sc.next.charAt(0);
        if(operator=='+'){
            System.out.println("Sum is: "+(a+b));
        }
        else if(operator=='-'){
            System.out.println("Subtraction is: "+(a-b));
        }
        else if(operator=='*'){
            System.out.println("Multiplication is: "+(a*b));
        }
        else if(operator=='/'){
            System.out.println("Division is: "+(a/b));
        }
        else if(operator=='%'){
            System.out.println("reaminder: "+(a%b));
        }
        else{
            System.out.println("enter proper operator");
        }
    }
}
