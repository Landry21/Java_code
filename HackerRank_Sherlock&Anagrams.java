/*
space:O(n)
runtime:O(n^2)
*/
public static int sherlockAndAnagrams(String s) {
    // Write your code here
     Map<String,Integer> subs= new HashMap<>();
     for (int i=0;i<s.length();i++){
         for(int j=i;j<s.length();j++){
             char[] c= s.substring(i, j+1).toCharArray();
             Arrays.sort(c);
             String k = new String(c);
             if(subs.containsKey(k)){
                 subs.put(k,subs.get(k)+1);
             }else{
                 subs.put(k,1);
             }
         }
     }
     int counter=0;
     for(String k: subs.keySet()){
         int v = subs.get(k);
         counter+=(v*(v-1))/2;
     }
     return counter;
    }
