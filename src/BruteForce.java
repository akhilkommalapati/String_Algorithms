

/*In Brute Force Method we check for each possible position in Text(T) we check whether the pattern P matches or Not.
Since, Length of Text is n and Pattern is m. we have n-m+1 possible choices of comparision. Because we dont need to check
last  m-1 locations in T since the pattern length is m.*/


public class BruteForce {


    public boolean bruteForce(String T,String P){
        int n = T.length();
        int m = P.length();

        for(int i=0;i <= n-m;i++){
            int j=0;

            while(j<m && P.charAt(j) == T.charAt(i+j)) {
                j++;
            }
            if(j==m)return true;
        }
       return false;
    }


//Time Complexity: O((n - m + 1) x m) == 0(n x m). Space Complexity: O(1).


    public boolean bruteForceTwo(String T,String P){
        int n = T.length();
        int m = P.length();

        int result=0;
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               if(T.charAt(i)!=P.charAt(j)){
                   continue;
               }
               else {
                   result++;
               }

           }
       }
       return result==m;
    }
    //Time Complexity:  0(n x m). Space Complexity: O(1).


}
