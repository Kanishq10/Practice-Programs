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
        }
        else{
            prev.left=n;
        }
        st=refine(st);
        if(!st.isEmpty()){
            AVL temp=st.peek();
            if(n.info<temp.info){
                if(n.info<temp.left.info){
                    root=leftLeft(st);
                }
                else{
                    root=leftRight(st);
                }
            }
            else{
                if(n.info>temp.right.info){
                    root=rightRight(st);
                }
                else{
                    root=rightLeft(st);
                }
            }
        }
        return root;
    }

    AVL rightRight(Stack<AVL> st){     
        AVL x=leftRotate(st.pop());
        while(!st.isEmpty()){
            AVL ance=st.pop();
            if(x.info<ance.info){
                ance.left=x;
            }
            else{
              ance.right=x;  
            }
            x=ance;
        }
        return x;
    }

    AVL leftLeft(Stack<AVL> st){       
        AVL x=rightRotate(st.pop());
        while(!st.isEmpty()){
            AVL ance=st.pop();
            if(x.info<ance.info){
                ance.left=x;
            }
            else{
                ance.right=x;
            }
            x=ance;
        }
        return x;
    }

    AVL leftRight(Stack<AVL> st){      
        AVL child=leftRotate(st.peek().left);
        st.peek().left=child;
        AVL x=rightRotate(st.pop());
        while(!st.isEmpty()){
            AVL ance=st.pop();
            if(x.info<ance.info){
                ance.left=x;
            }
            else{
                ance.right=x;
            }
            x=ance;
        }
        return x;
    }

    AVL rightLeft(Stack<AVL> st){    
        AVL child=rightRotate(st.peek().right);
        st.peek().right=child;
        AVL x=leftRotate(st.pop());
        while(!st.isEmpty()){
            AVL ance=st.pop();
            if(x.info<ance.info){
                ance.left=x;
            }
            else{
                ance.right=x;
            }
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

    void delete(int info){  
        Stack<AVL> st=new Stack<>();
        if(root==null){
            System.out.println("Underflow");
            return;
        }
        else if(root.info==info){
            if(root.left==null && root.right==null){  //no child
                root=null;
            }
            else if(root.left!=null && root.right==null){  //one left child
                root=root.left;
            }
            else if(root.left==null && root.right!=null){   //one right child
                root=root.right;
            }
            else if(root.left!=null && root.right!=null){ //two childs
                AVL pre=root.right,ptr=root.right;   //approach is to find smallest in right subtree
                while(ptr.left!=null){
                    pre=ptr;
                    ptr=ptr.left;
                }
                if(ptr==pre){
                    root.info=ptr.info;
                    root.right=ptr.right;
                }
                else{
                    root.info=ptr.info;
                    pre.left=ptr.right;
                }
            }
            //identify the case with balance factor
        }
        else{
            AVL ptr=root;
            AVL pre=root;
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
                ptr=pre.left;
                AVL l=pre.left; //here is the approach to find largest in left subtree 
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
                    ptr.right=l.left;                    
                }
            }
        }
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
        System.out.println("\n");
        AVL y=new AVL();
        y.root=y.insert(y.root, 200);
        y.root=y.insert(y.root, 190);
        y.root=y.insert(y.root, 180);
        y.root=y.insert(y.root, 170);
        y.root=y.insert(y.root, 160);
        y.root=y.insert(y.root, 150);
        y.root=y.insert(y.root, 140);
        y.root=y.insert(y.root, 130);
        y.root=y.insert(y.root, 120);
        y.root=y.insert(y.root, 110);
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
        AVL z=new AVL();
        z.root=z.insert(z.root, 12);
        z.root=z.insert(z.root, 13);
        z.root=z.insert(z.root, 10);
        z.root=z.insert(z.root, 9);
        z.root=z.insert(z.root, 14);
        System.out.println("\n");
        printLevelOrderLineByLine(z.root);
        AVL test=new AVL();
        test.root=test.insert(test.root, 60);
        test.root=test.insert(test.root, 50);
        test.root=test.insert(test.root, 55);
        test.root=test.insert(test.root, 56);
        test.root=test.insert(test.root, 20);
        test.root=test.insert(test.root, 70);
        test.root=test.insert(test.root, 80);
        test.root=test.insert(test.root, 75);
        test.root=test.insert(test.root, 4);
        test.root=test.insert(test.root, 3);
        test.root=test.insert(test.root, 10);
        test.root=test.insert(test.root, 15);
        test.root=test.insert(test.root, 2);
        System.out.println("\n");
        printLevelOrderLineByLine(test.root);
    }
}
