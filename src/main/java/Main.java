public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        String [] strArray = {"hihi","hehe"};
        System.out.println(myClass.greet("Christoffer"));
        System.out.println(myClass.greet("CHRISTOFFER"));
        System.out.println(myClass.greet(strArray.toString()));
    }
}
