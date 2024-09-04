package Data_and_operation;

public class StringApp {
    public static void main(String[] args) {
        System.out.println("Hello World"); // String
//        System.out.println('Hello World'); => 자바에서 작은 따옴표는 특정 문자열을 나타냄
        System.out.println('H'); // Character
        System.out.println("H"); // String

        System.out.println("Hello " +
                "World"); // +는 글자만 합쳐줌

        // new line
        System.out.println("Hello \nWorld");

        // escape
        System.out.println("Hello \"World\""); // Hello "World" => 따옴표를 나타내려면 앞에 \ 붙여줘야 함
    }

}
