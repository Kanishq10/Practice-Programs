package Practice;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class StringOperations {
    static String compressString(String str) {
        // Write your code here
        int count = 1;
        String res = "" + str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                if (count != 1) {
                    res += "" + count;
                }
                res += str.charAt(i);
                count = 1;
            }
        }
        if (count != 1) {
            res += "" + count;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(compressString("aaaabbc"));
    }
}