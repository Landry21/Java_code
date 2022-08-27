/*
Runtime:O(n^2)
space:O(n)
*/
public static int gemstones(List<String> arr) {
    // Write your code here
        String temp= arr.get(0);
        HashSet <String> charSet= new HashSet<>();
        for(String str: temp.split("")){
            charSet.add(str);
        }
        int counter =0;
        for(String c: charSet){
            boolean valid= true;
            for(int i =1; i<arr.size();i++){
                String current = arr.get(i);
                if(!current.contains(c)){ valid=false; }
            }
            if(valid){counter++;}
        }
        return counter;
    }
