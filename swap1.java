import java.util.*;
public class swap1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int g=sc.nextInt();
        int c=b;
        b=g;
        g=c;
        String res=String.format("after swapping \nboy =%d \ngirl =%d",b,g);
        System.out.println(res);
    }
}