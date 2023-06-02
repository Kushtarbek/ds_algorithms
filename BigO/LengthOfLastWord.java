package BigO;

public class LengthOfLastWord {

    public int lengthOfLastWord( String s){
       int ind = s.length()-1;
       while( s.charAt(ind) != ' '){
           ind--;
       }

       int res = 0;
       while( ind >= 0 && s.charAt(ind) != ' '){
           ind--;
           res++;
       }
       return res;
    }

}
