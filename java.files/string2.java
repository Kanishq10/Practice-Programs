class string2 {
    public static void main(String[] args) {
        System.out.println("efdvhgdx ybt hjnf java".lastIndexOf('a'));
        String x="hello how are you";
        System.out.println(x.isEmpty());
        System.out.println(x.charAt(6));
        System.out.println(x.indexOf('h',3));
        // System.out.printf("%8d.4f",1234,"java",5.65);
        System.out.println("java"+1+2+3);//debugging start from left since it is starting with string then it convertes all to string
        System.out.println(1+2+3+"java");//first is int so it first simply add
        System.out.println(1+2+"java"+1+2);
        System.out.println(x.substring(3,9));
        System.out.println(x.substring(5));
        String h="     hello  how are you     ";
         System.out.println("string without trim:"+h);
         System.out.println("string with trim: "+h.trim());
         int value=5678;
         String s1=String.valueOf(value);
         System.out.println(s1+769);
         h=h.replace("h", "t");
         System.out.println(h);
         System.out.println(h.contains("a"));
         System.out.println(h.contains("tell"));
//          String s1="Welcome to Edureka";
// char[] ch=s1.toCharArray();
// for(int i=0;i<ch.length;i++){
// System.out.print(ch[i])
     System.out.println(h);
    }
}
