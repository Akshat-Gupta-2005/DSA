#include <bits/stdc++.h>
using namespace std;

class Node {
    public:
    int data;
    Node *next;

    Node(int data1 , Node * next1){
        data = data1;
        next = next1;
    }
    Node(int data1 ){
        data = data1;
        next = nullptr;
    }
};

//O(n)
Node * convertArr2LL (vector<int> vec){
    Node *head = new Node(vec[0]);
    Node *mover = head;
    for (int i = 1 ; i < vec.size() ; i++ ){
        Node * temp = new Node(vec[i]);
        mover->next = temp;
        mover = mover->next; // or mover = temp;
    }
    return head;

}

//O(n)
void traverseLL(Node * head){
    Node * temp = head;
    while(temp!=nullptr){
        cout << temp->data << " ";
        temp = temp->next;
    }
    cout << endl;
}

//O(n)
int lengthLL(Node* head){
    int count = 0;
    Node * temp = head;
    while (temp != nullptr){
        count++;
        temp = temp->next;
    }
    return count;
}

//O(n) , O(n/2) , O(1)
int searchLL(Node* head , int val){
    Node *temp = head;
    while(temp != nullptr){
        if (temp -> data == val) return 1;
        temp = temp->next ;
    }
    return 0;

}

int main(){
    vector <int> arr = {2,3,5,7};
    Node * head = convertArr2LL(arr);
    traverseLL(head);
    cout << "Length of LL: " << lengthLL(head)<<endl;
    cout << searchLL(head , 7) << endl;

    // 1
    // Node a = Node(arr[0] , nullptr);
    // cout << a.data << endl;
    // Node *b = &a;
    // cout << b->data << endl;

    //2
    // Node *y = new Node(arr[0] );
    // cout << y->data << endl;
    // cout << y->next << endl;
    
    // Node *x = new Node(arr[1] , y);
    // cout << x->data << endl;
    // cout << x->next << endl;

    // 3
    // cout << head->data << endl ;
    // cout << head->next->data << endl ;
    // cout << head->next->next->data << endl ;
    // cout << head->next->next->next->data << endl ;
    // cout << endl;

    return 0;
}
