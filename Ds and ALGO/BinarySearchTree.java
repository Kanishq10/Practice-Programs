class BST{
    int info;
    BST right,left,root;
    BST(){
        this.root=null;
    }
    BST(int info){
        this.info=info;
        this.left=null;
        this.right=null;
    }

    void insert(int info){
        BST n=new BST(info);
        if(root==null){
            root=n;
            return;
        }
        BST prev=null,ptr=root;
        while(ptr!=null){
            prev=ptr;
            if(ptr.info<n.info){
                ptr=ptr.right;
            }
            else{
                ptr=ptr.left;
            }
        }
        if(n.info>prev.info){
            prev.right=n;
        }
        else{
            prev.left=n;
        }
    }

    int search(int info){
        if(root==null){
            return -1;
        }
        BST ptr=root;
        while(ptr!=null && ptr.info!=info){
            if(ptr.info<info){
                ptr=ptr.right;
            }
            else{
                ptr=ptr.left;
            }
        }
        if(ptr==null){
            return -1;
        }
        return ptr.info;
    }

    void delete(int info){
        if(root==null){
            System.out.println("Underflow");
            return;
        }
        BST ptr=root;
        BST pre=null;
        while(ptr!=null && ptr.info!=info){
            pre=ptr;
            if(ptr.info<info){
                ptr=ptr.right;
            }
            else{
                ptr=ptr.left;
            }
        }
        if(ptr==null){
            System.out.println("No such Element");
            return;
        }
        if(ptr.right==null && ptr.left==null){  //leaf node
        if(ptr==pre.right){
            pre.right=null;
          }  
        else{
            pre.left=null;
          }     
        }
        else if(ptr.left!=null && ptr.right==null){ //one left child
            if(ptr==pre.right){
                pre.right=ptr.left;
            }
            else{
                pre.left=ptr.left;
            }
        }
        else if(ptr.left==null && ptr.right!=null){ //one right child
            if(ptr==pre.right){
                pre.right=ptr.right;
            }
            else{
                pre.left=ptr.right;
            }
        }
        else if(ptr.left!=null && ptr.right!=null){ //two childs 
            pre=ptr;
            BST l=ptr.left; //here is the approach to find largest in left subtree ,other approach is to find smallest in right subtree
            ptr=ptr.left;
            while(l.right!=null){
                ptr=l;
                l=l.right;
            }
            if(l==ptr){
                pre.info=l.info;
                pre.left=l.left;
            }
            else{
                pre.info=l.info;
                ptr.right=null;
            }
        }
    }

    int height(BST n){
        if(n==null){
            return -1;
        }
        else{
            int lh=height(n.left);
            int rh=height(n.right);
            if(lh>rh){
                return lh+1;
            }
            else{
                return rh+1;
            }
        }
    }
    int depth(BST n){
        if(n==null){
            return 0;
        }
        else{
            int lh=depth(n.left);
            int rh=depth(n.right);
            if(lh>rh){
                return lh+1;
            }
            else{
                return rh+1;
            }
        }
    }
    
    int BalanceFactor(BST n){
        if(n==null)
              return -1;
        else{
                  int lh=height(n.left);
                  int rh=height(n.right);
                  return lh-rh;
            }
    }

    Boolean isBalanced(BST n){
        if(n==null){
            return true;
        }
        int lh=height(n.left);
        int rh=height(n.right);
        if((lh-rh>=-1) && (lh-rh<=1) && isBalanced(n.left) && isBalanced(n.right)){
            return true;
        } 
        else{
            return false;
        }
    }

    void printInorder(BST root){
        if(root!=null){
            printInorder(root.left);
            System.out.print(root.info+" ");
            printInorder(root.right);
        }
    }

    void printPreorder(BST root){
        if(root!=null){
            System.out.print(root.info+" ");
            printPreorder(root.left);
            printPreorder(root.right);
        }
    }

    void printPostorder(BST root){
        if(root!=null){
            printPostorder(root.left);
            printPostorder(root.right);
            System.out.print(root.info+" ");
        }
    }
    
}
class BinarySearchTree {
    public static void main(String[] args) {
        BST t=new BST();
        t.insert(5);
        t.insert(6);
        t.insert(12);
        t.insert(22);
        t.insert(3);
        t.insert(2);
        t.insert(45);
        t.insert(53);
        t.insert(122);
        t.insert(7);
        System.out.println("Height of tree is "+t.height(t.root));
        System.out.println("Depth of tree is "+t.depth(t.root));
        System.out.println("BalanceFactor of tree is "+t.BalanceFactor(t.root));
        System.out.println(t.search(7));
        System.out.println(t.isBalanced(t.root));
        System.out.println(t.search(2));
        System.out.println(t.search(122));
        System.out.println(t.search(18));
        System.out.println(t.search(45));
        t.printPreorder(t.root);
        System.out.println();
        t.printPostorder(t.root);
        System.out.println();
        t.printInorder(t.root);
        t.delete(45);
        // t.delete(5);  //problem is after deleting root node
        t.delete(22);
        System.out.println();
        t.printInorder(t.root);
        t.delete(2);
        t.delete(3);
        System.out.println();
        t.printInorder(t.root);
        System.out.println();
        BST x=new BST();
        x.insert(10);
        x.insert(9);
        x.insert(11);
        System.out.println(x.BalanceFactor(x.root));
        System.out.println(x.isBalanced(x.root));
    }    
}
