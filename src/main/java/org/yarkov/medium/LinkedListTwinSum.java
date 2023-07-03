package org.yarkov.medium;

import org.yarkov.structure.ListNode;

public class LinkedListTwinSum {

    public int pairSum(ListNode head) {
        int size = 0;
        ListNode curr = head;

        while (curr != null) {
            size++;
            curr = curr.next;
        }

        int[] twinSums = new int[size / 2];

        curr = head;
        int index = 0, count = 1;
        int maxTwinSum = Integer.MIN_VALUE;

        while (curr != null) {
            twinSums[index] += curr.val;

            if (count <= size / 2) {
                if (index + 1 < size / 2)
                    index++;
            } else {
                maxTwinSum = Math.max(maxTwinSum, twinSums[index]);
                if (index - 1 >= 0)
                    index--;
            }
            count++;
            curr = curr.next;
        }

        return maxTwinSum;
    }

}
