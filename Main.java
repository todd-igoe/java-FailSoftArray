public class Main {

    public static void main(String[] args) {
        final int MAX = 100000;
        int count;

        FailSoftArray a = new FailSoftArray(10, -1);

        // forEach:
        int [] nums = {0,1,2,3,4,5};
        FailSoftArray a2 = new FailSoftArray(nums, -1);
        a2.printVals();



    }
}