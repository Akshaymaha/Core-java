package batch;

import java.util.HashSet;
import java.util.List;

class Result {

	    /*
	     * Complete the 'sockMerchant' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts following parameters:
	     *  1. INTEGER n
	     *  2. INTEGER_ARRAY ar
	     */

	    public static int sockMerchant(int n, List<Integer> ar) {
	    	 int ans = 0;
	         HashSet<Integer> hs = new HashSet<>();
	         for(int i=0;i<n;i++)
	         {
	             if(!hs.contains(ar.get(i))){
	                 hs.add(ar.get(i));
	             }
	             else{
	                 hs.remove(ar.get(i));
	                 ans++;
	             }
	         }
	         return ans;
	    	      
	    }
	  	    
}