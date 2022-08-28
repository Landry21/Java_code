/*
runtime:O(n)
space:O(n)
*/
public static String gameOfThrones(String s) {
    // Write your code here
        Map<Character,Integer> res= new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(res.containsKey(s.charAt(i))){
                res.put(s.charAt(i),res.get(s.charAt(i))+1);
            }
            else{
                res.put(s.charAt(i),1);
            }
        }
        int odd=0,even=0;
        for(int i:res.values()){
            if(i%2==0){even++;}
            else{odd++;}
        }
        if(odd>1) return "NO";
        else return "YES";
        
    }
