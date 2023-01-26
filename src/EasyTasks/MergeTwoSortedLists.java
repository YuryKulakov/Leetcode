package EasyTasks;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode1 head=new  ListNode1();
        ListNode1 head1=new ListNode1();
        ListNode1 head2=new ListNode1();
        ListNode1 head3=new ListNode1();
        ListNode1 head4=new ListNode1();
        ListNode1 head5=new ListNode1();
        head.val=1;
        head1.val=2;
        head2.val=4;
        head3.val=1;
        head4.val=3;
        head5.val=4;
        head.next=head1;
        head1.next=head2;
        head3.next=head4;
        head4.next=head5;

        System.out.println(mergeTwoLists(head,head3));
    }

    public static ListNode1 mergeTwoLists(ListNode1 list1, ListNode1 list2) {
        ListNode1 temp = new ListNode1();
        if(list1.val>list2.val){
            temp.val=list2.val;
            list2=list2.next;
        }else{
            temp.val=list1.val;
            list1=list1.next;
        }
        ListNode1 lastNode = temp;

        while (list1!=null||list2!=null){
            ListNode1 nowNode = new ListNode1();

            if(list1.val>list2.val){
                nowNode.val=list2.val;
                list2=list2.next;
            }else{
                nowNode.val=list1.val;
                list1=list1.next;
            }

            lastNode.next = nowNode;
            lastNode = nowNode;

            if(list1!=null){
                lastNode.next=list1;
            }else{
                lastNode.next=list2;
            }
        }
        return temp;
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
}
