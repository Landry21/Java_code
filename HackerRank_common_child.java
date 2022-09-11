/*
space:O(1)
runtime:O(m*n)
*/
public static int commonChild(String s1, String s2) {
    // Write your code here
        return LCSM4(s1.toCharArray(),s2.toCharArray(),s1.length(),s2.length());
    }
    public static int LCSM4(char[]x,char[]y, int m,int n){
        int visited [] = new int [n+1];
        
        for(int i =1; i <= m ;i++){
            int prev = 0;
            for(int j = 1; j <= n ; j++){
                int temp = visited [j];
                if(x[i-1]==y[j-1]){
                    visited[j]=prev+1;
                }
                else{
                    visited[j]=Math.max(visited[j],visited[j-1]);
                }
                prev = temp;
            }
        }
        return visited[n];
    }
