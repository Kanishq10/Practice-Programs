import java.util.*;

class AVL{
    int info;
    AVL root,left,right;
    AVL(){
        left=null;
        right=null;
        root=null;
    }
    AVL(int info){
        this.info=info;
        root=null;
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
        AVL prev=root,ptr=root;
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
            // st.peek().right=n;
        }
        else{
            prev.left=n;
            // st.peek().left=n;
        }
        st=refine(st);
        if(!st.isEmpty()){
            System.out.println("YO");
            AVL temp=st.peek();
            if(n.info<temp.info){
                if(n.info<temp.left.info){
                    root=leftLeft(st);
                }
                else{
                    
                }
            }
            else{
                if(n.info>temp.right.info){
                    root=rightRight(st);
                }
                else{

                }
            }
        }
        return root;
    }

    AVL rightRight(Stack<AVL> st){     //corrected
        AVL x=leftRotate(st.pop());
        while(!st.isEmpty()){
            AVL ance=st.pop();
            ance.right=x;
            x=ance;
        }
        return x;
    }

    AVL leftLeft(Stack<AVL> st){       //corrected
        AVL x=rightRotate(st.pop());
        while(!st.isEmpty()){
            AVL ance=st.pop();
            ance.left=x;
            x=ance;
        }
        return x;
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

    static void printLevelOrderLineByLine(AVL root){ //this is without recursion
        if(root==null){
            return;
        }
        Queue<AVL> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            AVL curr=q.peek();
            q.remove();
            if(curr==null){
                if(!q.isEmpty()){
                    q.add(null);
                    System.out.println();
                }
            }
            else{
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
                System.out.print(curr.info+" ");
            }
        }
    }

    public static void main(String[] args) {
        AVL x=new AVL();
        x.root=x.insert(x.root,10);
        x.root=x.insert(x.root,20);
        x.root=x.insert(x.root,30);
        x.root=x.insert(x.root,50);
        x.root=x.insert(x.root,60);
        x.root=x.insert(x.root, 70);
        x.root=x.insert(x.root, 80);
        x.root=x.insert(x.root, 90);
        x.root=x.insert(x.root, 100);
        x.root=x.insert(x.root, 110);
        x.root=x.insert(x.root, 120);
        x.root=x.insert(x.root, 130);
        x.root=x.insert(x.root, 140);
        x.root=x.insert(x.root, 150);
        x.root=x.insert(x.root, 160);
        x.root=x.insert(x.root, 170);
        x.root=x.insert(x.root, 180);
        x.root=x.insert(x.root, 190);
        x.root=x.insert(x.root, 200);
        x.root=x.insert(x.root, 210);
        // printLevelOrderLineByLine(x.root);
        printLevelOrderLineByLine(x.root);
        AVL y=new AVL();
        y.root=y.insert(y.root, 100);
        y.root=y.insert(y.root, 90);
        y.root=y.insert(y.root, 80);
        y.root=y.insert(y.root, 70);
        y.root=y.insert(y.root, 60);
        y.root=y.insert(y.root, 50);
        y.root=y.insert(y.root, 40);
        y.root=y.insert(y.root, 30);
        y.root=y.insert(y.root, 20);
        y.root=y.insert(y.root, 10);
        printLevelOrderLineByLine(y.root);
    }
}
