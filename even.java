import java.util.Scanner;
public class even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number%2==0){
            System.out.println(number+"number is even");
        }
        else{
            System.out.println(number+"not a even its odd");
        }

    }
}
