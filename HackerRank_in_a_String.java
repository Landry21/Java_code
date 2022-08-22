/*
runtime: O(n*m)
space : O(1)
*/
public static String hackerrankInString(String s) {
    // Write your code here
    int size=s.length();
    String ref="hackerrank";
    for(int i=0;i<size;i++){
        int idx=0;
        for(int j=0;j<s.length();j++){
            if(idx==8){break;}
            if(s.charAt(j)==ref.charAt(idx)){
                idx++;
            }
        }
        if(idx==8){ return "YES";
        }
    }
    return "NO";
    }
