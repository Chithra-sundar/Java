public class StringReverese {
    public static void main(String[] args) {
        System.out.println(reverseString("Gomathi Chithra"));    
    }
    public static String reverseString(String str){
        String reversed="";
        int length=str.length();
        length--;
        while(length>=0){
            reversed+=str.charAt(length--);
        }
        return reversed;
    }
}
