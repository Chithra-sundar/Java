import java.util.Scanner;

public class vowelsin0thindex {
    public static void main(String[] args) {
        String val;
        Scanner scan=new Scanner(System.in);
        val=scan.nextLine();
        String arr[]=val.split(" ");
        int n=arr.length;
        String vowels="";
        for(int i=0;i<=n-1;i++)
        {
            String str=arr[i];
            char ch=str.charAt(0);
            if(ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
             vowels=vowels+ch;
            }
        }
System.out.println(vowels);
    }
}
}
