
/******************************************************************************
 *  Compilation:  javac TrinomialDP.java
 *  Execution:    java TrinomialDP n k
 *
 *  Takes two integer command-line arguments n and k and computes the corresponding trinomial coefficient. 
 
 *  % java TrinomialDP 3 3
 *  1
 *
 *  % java TrinomialDP 3 2
 *  3
 *
 *  % java TrinomialDP 3 1
 *  6
 *
 *  
 *
 ******************************************************************************/
 
public class TrinomialDP {

	public static void main(String[] args) {
			
			int n = Integer.parseInt(args[0]);
			int k = Integer.parseInt(args[1]);
			// Returns value of Binomial Coefficient C(n, k) 
			long[][] trinomial = new long[n+1][k+1];
			trinomial[0] [0]= 1;
			
			
			for (int i = 0; i <= n; i++){
				for(int j = 1; j <= min(i,k); j++){
					
					if (j == 0 || j == i)  trinomial [i][j] = 1;        
            			// Calculate value using previously stored values 
           				 else trinomial[i][j] = trinomial[i-1][j-1] + trinomial[i-1][j]; 
					}
			} 
			System.out.println(trinomial[n][k]);
		}
	}
}
