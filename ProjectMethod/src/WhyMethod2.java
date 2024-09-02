import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod2 {
    // 매개변수, Parameter
    public static void printTwoTimes(String text, String delimiter){
        System.out.println(delimiter);
        System.out.println(text);
        System.out.println(text);
    }
    public static void writeFileTwoTimes(String text, String delimiter) throws IOException {
        FileWriter fw = new FileWriter("output.txt");
        fw.write(delimiter + "\n");
        fw.write(text + "\n");
        fw.write(text + "\n");
        fw.close();
    }

    public static String twoTimes(String text, String delimiter){
        String out = "";
        out = out + delimiter + "\n";
        out = out + text + "\n";
        out = out + text + "\n";
        return out;
    }

    public static void main(String[] args) throws IOException {
        // 인자, argument
        System.out.println(twoTimes("a", "-"));
        FileWriter fw = new FileWriter("out.txt");
        fw.write(twoTimes("a", "*"));
        fw.close();
        printTwoTimes("a", "&");
//        Email.send("egoing@a.com", "two times a", twoTimes("a", "&"));
        printTwoTimes("b", "!");
    }
}
