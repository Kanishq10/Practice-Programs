
class split {
    public static void main(String[] args) {
        String[] tokens="java@html@python".split("@");
        for (int i=0;i<tokens.length;i++){
            System.out.print(tokens[i]+" ");
        }
        String text="fg";
        System.out.println(text.toUpperCase());
    }
}
