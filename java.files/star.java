class star {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int space=0;space<n-i;space++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        int fact=1;
        while(n>0){
            fact*=n;
            n--;
        }
        System.out.println(fact);
    }    
}
