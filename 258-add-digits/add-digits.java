class Solution {
    int digitSum(int num){
        int sum =0;
        while(num !=0){
            int ld = num % 10;
            sum += ld;
            num /= 10;
        }
        return sum;
    }
    public int addDigits(int num) {
        int sum = digitSum(num);
        while(sum > 9) {
             sum = digitSum(sum);
        }
        if(num ==0) return 0;
        return sum;
        
    }
}