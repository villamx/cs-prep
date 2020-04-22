package org.binr.csprep.data_structures.dynamic.linked_list;

public class SinglyLinkedListHelper {

    // Input: 1->2->4, 1->3->4
    // Output: 1->1->2->3->4->4
    public static ListNode mergeSortedLists(ListNode ln1, ListNode ln2) {
        ListNode ln = new ListNode(0);
        ListNode head = ln;

        while (ln1 != null && ln2 != null) {
            if (ln1.val < ln2.val) {
                ln.next = ln1;
                ln1 = ln1.next;
            } else {
                ln.next = ln2;
                ln2 = ln2.next;
            }

            ln = ln.next;
        }

        if (ln1 == null) {
            ln.next = ln2;

        } else if (ln2 == null) {
            ln.next = ln1;
        }

        return head.next;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
