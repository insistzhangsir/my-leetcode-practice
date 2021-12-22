package oct_22th;

public class mergeTwoLists {
    //  * Definition for singly-linked list.
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode p= list1,q=list2;
        ListNode u=new ListNode(-1);
        ListNode v=u;
        while(p!=null&&q!=null){
            if(p.val>q.val){
            v.next=q;
            q=q.next;
            }else{
            v.next=p;
            p=p.next;
            }
            v=v.next;
        }
        v.next=p==null?q:p;
        while (u!=null){
            System.out.println(u.val);
            u=u.next;
        }
        return u.next;
    }

    public static void main(String[] args) {

        ListNode node1=new ListNode(7,null);
        ListNode node2=new ListNode(5,node1);
        ListNode node3=new ListNode(2,node2);
        ListNode node4=new ListNode(8,null);
        ListNode node5=new ListNode(5,node4);
        ListNode node6=new ListNode(1,node5);
        mergeTwoLists(node3,node6);

    }



}
