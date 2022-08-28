/*
Runtime:O(N*M)
Space:O(n)
*/

public static int makingAnagrams(String s1, String s2) {
    // Write your code here
        int common=0;
        Map<Character,Integer> tracker= new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(tracker.containsKey(s1.charAt(i))){
                tracker.put(s1.charAt(i),tracker.get(s1.charAt(i))+1);
            }
            else{
                tracker.put(s1.charAt(i),1);
            }
        }
        for(int i=0;i<s2.length();i++){
            if(tracker.containsKey(s2.charAt(i))){
                if(tracker.get(s2.charAt(i))==1){tracker.remove(s2.charAt(i));}
                else{
                    tracker.put(s2.charAt(i),tracker.get(s2.charAt(i))-1);
                }
            }
            else{
                common++;
            }
        }
        for(int i:tracker.values()){
            common+=i;
        }
       return common; 
   }
