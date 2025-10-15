/*
class Node {
  public:
    int data;
    Node* left;
    Node* right;

    Node(int val) {
        data = val;
        left = right = NULL;
    }
};
*/

class Solution {
  public:
    void inorder(Node* root , vector<int>& ans){
        if(root == nullptr) return ; 
        
        inorder(root->left,ans);
        ans.push_back(root->data);
        inorder(root->right,ans);
    }
    int kthSmallest(Node *root, int k) {
        vector<int>ans;
        inorder(root,ans);
        if(k > 0 && k <= ans.size())
            return ans[k-1];
        return -1 ;
    }
};