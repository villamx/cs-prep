package org.binr.csprep.linked_list;

public class SinglyLinkedList {

    // Input: 1->2->4, 1->3->4
    // Output: 1->1->2->3->4->4
    public ListNode mergeTwoSortedLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }

        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode singlyLinkedList = new ListNode(0);
        ListNode currentNode = singlyLinkedList;

        while (l1 != null || l2 != null) {

            if (l1 == null) {
                currentNode.next = l2;
                l2 = l2.next;

            } else if (l2 == null) {
                currentNode.next = l1;
                l1 = l1.next;

            } else if (l1.val < l2.val) {
                currentNode.next = l1;
                l1 = l1.next;

            } else {
                currentNode.next = l2;
                l2 = l2.next;
            }

            currentNode = currentNode.next;
        }

        return singlyLinkedList.next;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
