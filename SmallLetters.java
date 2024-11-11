import java.util.Scanner;

public class SmallLetters {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        String val;
        val=sin.nextLine();
        int length=val.length();
        int count=0;
        for(int i=0;i<=length-1;i++)
        {
       if(val.charAt(i)>='a' && val.charAt(i)<='z' )
       {
        count++;
       }
}
System.out.print("Small letters present in this string are:"+ count);
    }
}
