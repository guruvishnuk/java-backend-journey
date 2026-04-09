class Main1{
    public static void main(String[] args) {
        String a = new String("java");
        String b = new String("java");
        String c = "hello ";
        c = c.concat("World");
        System.out.println("c: "+c);
        System.out.println(a == b);// == operator is used to compare the reference of the string
        System.out.println(a.equals(b));// equals method is used to compare the content of the string
    }
}