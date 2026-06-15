// Linked List Implementation in Java..............

// class node{
//     int val;
//     node next;
//     node(int val){
//         this.val = val;
//     }
// }
// class linkedlist{
//    public static void main(String[] args) {
//     node  a = new node(10);
//     node  b = new node(20);
//     node  c = new node(30);
//     node  d = new node(40);
//     node  e = new node(50);

//     a.next = b; 
//     b.next = c;
//     c.next = d;
//     d.next = e;

//     System.out.println(a.val);
//     System.out.println(a.next.val);
//     System.out.println(b.next);
//    }
// }


// Traversal on linkedlist..............

// class node{
//     int val;
//     node next;
//     node(int val){
//         this.val = val;
//     }
// }
// class linkedlist{
//    public static void display(node head) {
//     node temp = head;
//     while (temp!=null) {
//         System.out.println(temp.val+" ");
//         temp = temp.next; 
//     }
//     System.out.println();
//    }
//    public static void main(String[] args) {
    
   
//     node  a = new node(10);
//     node  b = new node(20);
//     node  c = new node(30);
//     node  d = new node(40);
//     node  e = new node(50);

//     a.next = b; 
//     b.next = c;
//     c.next = d;
//     d.next = e;

//    display(a);
//    }
// }


// Linked list class.............
  // Insert at Head .....

// class node{
//     int val;
//     node next;
//     node(int val){
//         this.val = val;
//     }
// }

// class sinkedlist{
//     node head ;
//     node tail ;
//     int size ;

//     void addAtHead(int val){
//         node temp = new node (val);
//         if(head == null) head = tail = temp;
//         else{
//             temp.next = head;
//             head = temp;
//         }
//         size++;
//     }
//     void display(){
//         if(head == null) return;
//         node temp = head;
//         while(temp!=null){
//             System.out.println(temp.val+" ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

// }

// class linkedlist{
//     public static void main(String[] args) {
//         sinkedlist l = new sinkedlist();
//         l.addAtHead(10);
//         l.addAtHead(20);
//         l.addAtHead(30);
//         l.addAtHead(40);
//         l.addAtHead(50);
//         l.display();
//         System.out.println(l.size);
//     }
// }


// delete at head ................

// class node{
//     int val;
//     node next;
//     node(int val){
//         this.val = val;
//     }
// }

// class sinkedlist{
//     node head ;
//     node tail ;
//     int size ;

//     void addAtHead(int val){
//         node temp = new node (val);
//         if(head == null) head = tail = temp;
//         else{
//             temp.next = head;
//             head = temp;
//         }
//         size++;
//     }
//     void display(){
//         if(head == null) return;
//         node temp = head;
//         while(temp!=null){
//             System.out.println(temp.val+" ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }



// void deleteAtHead(){    //  ....................
//     if(head == null){
//         System.out.println("List is empty !");
//         return;
//     }
//     head = head.next;
//     if(head == null) tail = null;
// }
// }

// class linkedlist{
//     public static void main(String[] args) {
//         sinkedlist l = new sinkedlist();
//         l.addAtHead(10);
//         l.addAtHead(20);
//         l.addAtHead(30);
//         l.addAtHead(40);
//         l.addAtHead(50);
//         l.display();
//         l.deleteAtHead();  // Delete head .
//         l.display();
//         System.out.println(l.size);
//     }
// }


// Insert idx and delete idx ................

 class node{
    int val;
    node next;
    node(int val){
        this.val = val;
    }
}

class sinkedlist{
    node head ;
    node tail ;
    int size ;

    void addAtHead(int val){
        node temp = new node (val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void addAtTail(int val){
      node temp = new node(val);
      if(tail == null) head = tail = temp;
      else{
        tail.next = temp;
        tail = temp;
      }
      size++;
    }



    void display(){
        if(head == null) return;
        node temp = head;
        while(temp!=null){
            System.out.println(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void insert (int val, int idx){
      if(idx<0 || idx>size) System.out.println("invalid index !");
      else if (idx == 0) addAtHead(val);
      else if (idx == size) addAtTail(val);
      else{
        node temp = head;
        for(int i=1; i <= idx-1; i++ ){
          temp = temp.next;
        }
        node t = new node(val);
        t.next = temp.next;
        temp.next = t;
        size ++;
      }
    }

    void deleteAtIdx(int idx){
        if(idx<0 || idx>=size){
            System.out.println("invalid index !");
            return ;
        }
        if(idx == 0){
            deleteAtHead();
            return ;
        }
        node temp = head;
        for(int i=1; i<=idx-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if(idx == size-1) tail = temp;
        size--;
       
    }



void deleteAtHead(){    //  ....................
    if(head == null){
        System.out.println("List is empty !");
        return;
    }
    head = head.next;
    if(head == null) tail = null;
}
}

class linkedlist{
    public static void main(String[] args) {
        sinkedlist l = new sinkedlist();
        l.addAtHead(10);
        l.addAtHead(20);
        l.addAtHead(30);
        l.addAtHead(40);
        l.addAtHead(50);
        l.display();
        // l.deleteAtHead();  // Delete head .
        l.display();
        l.insert(45,3 );  // Insert value...
        l.display();
        l.deleteAtIdx(2);
        l.display();
        System.out.println(l.size);
    }
}