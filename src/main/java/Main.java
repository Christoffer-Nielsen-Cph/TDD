public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        String [] strArray = {"hihi","hehe"};
        String [] strArrayTwo = {"hihi","hehe","haha"};
        System.out.println(myClass.greet("Christoffer"));
        System.out.println(myClass.greet(null));
        System.out.println(myClass.greet("CHRISTOFFER"));
        System.out.println(myClass.greet(strArray));
        System.out.println(myClass.greet(strArrayTwo));
    }
}
