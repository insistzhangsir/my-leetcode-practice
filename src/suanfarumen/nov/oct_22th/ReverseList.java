package suanfarumen.nov.oct_22th;

public class ReverseList {
  public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public static ListNode reverseList(ListNode head) {
        if (head==null){
            return null;
        }
        ListNode cur=head;
        ListNode pre=cur.next;
        head.next=null;
        ListNode temp;
        head.next=null;
        while(pre!=null){
            temp=pre.next;
            pre.next=cur;
            cur=pre;
            pre=temp;
        }
        while (cur!=null){
            System.out.println(cur.val);
            cur=cur.next;
        }
        return cur;
    }

    public static void main(String[] args) {
        ListNode node1=new ListNode(7,null);
        ListNode node2=new ListNode(5,node1);
        ListNode node3=new ListNode(2,node2);
        ListNode node4=new ListNode(8,node3);
        ListNode node5=new ListNode(5,node4);
        ListNode node6=new ListNode(1,node5);
        reverseList(node6);
    }
}
