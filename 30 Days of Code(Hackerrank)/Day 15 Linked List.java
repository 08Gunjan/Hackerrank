

    public static  Node insert(Node head,int data) {
        //Complete this method
        Node temp = head;
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
        }
        else {
            while(temp.next!=null) {
                temp = temp.next;
            }
            temp.next = newNode;  
        }
        return head;
    }

