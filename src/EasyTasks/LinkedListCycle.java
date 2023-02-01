package EasyTasks;

public class LinkedListCycle {
    public static void main(String[] args) {
        int pos = 1;
        ListNode2 listNode2 = new ListNode2(5);
        ListNode2 listNode3 = new ListNode2(0);
        ListNode2 listNode4 = new ListNode2(67);
        ListNode2 listNode5 = new ListNode2(12);
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next =pos;

    }

    public boolean hasCycle(ListNode2 head) {
        if(head==null){
            return false;
        }
        ListNode2 slow = head;
        ListNode2 fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return true;
    }
}

class ListNode2 {
    int val;
    ListNode2 next;

    ListNode2(int x) {
        val = x;
        next = null;
    }
}
