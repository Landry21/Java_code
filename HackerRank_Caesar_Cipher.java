/*
Space: O(n)
Runtime: O(1)
*/
 StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            boolean Upper= Character.isUpperCase(c);
            if(Character.isLetter(c)){
                c+=k%26;
                if(!Character.isLetter(c)||(Upper&&!Character.isUpperCase(c))){c-=26;}
            }
            res.append(c);
        }
        return res.toString();
