https://leetcode.com/problems/fibonacci-number/
class Solution {
    public int fib(int n) {
         if(n==0 || n==1){//if n=0 1 will be returned and if n=1 1 will be returned
            return n;
        }
        int fibnm1 = fib(n-1);
        int fibnm2 = fib(n-2);
        int fibn = fibnm1 + fibnm2;
        return fibn;

    }
}
