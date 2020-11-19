package com.jza.challenges.y2020;

import java.util.Map;
import java.util.TreeMap;

public class OlxGroup {


	public static int solution(int[] juice, int[] capacity) {
		Map<Integer, Integer> juicesVolumes = new TreeMap<>();
		for (int j : juice) {
			juicesVolumes.merge(j, 1, Integer::sum);
		}


		int max = 1;
		for (int i = 0; i < juice.length; i++) {
			int availableCapacity = capacity[i] - juice[i];
			int tmpMax = 1;
			for (Map.Entry<Integer, Integer> entry : juicesVolumes.entrySet()) {
				int cap = entry.getKey();
				if (cap > availableCapacity) break;
				int juicesCountForCap = entry.getValue();
				if (cap == juice[i]) {
					juicesCountForCap--;
				}
				int totalVolumeForCap = cap * (juicesCountForCap);
				if (totalVolumeForCap <= availableCapacity) {
					availableCapacity -= totalVolumeForCap;
					tmpMax += juicesCountForCap;
				} else {
					tmpMax += availableCapacity / cap;
				}
			}
			max = Math.max(max, tmpMax);
		}
		return max;
	}

	//			while (cap <= availableCapacity) {
//				if (juicesVolumes.containsKey(cap)) {
//					int juicesCountForCap = juicesVolumes.get(cap);
//					if (cap == juice[i]) {
//						juicesCountForCap--;
//					}
//					int totalVolumeForCap = cap * (juicesCountForCap);
//					if (totalVolumeForCap <= availableCapacity) {
//						availableCapacity -= totalVolumeForCap;
//						tmpMax += juicesCountForCap;
//					} else {
//						tmpMax += availableCapacity / cap;
//					}
//				}
//				cap++;
//			}

	/*


Rick is really fond of fruit juices, but he is bored of their traditional flavours. Therefore, he has decided to mix as many of them as possible to obtain something entirely new as a result.

He has N glasses, numbered from 0 to N-1, each containing a different kind of juice. The J-th glass has capacity[J] units of capacity and contains juice[J] units of juice. In each glass there is at least one unit of juice.

Rick want to create a multivitamin mix in one of the glasses. He is going to do it by pouring juice from several other glasses into the chosen one. Each of the used glasses must be empty at the end (all of the juice from each glass has to be poured out).

What is the maximum number of flavours that Rick can mix?

Write a function:

    class Solution { public int solution(int[] juice, int[] capacity); }

that, given arrays juice and capacity, both of size N, returns the maximum number of flavours that Rick can mix in a single glass.

Examples:

1. Given juice = [10, 2, 1, 1] and capacity = [10, 3, 2, 2], your function should return 2. Rick can pour juice from the 3rd glass into the 2nd one.

2. Given juice = [1, 2, 3, 4] and capacity = [3, 6, 4, 4], your function should return 3. Rick can pour juice from the 0th and 2nd glasses into the 1st one.

3. Given juice = [2, 3] and capacity = [3, 4], your function should return 1. No matter which glass he chooses, Rick cannot pour juice from the other one into it. The maximum number of flavours in the chosen glass is 1.

4. Given juice = [1, 1, 5] and capacity = [6, 5, 8], your function should return 3. Rick can mix all juices in the 2nd glass.

Write an efficient algorithm for the following assumptions:

        N is an integer within the range [2..100,000];
        each element of arrays juice, capacity is an integer within the range [1..1,000,000,000];
        arrays juice and capacity have the same length, equal to N;
        for each J juice[J] ≤ capacity[J].

Copyright 2009–2020 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
	 */


}
