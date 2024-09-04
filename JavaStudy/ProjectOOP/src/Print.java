class Print {
    public String delimeter = "";
    public Print(String delimeter){
        this.delimeter = delimeter;
    }

    public void A() {
        System.out.println(delimeter);
        System.out.println("A");
        System.out.println("A");
    }

    public void B() {
        System.out.println(delimeter);
        System.out.println("B");
        System.out.println("B");
    }
}

