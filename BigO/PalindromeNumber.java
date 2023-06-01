package BigO;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        if(x < 0) return false;

        int y = 0;
        int temp = x;
        while( temp > 0){
            y *= 10;
            y += temp % 10;
            temp /= 10;

        }
        return (x== y);
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(121));
    }



}
