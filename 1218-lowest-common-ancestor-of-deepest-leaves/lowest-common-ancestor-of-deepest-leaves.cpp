/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
     pair<TreeNode*, int> dfs(TreeNode* root) {
        if (!root) return {nullptr, 0};

        auto left = dfs(root->left);
        auto right = dfs(root->right);

        if (left.second == right.second) {
            return {root, left.second + 1}; // Both sides have same depth, root is LCA
        } else if (left.second > right.second) {
            return {left.first, left.second + 1}; // Left is deeper
        } else {
            return {right.first, right.second + 1}; // Right is deeper
        }
    }

    TreeNode* lcaDeepestLeaves(TreeNode* root) {
        return dfs(root).first;
    }
};