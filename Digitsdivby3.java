import java.util.Scanner;

public class Digitsdivby3 {
    public static void main(String[] args) {
        int num;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the digits:");
        num=scan.nextInt();
        String str=String.valueOf(num);
        int len=str.length();
        int number=0;
        int value=0;
        for(int i=0;i<=len-1;i++)
        {
        number=num%10;
        value=value+number;
        num=num/10;
               }
               System.out.println("Sum of digits:"+value);
  
  if(value%3==0)
  {
System.out.println("True");
  }
  else{
    System.out.println("False");
  }
}
}


