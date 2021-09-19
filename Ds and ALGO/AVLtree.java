class AVL{
    int info;
    AVL left,right,root;
    AVL(){
        this.root=null;
    }
    AVL(int info){
        this.info=info;
        this.left=null;
        this.right=null;
    }

    void insert(int info){
        AVL n=new AVL(info);
        if(root==null){
            root=n;
            return;
        }
        AVL prev=null,ptr=root;
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
        AVL targ=checkBalance(root);
        if(targ!=null){
            int bf=BalanceFactor(targ);
        //Left Left Case
        if (bf > 1 && info < targ.left.info)
            rightRotate(targ);
 
        // Right Right Case
        if (bf < -1 && info > targ.right.info)
            leftRotate(targ);
 
        // Left Right Case
        if (bf > 1 && info > targ.left.info) {
            targ.left = leftRotate(targ.left);
            rightRotate(targ);
        }
 
        // Right Left Case
        if (bf < -1 && info < targ.right.info) {
            targ.right = rightRotate(targ.right);
            leftRotate(targ);
    }
        }
        
}

    int height(AVL n){
        if(n==null){
            return 0;     
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

    int BalanceFactor(AVL n){
        if(n==null)
              return -1;
        else{
                  int lh=height(n.left);
                  int rh=height(n.right);
                  return lh-rh;
            }
    }

    AVL checkBalance(AVL n){
        if(n==null){
            return null;
        }
        if(checkBalance(n.left)!=null){
            return checkBalance(n.left);
        }
        if(checkBalance(n.right)!=null){
            return checkBalance(n.right);
        }
        int lh=height(n.left);
        int rh=height(n.right);
        if((lh-rh>=-1) && (lh-rh<=1)){
            return null;
        } 
        else{
            return n;
        }
    }

    AVL rightRotate(AVL root){
        if(root==null){
            return null;
        }
        if(root.left!=null){
            AVL temp=root;
            root=root.left;
            temp.left=root.right;
            root.right=temp;
        }
        return root;
    }

    AVL leftRotate(AVL root){
        if(root==null){
            return null;
        }
        if(root.right!=null){
            AVL temp=root;
            root=root.right;
            temp.right=root.left;
            root.left=temp;
        }
        return root;
    }

}
class AVLtree {
    public static void main(String[] args) {
        AVL test=new AVL();
        test.insert(10);
        test.insert(5);
        test.insert(4);
    }    
}
