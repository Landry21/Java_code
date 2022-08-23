/*
runtime:O(log n)
space: O(1)
*/
public static void separateNumbers(String s) {
    // Write your code here
    String res="";
    boolean isValid = false;
    for(int i=1;i<=s.length()/2;i++){
        res=s.substring(0,i);
        long num = Long.parseLong(res);
        String valid= res;
        while(valid.length()<s.length()){
            valid+=Long.toString(++num);
        }
        if(s.equals(valid)){
            isValid=true;
            break;
        }
    }
        System.out.println(isValid ? "YES " + res : "NO");

    }
