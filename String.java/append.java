public class append {
    public static void main(String[] args) {
        //String str="hello";
        StringBuilder str = new StringBuilder(5);
        str.append("heelo brothers");
        System.out.println(str.length());
        System.out.println(str.capacity());

        String str2 = "how are you";
        // str2.append("hi");
    }
}
