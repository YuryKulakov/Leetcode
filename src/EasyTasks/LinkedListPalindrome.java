package EasyTasks;

public class LinkedListPalindrome {
    public static void main(String[] args) {
        ListNode head=new ListNode();
        ListNode head1=new ListNode();
        ListNode head2=new ListNode();
        ListNode head3=new ListNode();
        ListNode head4=new ListNode();
        head.val=1;
        head1.val=2;
        head2.val=2;
        head3.val=2;
        head4.val=1;
        head.next=head1;
        head1.next=head2;
        head2.next=head3;
        head3.next=head4;

        System.out.println(isPalindrome(head));

    }
    public static boolean isPalindrome(ListNode head) {

        ListNode middle=middleNode(head);
        ListNode headSecond = reverseList(middle);
        ListNode reverseSecond = headSecond;

        while(head!=null&&headSecond!=null){
            if(head.val!=headSecond.val) {
                return false;
            }
            head=head.next;
            headSecond=headSecond.next;
        }
        return true;
    }

        public static ListNode middleNode(ListNode head){
         ListNode slow = head;
         ListNode fast = head;

         while (fast!=null&&fast.next!=null){
             slow=slow.next;
             fast=fast.next.next;
         }
         return slow;
        }

        public static ListNode reverseList(ListNode head){
         ListNode current = head;
         ListNode previous = null;
         ListNode next = current.next;

         while (current!=null){
             current.next=previous;
             previous = current;
             current = next;
             if(next!=null){
                 next=next.next;
             }
         }
         return previous;
        }
}

 class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
