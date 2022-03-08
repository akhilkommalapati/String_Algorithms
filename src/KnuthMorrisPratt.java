public class KnuthMorrisPratt {


    public static int [] preFixTable(String subString){

        int m = subString.length();
        int [] prefixTable = new int [m];

        int i=1;
        int j=0;

        while(i<m){
            if(subString.charAt(i)==subString.charAt(j)){
                prefixTable[i]=j+1;
                i++;
                j++;
            }
            else if(j>0){
                j = prefixTable[j-1];
            }
            else{
                prefixTable[i]=0;
                i++;
            }

        }

        return prefixTable;
    }



    public static boolean KMP(String string,String substring,int [] prefixTable){

        int i=0;
        int j=0;
        int n = string.length();
        int m = substring.length();
        while(i< n){
            if(string.charAt(i) == substring.charAt(j)){
                if(j == m-1) {
                    return true;
                }

                i++;
                j++;
            }
            else if(j>0){
                j = prefixTable[j-1];
            }
            else{
                i++;
            }
        }

        return false;
    }


}
