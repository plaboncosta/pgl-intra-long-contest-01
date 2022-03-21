import java.util.*;

public class OppositeTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        int caseNo = 0;

        HashMap<String, ArrayList<Integer>> dataset = new HashMap<>();

        while (caseNo < cases) {
            int currentInt = in.nextInt();
            String key = String.valueOf(currentInt);

            if (dataset.get(key) == null) {
                System.out.println(0 + " " + currentInt);

                ArrayList<Integer> list = new ArrayList<>();
                list.add(currentInt);
                dataset.put(key, list);
            } else {
                System.out.println(dataset.get(key).size() + " " + currentInt);

                dataset.get(key).add(currentInt);
            }

            caseNo++;
        }
    }
}
