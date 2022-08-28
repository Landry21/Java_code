/*
runtime:O(n)
space:O(n^2)
*/
    private static final int N = 26;
    private static final char START = 'a';
    public static String isValid(String s) {
    // Write your code here
        int[] frequencies = new int[N];
        for(int i =0; i<s.length(); i++){
            frequencies[s.charAt(i) - START]++;
        }
        
        Map<Integer, Integer> freqToNumOfCharsMap = new HashMap<>();
        for(int k=0; k<N; k++){
            int key = frequencies[k];
            if(frequencies[k] == 0) continue;
            if(freqToNumOfCharsMap.containsKey(key)){
                int updatedNumOfChars = freqToNumOfCharsMap.get(key) + 1;
                freqToNumOfCharsMap.put(key, updatedNumOfChars);
            }else{
                freqToNumOfCharsMap.put(key, 1);
            }
        }
        if(freqToNumOfCharsMap.size() ==1) return "YES";
        if(freqToNumOfCharsMap.size() >2) return "NO";
        if(freqToNumOfCharsMap.containsKey(1) && freqToNumOfCharsMap.get(1) == 1) return "YES";
        int max = freqToNumOfCharsMap.keySet().stream().mapToInt(i -> (int) i).max().getAsInt();
        int min = freqToNumOfCharsMap.keySet().stream().mapToInt(i -> (int) i).min().getAsInt();
        if(freqToNumOfCharsMap.get(max) == 1 && max - min == 1) return "YES";
        
        return "NO";
    }
