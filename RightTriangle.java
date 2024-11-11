import java.util.Scanner;
public class RightTriangle
{
    public static void main(String[] args) {
        int n,space,j;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number");
        n=scan.nextInt();
        for(int i=1;i<=n;i++){
        for(space=1;space<=n-i;space++)
        {
        System.out.print(" ");
        }
        for(j=1;j<=i;j++)
        {
        System.out.print("*");
        }
        System.out.println("");
        }
           
        }
    }
  
    


