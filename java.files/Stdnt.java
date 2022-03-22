

class STUDENT{
    int id,Phoneno;
    String Name;
    char Branch;
    void input(int id,int Phoneno,String Name,char Branch){
        this.id=id;
        this.Phoneno=Phoneno;
        this.Name=Name;
        this.Branch=Branch;
    }

    void print(){
        System.out.println("Student Id: "+id+" Student Name: "+Name+" Student Branch: "+Branch+" Student Phoneno: "+Phoneno);
    }
}
class Stdnt {
    public static void main(String[] args) {
        STUDENT A=new STUDENT();
        A.input(1, 1020304050, "Kanishq", 'A');
        A.print();
        STUDENT B=new STUDENT();
        B.input(2, 908070605, "Arvin", 'B');
        B.print();
        STUDENT C=new STUDENT();
        C.input(3, 908070605, "Gubol", 'C');
        C.print();
    }
}
