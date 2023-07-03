//import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
import java.util.*;
class helloworld{
    public void run(){
        String s="21";
        int num=Integer.parseInt(s);
        System.out.println(num);
        System.out.println("this is a non static method u need to create an object");
    }
    public static void method(){
        String ex="this is vishal";
        System.out.println(ex);
        System.out.println("this is the static method u need not have create object");
    }
    public static void main(String[] args){
        helloworld obj=new helloworld();
        System.out.println("Hello world");
        System.out.println("this is my first program in java");
        obj.run();
        method();
    }
}