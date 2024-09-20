/*
 * leetcode 56. Merge Intervals
 */

package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        List<int[]> res = new ArrayList<>();
        int[] oldInterval = intervals[0];
        res.add(oldInterval);
        for (int[] interval : intervals) {
            if (oldInterval[1] >= interval[0]) {
                oldInterval[1] = Math.max(oldInterval[1], interval[1]);
            } else {
                res.add(interval);
                oldInterval = interval;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
