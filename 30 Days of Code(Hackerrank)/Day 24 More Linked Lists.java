 public static Node removeDuplicates(Node head) {
      //Write your code here
      if(head == null)
      return head;
      Node t1 = head;
      Node t2 = head.next;
      while(t2!=null)
      {
        if(!(t1.data==(t2.data)))
         {
          t1 = t2;
          t2 = t2.next;
         }
        else
        {
          t2 = t2.next;
          t1.next = t2;
        }    
      }
      
      return head;

    }

