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
        return info;
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
        System.out.println(t.search(7));
        System.out.println(t.search(3));
        System.out.println(t.search(122));
        System.out.println(t.search(18));
        System.out.println(t.search(45));
    }    
}
