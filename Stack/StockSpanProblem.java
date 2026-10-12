
import java.util.*;

class Solution {

    public void stockSpan(int[] arr, int[] span) {
        Stack<Integer> s = new Stack<>();

        if (arr.length == 0) {
            return;
        }

        span[0] = 1;
        s.push(0);

        for (int i = 1; i < arr.length; i++) {
            int currPrice = arr[i];

            while (!s.isEmpty() && currPrice >= arr[s.peek()]) {
                s.pop();
            }

            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }

            s.push(i);
        }
    }

    public ArrayList<Integer> calculateSpan(int[] arr) {
        int[] span = new int[arr.length];

        stockSpan(arr, span);

        ArrayList<Integer> result = new ArrayList<>();

        for (int value : span) {
            result.add(value);
        }

        return result;
    }
}
