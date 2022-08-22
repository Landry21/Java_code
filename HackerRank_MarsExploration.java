/*
 Space:O(1)
 Runtime:O(log n)
 */
public static int marsExploration(String s) {
    // Write your code here
        //boolean check= false;
        int counter=0;

        int i=0;
        while(i<s.length()){
           if(s.charAt(i)!='S'){
                counter++;
            } 
            if(s.charAt(i+1)!='O'){
                counter++;
                
            }
            
            if(s.charAt(i+2)!='S'){
                counter++;
            }
           i+=3;
        }
        return counter;
    }
