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
    void deleteNode(ListNode* Node) {
        Node -> val = Node ->next -> val;
        Node->next = Node -> next -> next;



        }
    
};