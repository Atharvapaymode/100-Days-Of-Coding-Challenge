https://leetcode.com/problems/count-primes/description/
class Solution {
    public int countPrimes(int n) {
        if(n <= 2) return 0;
        boolean[] prime = new boolean[n];
        Arrays.fill(prime,true);
        int count = n-2;
        
        for(int i=2; i<Math.sqrt(n); i++){
            if(!prime[i*i]){
                continue;
            }
            for(int j=i;j*i<n;j++){
                if(prime[i*j]){
                    prime[i*j] = false;
                    count --;
                }
            }
        }
        return count;
    }
}
