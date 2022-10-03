package top_interview_questions.easy;

public class MergeTwoSortedLists_21 {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);

        ListNode list2 = new ListNode(2);

        ListNode nextElem1 = list1;
        ListNode nextElem2 = list2;

        ListNode list3 = null;
        if(list1.val<list2.val){
            list3 = new ListNode(list1.val);
            nextElem1 = list1.next;
        }
        else{
            list3 = new ListNode(list2.val);
            nextElem2 = nextElem2.next;
        }
        ListNode nextElem3 = list3;

        while(nextElem1!=null || nextElem2!=null){
            boolean b = nextElem1 != null && nextElem2 != null && nextElem1.val < nextElem2.val;
            if(nextElem2==null || b){
                nextElem3.next = new ListNode(nextElem1.val);
                nextElem3 = nextElem3.next;
                nextElem1 =  nextElem1.next;
            }
            else{
                nextElem3.next = new ListNode(nextElem2.val);
                nextElem3 = nextElem3.next;
                nextElem2 =  nextElem2.next;
            }
        }

    }
    public static class ListNode {
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
}
