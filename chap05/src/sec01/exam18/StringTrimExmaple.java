package sec01.exam18;

public class StringTrimExmaple {
    public static void main(String[] args) {
        String tel1 = "  02";
        String tel2 = "123   ";
        String tel3 = "   123   ";

        String tel = tel1.trim() + tel2.trim() + tel3.trim();
        System.out.println(tel);
    }
}
