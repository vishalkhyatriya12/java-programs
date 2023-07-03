import java.util.Scanner;
public class simple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float p=sc.nextFloat();
        float t=sc.nextFloat();
        float r=sc.nextFloat();
        double si=p*t*r/100;
        si=10f;
        System.out.println("calculated Simple Intrest:"+si);
    }
    
}
