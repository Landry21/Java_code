/*
runtime: O(n)
space:O(1)
*/
   public static int alternatingCharacters(String s) {
    // Write your code here
        int counter=0,i=0;
        while(i<s.length()-1){
            if(s.charAt(i)==s.charAt(i+1)){
                counter++;
            }
            i++;
        }
        return counter;
    }
