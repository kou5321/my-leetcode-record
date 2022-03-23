package DynamicProgramming;

public class brokenCalc991 {
    public int brokenCalc(int startValue, int target) {
        if (startValue == target) {
            return 0;
        } else if (startValue > target) {
            return startValue - target;
        } else {
            return target % 2 == 0 ? brokenCalc(startValue, target/2) + 1 : brokenCalc(startValue, target + 1) + 1;
        }
    }
}
