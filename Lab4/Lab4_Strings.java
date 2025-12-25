
public class Lab4_Strings {

    String data = " LogID: 582103 ";
    String trimmed;
    int colonIndex;
    String sub_String;
    String extracted;
    int length;

    public Lab4_Strings() {
        trimmed = data.trim();
        colonIndex = trimmed.indexOf(":");
        sub_String = trimmed.substring(colonIndex + 2);
        extracted = trimmed.toUpperCase();
        length = extracted.length();
    }

    public static void main(String[] args) {
        Lab4_Strings obj = new Lab4_Strings();

        System.out.println("After trim: " + obj.sub_String);
        System.out.println("After convert: " + obj.extracted);
        System.out.println("Length of string: " + obj.length);
        System.out.printf("| ID: %s | Length: %d |", obj.extracted, obj.length);
    }
}
