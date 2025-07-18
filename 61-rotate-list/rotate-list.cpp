/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
  
    ListNode* rotateRight(ListNode* head, int k) {
            if(head == NULL || k == 0 ) return head ;
            
            ListNode* tail = head;
            int len = 1 ;
            while(tail->next != NULL){
                tail =tail -> next ;
                len++;
            }
            
            
             k = k % len ;
            if(k % len == 0 ) return head ;

           

            tail -> next = head ; 
            ListNode* newtail = head ;
            for(int i = 0 ; i < len - k - 1 ; i++){
                newtail = newtail->next;
            }
            ListNode* newhead = newtail->next ;
            newtail->next = NULL;
        return newhead;
    }
};