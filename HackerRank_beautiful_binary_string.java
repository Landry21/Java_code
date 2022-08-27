/*
space:O(1)
runtime:O(n)
*/
public static int beautifulBinaryString(String b) {
    // Write your code here
     int i=0,counter=0;
     while(i<b.length()-2){
         String str=b.substring(i, i+3);
         if(str.equals("010")){
             counter++;
             i+=3;
             continue;
         }
         i++;
     }
     return counter;
    }
