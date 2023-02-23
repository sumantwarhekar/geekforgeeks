import java.util.*;

class GFG {
    ArrayList<Long> find(long arr[], int n, int x) {
        // code here
        ArrayList<Long> index = new ArrayList<Long>();
        long first = -1;
        long last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                first = i;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x)
                last = i;
        }
        index.add(last);
        index.add(first);
        return index;
    }
}