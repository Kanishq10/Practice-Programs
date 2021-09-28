import java.util.ArrayList;

class LHeap{  //min heap
    ArrayList<Integer> l=new ArrayList<>();
    void insert(int n){
        l.add(n);
        int curr=l.size()-1;
        while (curr>0) {
            int pi; //parents's index
            if(curr%2==0){
                pi=(curr/2)-1;
            }
            else{
                pi=(curr-1)/2;
            }
            if(l.get(pi)>l.get(curr)){   //if parent greater than child ,swap
                Integer temp=l.get(curr);
                l.set(curr,l.get(pi));
                l.set(pi, temp);
                curr=pi;
            }
            else{
                break;
            }
        }
    }

    void delete(int n){  //verify it online
        int curr=-1;
        for(int i=0;i<l.size();i++){
            if(l.get(i)==n){
                curr=i;
                break;
            }
        }
        if(curr==-1){
            return;
        }
        //swap
        l.set(curr, l.get(l.size()-1));
        l.remove(l.size()-1);
        int L=curr*2+1;
        int R=curr*2+2;
        while((L<l.size()) && (l.get(L)<l.get(curr) || l.get(R)<l.get(curr))){
            if(R>=l.size()){  //only left child
                Integer temp=l.get(curr);
                l.set(curr,l.get(L));
                l.set(L, temp);
                curr=L;
            }
            else{
                if(l.get(L)<l.get(R)){
                    Integer temp=l.get(curr);
                    l.set(curr,l.get(L));
                    l.set(L, temp);
                    curr=L;
                }
                else{
                    Integer temp=l.get(curr);
                    l.set(curr,l.get(R));
                    l.set(R ,temp);
                    curr=R;
                }
            }
            L=curr*2+1;
            R=curr*2+2;
        }
    }

    void print(){
        for(Integer i:l ){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
class HeapArrayListMin {
    public static void main(String[] args) {
        LHeap h=new LHeap();
        h.insert(10);
        h.insert(19);
        h.insert(20);
        h.print();
        h.insert(11);
        h.insert(30);
        h.insert(35);
        h.print();
        h.delete(10);
        h.print();
    }    
}
