/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private List<Integer> arr;
    private Random rand;

    public Solution(ListNode head) {
        arr = new ArrayList<>();
        rand = new Random();

        ListNode temp = head;
        while (temp != null){
            arr.add(temp.val);
            temp = temp.next;
        } 
    }
    
    public int getRandom() {
        int n = arr.size();
        int randomIndex = rand.nextInt(n);   // 0, 1, ..., n-1
        return arr.get(randomIndex);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */