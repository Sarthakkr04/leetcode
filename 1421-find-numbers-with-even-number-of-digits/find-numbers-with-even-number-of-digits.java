class Solution {
    int digit(int n ){
        int count =0;
        while(n != 0){
            n /=10;
            count++;
        }
        return count;
    }
    public int findNumbers(int[] arr) {
        int evencount =0;
        
        for(int i =0; i< arr.length; i++){
            int count = digit(arr[i]);
            if( count % 2 ==0) evencount++; 
        }
        return evencount;                       
    }           
}