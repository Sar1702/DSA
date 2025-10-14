/*
class Node {
  public:
    int data;
    Node* left;
    Node* right;

    // Constructor to initialize a new node
    Node(int val) {
        data = val;
        left = NULL;
        right = NULL;
    }
};
*/

class Solution {
  public:
    void inorder(Node* root, vector<int>&nodes){
        if(root == nullptr) return ; 
        
        inorder(root->left,nodes);
        nodes.push_back(root->data);
        inorder(root->right,nodes);
        
    }
    int nodeSum(Node* root, int l, int r) {
        vector<int> nodes;
        inorder(root,nodes);
        int sum = 0 ;
        int n = nodes.size();
        for(int i = 0  ; i < n ; i ++ ){
            if(nodes[i]>=l && nodes[i]<=r){
                sum += nodes[i];
            }
        }
        return sum ; 
    }
};
