import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod3 {
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
    }
}
