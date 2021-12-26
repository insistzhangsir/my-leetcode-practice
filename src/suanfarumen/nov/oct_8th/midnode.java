package suanfarumen.nov.oct_8th;
//找寻链表中间结点  双指针
public class midnode {


     // Definition for singly-linked list.
          public class ListNode {
              int val;
              ListNode next;
              ListNode() {}
              ListNode(int val) { this.val = val; }
              ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }


    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode rabbat=head;
        ListNode cur=dummy;
        for(int i=0;i<n;i++){
            rabbat=rabbat.next;
        }
        while(rabbat!=null){
            rabbat=rabbat.next;
            cur=cur.next;
        }
        cur.next=cur.next.next;
        ListNode ans = dummy.next;
        return ans;
    }


    public static void main(String[] args) {



    }
}
