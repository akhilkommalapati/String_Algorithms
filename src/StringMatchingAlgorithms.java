public class StringMatchingAlgorithms {

    public static void main(String[] args) {

        //Brute Force
        BruteForce bruteForce = new BruteForce();
        System.out.println(bruteForce.bruteForce("ABC","BC"));
        System.out.println(bruteForce.bruteForceTwo("ABC","BC"));

        //In-Built Method
        System.out.println("ABC".contains("BC"));


        //Rabin-karp-algorithm
//        In this method, we will use the hashing technique and instead of checking for each possible position in T, we check only if the hashing of P
//        and the hashing of m characters of T give the same result.
//        Initially, apply the hash function to the first m characters ofT and check whether this result and P's hashing result is the same or not. If ther
//        are not the same, then go to the next character of T and again apply the hash function to m characters (by starting at the second character). If
//        they are the same then we compare those m characters of T with P.
        //https://www.programiz.com/dsa/rabin-karp-algorithm




        // let us assume that T is the string to be searched and P is the pattern to be matched. This algorithm was presented by Knuth, Monis
        //and Pratt. It takes O(n) time complexity for searching a pattern. To get O(n) time complexity, it avoids the comparisons with elements of T
        //that were previously involved in comparison with some element of the pattern P.
        //The algorithm uses a table and in general we call it prefix function or prefix table or fail function F. First we will see how to fill this
        //table and later how to search for a pattern using this table. The prefix function F for a pattern stores the knowledge about how the pattem
        //matches against shifts of itself. This information can be used to avoid useless shifts of the pattern P. It means that this table can be used for
        //avoiding backtracking on the string
        //T.


        int [] prefixTable = KnuthMorrisPratt.preFixTable("ABABCABCD");

        System.out.println(KnuthMorrisPratt.KMP("ABCDEFHGABABCABCDJDGD","ABABCABCD",prefixTable));



        //Time Complexity is O(n+m) since iterating througn each once.
        //Space Complexity is O(m) since using pre-fix array.
    }


}
