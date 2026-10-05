// TODO: we need to add the missing classes!

// OK, I will add ‘Adder‘ and s38245 will add ‘Subtractor‘.

public class Main {
    public static void main (String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.add(7, 25));
        Subtractor subtractor = new Subtractor ();

        System.out.println(subtractor.subtract(16, 3));
    }
}
