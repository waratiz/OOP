package Lab3;
public class StringManipulator {
    public static void main(String[] args) {
        String s1 = "Hello",s2 ="Hello";
        String s3 = new String("Hello");
        StringBuilder sb = new StringBuilder("programming");

        sb.insert(0, "fun");
        sb.append("is great");
        sb.delete(0, 3);

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        System.out.println(sb);
    }
}
