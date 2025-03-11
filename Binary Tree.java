import java.util.*;
public class Main {
    public static void main(String[] args) {
      binary n=new binary();
      n.insert(50);
      n.insert(19);
      n.insert(55);
      n.insert(12);
      n.insert(32);
      n.insert(31);
      n.insert(33);
      n.insert(10);
      n.insert(15);
      n.insert(52);
      n.insert(75);
      n.insert(78);
      n.insert(92);
      n.inordertraversal();
  }
}
class binary{
  node root;
  class node{
    int data;
    node left,right;
    node(int data){
      this.data=data;
      left=null;
      right = null ;
    }
  }
  binary(){
    root=null;
  }
  void insert(int data){
    root=insert(root,data);
  }
  node insert(node root,int data){
    if(root==null){
      root =new node(data);
      return root;
    }
    else if(data<root.data){
      root.left=insert(root.left,data);
    }
    else{
      root.right=insert(root.right,data);
    }
    return root;
    }
  
  void inordertraversal(node root){
   if(root!=null){
   inordertraversal(root.left);
   System.out.print(root.data+" ");
   inordertraversal(root.right);
 }
  }
 void inordertraversal(){
   inordertraversal(root);
 }
  
  }