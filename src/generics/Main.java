package generics;

public class Main {
    public static void main(String[] args) {
        someInterfaceImpl<String, Integer> someInterface = new someInterfaceImpl<>();
        someInterface.setKV("Max", 1);
        System.out.println(someInterface.getK() + " " + someInterface.getV());

        Box box = new Box();

    }

}
