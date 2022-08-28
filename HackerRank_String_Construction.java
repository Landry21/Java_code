/*
Runtime:O(N)
Space:O(N)
*/

public static int stringConstruction(String s) {
    // Write your code here
        int price=s.length();
        Set<Character> check= new HashSet<>();
        for(char i:s.toCharArray()){
            if(check.contains(i)){price--;}
            else{check.add(i);}
        }
        return price;
 }
