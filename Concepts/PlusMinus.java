public class PlusMinus {

    double pos = 0;
    double neg = 0;
    double zero = 0;
    int arr[] = { 1, 1, 0, -1, -1 };

    public void plusMinus() {
        int countPos = 0;
        int countNeg = 0;
        int countZero = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countZero += 1;
            } else if (arr[i] > 0) {
                countPos += 1;
            } else if (arr[i] < 0) {
                countNeg += 1;
            }
        }

        int total = arr.length;
        pos = (double) countPos / total;
        neg = (double) countNeg / total;
        zero = (double) countZero / total;

    }

    public static void main(String[] args) {

        PlusMinus ratio = new PlusMinus();
        ratio.plusMinus();

        System.out.println("Positive: " + ratio.pos);
        System.out.println("Negative: " + ratio.neg);
        System.out.println("Zero: " + ratio.zero);

    }
}
