/*
runtime:O(log N)
space:O(1)
*/
public static int theLoveLetterMystery(String s) {
    // Write your code here
        int counter=0;
        int i=0,j=s.length()-1;
        while(i<j){
            //abs is used to make sure that it never goes in the negative
            counter+=Math.abs((int)s.charAt(j)-(int)s.charAt(i));
            i++;
            j--;
        }
        return counter;
  }
