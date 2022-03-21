import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class OppositeTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        int caseNo = 0;

        HashMap<Integer, List<Integer>> dataset = new HashMap<>();

        while (caseNo < cases) {
            int currentInt = in.nextInt();
            String key = String.valueOf(currentInt);

            /*if (dataset.get(currentInt)) {
                System.out.println(1 + " " + (currentInt - 1));
            } else {
                System.out.println(0 + " " + currentInt);
            }*/


//            dataset.put(currentInt, )

            caseNo++;
        }
    }
}
