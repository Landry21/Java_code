/*
Space:O(1)
runtime:(n^2)
*/

public static String funnyString(String s) {
    // Write your code here
        int i=1,j=s.length()-1;
        
        while(i<s.length()&&j>0){
            int og= Math.abs((int)s.charAt(i)-s.charAt(i-1));
            int rev=Math.abs((int)s.charAt(j)-s.charAt(j-1));
            
            if(og!=rev){
             return "Not Funny";
            }
            i++;
            j--;
        }
        return "Funny";
   }
