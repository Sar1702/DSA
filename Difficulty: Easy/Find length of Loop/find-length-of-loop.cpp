//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

struct Node {
    int data;
    struct Node *next;

    Node(int x) {
        data = x;
        next = NULL;
    }
};

void printList(Node *node) {
    while (node != NULL) {
        cout << node->data << " ";
        node = node->next;
    }
    cout << "\n";
}

void loopHere(Node *head, Node *tail, int position) {
    if (position == 0)
        return;

    Node *walk = head;
    for (int i = 1; i < position; i++)
        walk = walk->next;
    tail->next = walk;
}


// } Driver Code Ends

/*

struct Node {
    int data;
    struct Node *next;
    Node(int x) {
        data = x;
        next = NULL;
    }
};

*/
class Solution {
  public:
   int findlen(Node* fast , Node* slow){
       int len = 1;
       fast = fast -> next ;
       
       while (slow !=fast){
           len++;
           fast= fast->next;
       }
       
       return len;
       
       
       
       
   }
    // Function to find the length of a loop in the linked list.
    int countNodesinLoop(Node *head) {
        Node* fast = head   ;//
        Node* slow = head ;// taken fast and slow 2 pointers

        while (fast != NULL && fast->next != NULL){ // run the loop till fast not null and fast next is not null

            fast= fast->next->next ; // fast should be two step ahead 
            slow = slow->next ;

        if (fast == slow ){
            return findlen(fast,slow);//when fast slow come at the same point then loop is detected
        }
    
        }
    
        return 0;

        // Code here
    }
};


//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    cin.ignore();
    while (t--) {
        vector<int> arr;
        string input;
        getline(cin, input);
        stringstream ss(input);
        int number;
        while (ss >> number) {
            arr.push_back(number);
        }
        int k;
        cin >> k;
        cin.ignore();
        struct Node *head = new Node(arr[0]);
        struct Node *tail = head;
        for (int i = 1; i < arr.size(); ++i) {
            tail->next = new Node(arr[i]);
            tail = tail->next;
        }
        loopHere(head, tail, k);

        Solution ob;
        cout << ob.countNodesinLoop(head) << endl;
    }
    return 0;
}

// } Driver Code Ends