package EasyTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode1 head = new ListNode1();
        ListNode1 head1 = new ListNode1();
        ListNode1 head2 = new ListNode1();
        ListNode1 head3 = new ListNode1();
        ListNode1 head4 = new ListNode1();
        ListNode1 head5 = new ListNode1();
        head.val = 1;
        head1.val = 2;
        head2.val = 4;
        head3.val = 1;
        head4.val = 3;
        head5.val = 4;
        head.next = head1;
        head1.next = head2;
        head3.next = head4;
        head4.next = head5;
        List list = new ArrayList();
        list.add(mergeTwoLists(head, head3));
        System.out.println(list);
    }

    public static ListNode1 mergeTwoLists(ListNode1 list1, ListNode1 list2) {
        ListNode1 head = new ListNode1(0);
        ListNode1 listNode1 = head;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                listNode1.next = list1;
                list1 = list1.next;
            } else {
                listNode1.next = list2;
                list2 = list2.next;
            }
            listNode1 = listNode1.next;
        }

        if (list1 != null) {
            listNode1.next = list1;
        }
        if (list2 != null) {
            listNode1.next = list2;
        }
        return head.next;
    }
}

class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1() {
    }

    ListNode1(int val) {
        this.val = val;
    }

    ListNode1(int val, ListNode1 next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode1{" +
                "val=" + val +
                '}';
    }
}
