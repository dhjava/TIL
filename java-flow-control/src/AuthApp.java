public class AuthApp {
    public static void main(String[] args) {
        String id = "egoing";
        String inputId = "egoing";

        String pass = "1111";
        String inputPass = "1111";

        System.out.println("Hi.");

//        if(inputId == id){
//            System.out.println("Master!");
//        if(inputId.equals(id)){
//            if(inputPass.equals(pass)){
//                System.out.println("Master!");
//            }else {
//                System.out.println("Wrong password!");
//            }
//        }else{
//            System.out.println("Who are you?");
//        }

        if(inputId.equals(id) && inputPass.equals(pass)) {
            System.out.println("Master!");
        }else {
            System.out.println("Who are you?");
        }
    }
}
