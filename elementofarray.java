package arraylist;

public class elementofarray {
    public static void main(String[] args) {
        int[]array={1,2,3,4,5,6,7,8,9,10,11,12};


        int length = array.length;

        int sum = 0;


        for (int j : array) {
            sum += j;
        }

        double average = (double)sum / length;

        System.out.println("Average of array : "+average);

    }

}






















