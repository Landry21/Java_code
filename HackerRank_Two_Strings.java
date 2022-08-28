/*
Runtime:O(N*M)
space:O(n)
*/
public static String twoStrings(String s1, String s2) {
    // Write your code here
    Set<Character> check=new HashSet<>();
    for(int i=0;i<s1.length();i++){
        check.add(s1.charAt(i));
    }
    for(int i=0;i<s2.length();i++){
        if(check.contains(s2.charAt(i))){return "YES";}
    }
    return "NO";
   }
