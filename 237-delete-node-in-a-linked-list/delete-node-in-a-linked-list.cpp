/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    void deleteNode(ListNode* curr) {
         while(curr->next) {
            curr->val = curr->next->val;
            if(curr->next->next) {
                curr = curr->next;
            } else {
                curr->next= NULL;
            }
        }
    }
    
};