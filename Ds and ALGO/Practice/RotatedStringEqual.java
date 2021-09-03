package Practice;

class RotatedStringEqual {
    public static void main(String[] args) {
        String a="ABCD";
        String b="CDAB";
        if((a.length()==b.length()) && (a+a).indexOf(b)!=-1){
            System.out.println("Both strings are equal");
        }
        else{
            System.out.println("No,both strings are not equal");
        }
    }    
}
