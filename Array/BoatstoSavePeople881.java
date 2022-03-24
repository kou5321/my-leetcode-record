package Array;

import java.util.Arrays;

public class BoatstoSavePeople881 {
    public int numRescueBoats(int[] people, int limit) {
        int max = people.length-1, min= 0;
        int num = 0;
        Arrays.sort(people);
        while (max >= min) {
            if (people[max] + people[min] <= limit) {
                max--;
                min++;
            } else {
                max--;
            }
            num++;
        }
        return num;
    }
}
