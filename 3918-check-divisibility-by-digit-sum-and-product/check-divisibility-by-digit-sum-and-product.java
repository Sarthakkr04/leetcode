class Solution {
    public boolean checkDivisibility(int n) {
        int original = n;
        int sum =0 , product = 1;
        while(n != 0){
            int lastDigit = n %10;
            sum = sum + lastDigit;
            product = product * lastDigit;
            n = n/10;

        }
        int totalsum = sum + product;
        if(original % totalsum == 0) {
            return true;
        }
        else{

         return false;
    }
    }
}