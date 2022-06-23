public class Number_of_Steps_to_Reduce_a_Number_to_Zero {
    public static void main(String[] args) {
        int num = 123;
        System.out.println(numberOfSteps(num));

    }

    public static int numberOfSteps(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num--;
            }
            count++;
        }
        return count;
    }
}
