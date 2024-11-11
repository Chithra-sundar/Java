import java.util.Scanner;
public class index {
    

    public static void main(String[] args) {
        String str;
        char val;
        Scanner sin=new Scanner(System.in);
        System.out.println("Enter the string:");
        str=sin.nextLine();
        System.out.println("Enter the character:");
        val=sin.next().charAt(0);
        int ans=str.indexOf(val);
        System.out.print("Index position of that character is:"+ans);
    }
}

