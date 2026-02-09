#include <bits/stdc++.h>
using namespace std;

class DNode{
    public:

        int data;
        DNode* next;
        DNode* prev;

        DNode(int data1 ,DNode * next1 , DNode * prev1){
            data = data1;
            next = next1;
            prev = prev1;
        }

        DNode(int data1){
            data = data1;
            next = nullptr;
            prev = nullptr;
        }
};

DNode * convertArr2DLL(vector<int> vec){
    DNode * head = new DNode(vec[0]);
    DNode * mover = head;
    for (int i = 1 ; i< vec.size() ; i++){
        DNode * temp = new DNode(vec[i]);
        mover->next=temp;
        temp->prev=mover; // can be done through constructor;
        mover = temp;
    }

    return head;
}

void traverseDLL(DNode * head){
    DNode * mover = head;
    while(mover->next!=nullptr){
        cout<<mover->data<<" ";
        mover = mover->next;
    }
    cout<<mover->data<<endl;

    while(mover != nullptr){
        cout<<mover->data<<" ";
        mover = mover->prev;
    }
    cout<<endl;
}

int main(){

    vector <int> vec = {2,3,5,7};
    DNode * head = convertArr2DLL(vec);
    traverseDLL(head);
    
}