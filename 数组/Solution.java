package at.sjq.com.a;

public class Solution {

    public static void main(String[] args) {
        int [] numbers=new int[]{2,3,1,0,2,5,3};
        int i = duplicate(numbers);
        System.out.println(i);
    }

    public static int duplicate (int[] numbers) {
        // write code here
        int[] h = new int[numbers.length];
        for(int i=0;i<numbers.length;i++){

           h[numbers[i]]=h[numbers[i]]+1;
          //  h[numbers[i]]++;

        }
        for(int i=0;i<numbers.length;i++){
            System.out.println(h[i]);
            if(h[i]> 1){
                return i;
            }
        }
        return -1;
    }
}