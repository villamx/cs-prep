package org.binr.csprep.linked_list;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SinglyLinkedListTest {

    SinglyLinkedList linkedLists = new SinglyLinkedList();

    // @BeforeEach
    void setUp() {}

    @Test
    void mergeTwoSortedLists_givenSortedLinkedLists_thenMergeLists() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode singlyLinkedList = linkedLists.mergeTwoSortedLists(l1, l2);

        int[] sequence = { 1, 1, 2, 3, 4, 4 };
        int index = 0;

        while (singlyLinkedList != null) {
            assertEquals(sequence[index++], singlyLinkedList.val);
            singlyLinkedList = singlyLinkedList.next;
        }
    }
}
