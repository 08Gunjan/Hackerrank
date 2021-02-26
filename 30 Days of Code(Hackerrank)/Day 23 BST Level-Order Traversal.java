static void levelOrder(Node root){
      //Write your code here
      if(root == null)
      return;
      Queue<Node> q = new LinkedList<>();
      q.add(root);
      while(q.isEmpty()==false)
      {
          Node front = q.remove();
          System.out.print(front.data +" ");
          if(front.left != null)
          q.add(front.left);
          if(front.right!=null)
          q.add(front.right);
      }
    }
