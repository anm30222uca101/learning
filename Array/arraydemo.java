public class arraydemo  {
    public static void main(String[] args) {

        int[] marks = {85, 90, 78, 92, 88};

        int sum = 0;

        for(int mark : marks) {
            sum += mark;
        }

        double average = (double) sum / marks.length;

        System.out.println("Total = " + sum);
        System.out.println("Average = " + average);
    }
}