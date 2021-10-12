class QPA{
    int front[]=new int[20];
    int rear[]=new int[20];
    int pno[]=new int[20];
    int arr[][]=new int[20][20];
    QPA() {
        for (int i = 0; i < 20; i++) {
            front[i] = -1;
            rear[i] = -1;
            pno[i] = -1;
        }
    }
  

    void insert(int data,int priority){
        int i=0;
        while((pno[i]!=priority) && (front[i]==0 && rear[i]==19 || front[i]==rear[i]-1) && (pno[i]!=-1)){
            i++;
        }
        pno[i]=priority;
        if(front[i]==-1 && rear[i]==-1){
            front[i]=0;
            rear[i]=0;
        }
        else if(rear[i]==19 && front[i]!=0){
            rear[i]=0;
        }
        else{
            rear[i]++;
        }
        arr[i][rear[i]]=data;
    }

    void delete(){
        int i=0;
        while(((front[i]==-1 && rear[i]==-1) || (front[i]==rear[i]-1)) && pno[i]!=-1){
            i++;
        }
        if(front[i]==rear[i]){
            front[i]=-1;
            rear[i]=-1;
        }
        else if(front[i]==19){
            front[i]=0;
        }
        else{
            front[i]++;
        }
    }

    void delete(int priority){
        int i=0;
        while((front[i]==-1 && rear[i]==-1) || pno[i]!=priority){
            i++;
            if(pno[i]==-1){
                break;
            }
        }
        if(front[i]==rear[i]){
            front[i]=-1;
            rear[i]=-1;
        }
        else if(front[i]==19){
            front[i]=0;
        }
        else{
            front[i]++;
        }
    }
    
    void display(int i){
        if(front[i]==-1 && rear[i]==-1){
            return;
        }
        else if(front[i]>rear[i]){
            for(int j=front[i];j<19;j++){
                System.out.print(arr[i][j]+" ");
            }
            for(int j=0;j<=rear[i];j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }

    void print(int priority){
        int i=0;
        while(pno[i]!=-1){
            if(pno[i]==priority){
                display(i);
            }
        }
        System.out.println();
    }
}
class QueuePriorityArray {
    public static void main(String[] args) {
        QPA x=new QPA();
        x.insert(19, 2);
        x.insert(232, 2);
        x.insert(23, 2);
        x.print(2);
    }
}
