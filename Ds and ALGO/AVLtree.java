import java.util.*;

class AVL{
    int info;
    AVL root,left,right;
    AVL(){
        left=null;
        right=null;
    }
    AVL(int info){
        this.info=info;
        left=null;
        right=null;
    }

    AVL insert(AVL root,int info){
        AVL n=new AVL(info);
        if(root==null){
            root=n;
            return root;
        }
        Stack<AVL> st=new Stack<>();
        AVL prev=null,ptr=root;
        while(ptr!=null){
            prev=ptr;
            st.push(prev);
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
        st=refine(st);
        if(!st.isEmpty()){
            AVL temp=st.peek();
            if(n.info<temp.info){
                if(n.info<temp.left.info){
                    leftLeft(st);
                }
                else{
                    
                }
            }
            else{
                if(n.info>temp.right.info){
                    rightRight(st);
                }
                else{

                }
            }
        }
        return root;
    }

    void rightRight(Stack<AVL> st){
        AVL x=leftRotate(st.pop());
        if(!st.isEmpty()){
            AVL ance=st.pop();
            ance.right=x;
        }
    }

    void leftLeft(Stack<AVL> st){
        AVL x=rightRotate(st.pop());
        if(!st.isEmpty()){
            AVL ance=st.pop();
            ance.left=x;
        }
    }

    AVL rightRotate(AVL root){
        if(root==null){
            return null;
        }
        if(root.left!=null){
            AVL l=root.left;
            root.left=l.right;
            l.right=root;
            root=l;
        }
        return root;
    }

    AVL leftRotate(AVL root){
        if(root==null){
            return null;
        }
        if(root.right!=null){
            AVL r=root.right;
            root.right=r.left;
            r.left=root;
            root=r;
        }
        return root;
    }
    
    Stack<AVL> refine(Stack<AVL> st){
        while(!st.isEmpty()){
            int bf=balancefactor(st.peek());
            if(bf<-1 || bf>1){
                break;
            }
            st.pop();
        }
        return st;
    }

    int balancefactor(AVL root){
        if(root==null){
            return -1;
        }
        else{
            int lh=height(root.left);
            int rh=height(root.right);
            return lh-rh;
        }
    }

    int height(AVL root){
        if(root==null){
            return 0;
        }
        int l=height(root.left);
        int r=height(root.right);
        return (l>r)?l+1:r+1;
    }
}
class AVLtree {
    static void printPreorder(AVL root){
        if(root!=null){
            System.out.print(root.info+" ");
            printPreorder(root.left);
            printPreorder(root.right);
        }
    }
    public static void main(String[] args) {
        AVL x=new AVL();
        x.root=x.insert(x.root,10);
        x.root=x.insert(x.root,20);
        x.root=x.insert(x.root,30);
        x.root=x.insert(x.root,50);
        x.root=x.insert(x.root,60);
        // printLevelOrderLineByLine(x.root);
        printPreorder(x.root);
    }
}
