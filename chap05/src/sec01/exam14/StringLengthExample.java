package sec01.exam14;

public class StringLengthExample {
    public static void main(String[] args) {
        String ssn = "7333333333333";
        int length = ssn.length();
        if(length == 13){
            System.out.println("주민번호 자리수가 맞습니다.");
        } else {
            System.out.println("주민번호 자리수가 틀립니다.");
        }
    }
}
