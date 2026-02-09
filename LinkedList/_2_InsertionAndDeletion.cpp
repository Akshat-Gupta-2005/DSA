#include <bits/stdc++.h>
using namespace std;

//------------------------------------------------------------------------//
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

//------------------------------------------------------------------------//

Node * deleteFront(Node * head){
    if (head == nullptr || head->next == nullptr) return nullptr;
    Node* temp = head->next;
    head->next = nullptr;
    delete(head);
    return temp;
}

Node * deleteLast(Node * head){
    if (head == nullptr || head->next == nullptr) return nullptr;
    Node* temp = head;
    while(temp->next->next != nullptr){
        temp = temp->next;
    }
    Node * temp2 = temp->next;
    temp->next = nullptr;
    delete(temp2);
    return head;
}

Node * deletePos(Node * head , int pos){
    if (head == nullptr || head->next == nullptr) return nullptr;
    
    if (pos == 1){
        Node * temp = head->next;
        head->next = nullptr;
        delete(head);
        return temp;
    }
    
    // int tempval = val -1;
    // Node* temp = head;
    // while(tempval != 1){
    //     temp = temp->next;
    //     tempval--;
    // }

    Node * temp = head;
    for (int i = 1 ; temp != nullptr && i < pos-1; i++){
        temp = temp->next;
    }
    
    if (temp == nullptr || temp->next == nullptr) return head;

    Node*temp2 = temp->next;
    temp->next = temp->next->next;
    delete(temp2);
    return head;
}

Node * deleteVal(Node * head , int val){
    if (head == nullptr || (head->next == nullptr && val == head->data)) return nullptr;

    if (head->data == val){
        Node* temp = head->next;
        head->next = nullptr;
        delete(head);
        return temp;
    }

    Node * mover = head;
    while (mover != nullptr){
        if (mover->next==nullptr || mover->next->data == val ) break;
        mover = mover->next;
    }

    if (mover == nullptr || mover->next == nullptr) return head;

    Node * temp = mover->next;
    mover->next = mover->next->next;
    temp->next = nullptr;
    delete(temp);
    return head;
}

Node * insertFront(Node * head , int data){
    Node * temp = new Node(data,head);
    return temp;
}

Node * insertBack(Node * head , int data){
    if (head == nullptr){
        Node * temp = new Node(data);
        return temp;
    }

    Node * mover = head;
    while (mover->next != nullptr) mover = mover->next;
    Node * temp = new Node(data);
    mover->next = temp;
    return head;
}

Node * insertPos(Node * head , int data , int pos){
    if (head == nullptr){
        Node * temp = new Node(data);
        return temp; 
    } 
    
    if (pos == 1){
        Node * temp = new Node(data,head);
        return temp;
    }

    Node * mover = head;
    for (int i = 1 ; i < pos-1 ; i++){
        if (mover->next == nullptr) return head;
        mover = mover->next;
    }
    Node * temp = new Node(data,mover->next);
    mover->next = temp;
    return head;
}

Node * insertVal(Node * head , int data , int val){
    return head;
}

int main(){
    vector<int> vec = {2,3,5,7};
    
    Node* head = convertArr2LL(vec);
    traverseLL(head);

    Node* newHead = insertPos(head,4,6);
    traverseLL(newHead);
    return 0;
}
