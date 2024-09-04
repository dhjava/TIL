public class EqualsApp{
    public static void main(String[] args) {
        String o1 = "java";
        String o2 = new String("java");
        System.out.println(o1);
        System.out.println(o2);

        String o3 = "java2";
        String o4 = "java2";

        System.out.println(o3==o4);
        System.out.println(o3.equals(o4));
    }
}
