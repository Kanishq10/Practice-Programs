class charArray {
    public static void main(String[] args) {
        String x="hello";
        char array[]=x.toCharArray();
        System.out.println(array);
        char arr[]=new char[5];
        for (int i=0;i<5;i++) {
            System.out.print(arr[i]+"@");
        }
        System.out.println();
    }
}
