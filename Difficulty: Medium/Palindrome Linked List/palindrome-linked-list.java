/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    
    public Node reverse (Node head){
        Node prev = null;
        while(head != null){
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    public boolean isPalindrome(Node head) {
        // code here
        Node slow = head ;
        Node fast = head ;
        
        while (fast.next != null && fast.next.next != null ){
            fast = fast.next.next ;
            slow = slow.next ;
        }
        
        Node second = reverse(slow.next);
        slow.next = null;
        
        Node first = head;
        
        while (second != null){
            // Node t1 = fist.next;
            // Node t2 = second.next;
            if(first.data != second.data){
                return false;
            }
            else{
                first = first.next;
                second = second.next;
            }
            
        }
        
        
        
        
        return true ;
    }
}