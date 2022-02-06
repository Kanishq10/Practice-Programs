package Practice;
//
class PrepostNodeEdge {
    public static void recurs(int n){
        if(n==0){
            System.out.println("(┬┬┬┬) Base Case");
            return;
        }
        System.out.println("Pre Node");
        for(int i=0;i<3;i++){
            System.out.println("Pre Edge");
            recurs(n-1);
            System.out.println("Post Edge");
        }
        System.out.println("Post Node");
    }

    public static void main(String[] args) {
        recurs(2);
    }
}
