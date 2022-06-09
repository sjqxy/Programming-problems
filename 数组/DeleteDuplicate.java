package at.sjq.com.a;

public class DeleteDuplicate {
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 3, 1, 0, 2, 5, 3};
             Delete(numbers);

    }
    public  static void Delete(int [] numbers){
        int[] m=new int[numbers.length];
        int[] h= new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            h[numbers[i]]++;
        }

            for (int i = 0; i <numbers.length ; i++) {
                if (h[i]>0){

                    System.out.println(i);
                }
            }



    }
}
