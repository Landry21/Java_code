/*
runtime:O(logN)
space:O(1)
*/
public static int anagram(String s) {

        if (s.length() % 2 == 1) {
            return -1;
        }

        var a = new int[26];
        var b = new int[26];

        for (int i = 0; i < s.length() / 2; i++) {
            a[s.charAt(i) - 'a']++;
        }

        for (int i = s.length() / 2; i < s.length(); i++) {
            b[s.charAt(i) - 'a']++;
        }

        int count = 0;
        for (int i = 0; i < 26; i++) {
            count += Math.abs(a[i] - b[i]);
        }

        return count / 2;
    }
