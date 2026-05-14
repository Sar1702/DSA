// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        int temp = n ;
        int res = 0;
        while (n!=0){
            int d = n%10;
            res += Math.pow(d,3);
            n /=10;            
        }
        
        if( res == temp){
            return true;
        }
        
        else{
            return false;
        }
    }
}