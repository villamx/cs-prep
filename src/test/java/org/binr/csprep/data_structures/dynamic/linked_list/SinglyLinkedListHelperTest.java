package org.binr.csprep.data_structures.dynamic.linked_list;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SinglyLinkedListHelperTest {

    // @BeforeEach
    void setUp() {}

    private void assertMergedLists(int[] sequence, ListNode listNode) {
        int index = 0;

        while (listNode != null) {
            assertEquals(sequence[index++], listNode.val);
            listNode = listNode.next;
        }
    }

    @Test
    void mergeSortedLists_givenOneSinglyLinkedLists_thenMergeLists() {
        ListNode l1n1 = new ListNode(1);
        ListNode listNode = SinglyLinkedListHelper.mergeSortedLists(l1n1, null);

        int[] sequence = { 1 };
        assertMergedLists(sequence, listNode);
    }

    @Test
    void mergeSortedLists_givenTwoSinglyLinkedLists_thenMergeLists() {
        ListNode l1n1 = new ListNode(1);
        ListNode l1n2 = new ListNode(2);
        ListNode l1n3 = new ListNode(4);
        ListNode l1head = l1n1;
        l1n1.next = l1n2;
        l1n2.next = l1n3;

        ListNode l2n1 = new ListNode(1);
        ListNode l2n2 = new ListNode(3);
        ListNode l2n3 = new ListNode(4);
        ListNode l2head = l2n1;
        l2n1.next = l2n2;
        l2n2.next = l2n3;

        ListNode listNode = SinglyLinkedListHelper.mergeSortedLists(l1head, l2head);

        int[] sequence = { 1, 1, 2, 3, 4, 4 };
        assertMergedLists(sequence, listNode);
    }
}
