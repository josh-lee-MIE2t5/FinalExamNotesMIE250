public class Generics {

    static <T> void genericDisplay(T element) {
        System.out.println(element.getClass().getName()
                + " = " + element);
    }

    // Java program to show working of user defined
    // Generic classes

    public static void main(String[] args) {
        // instance of Integer type
        Test<Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());

        // instance of String type
        Test<String> sObj = new Test<String>("GeeksForGeeks");
        System.out.println(sObj.getObject());

        // Output:
        // 15
        // GeeksForGeeks

        Test2<String, Integer> obj = new Test2<String, Integer>("GfG", 15);

        obj.print();

        // Output:
        // GfG
        // 15

        // Calling generic method with Integer argument
        genericDisplay(11);

        // Calling generic method with String argument
        genericDisplay("GeeksForGeeks");

        // Calling generic method with double argument
        genericDisplay(1.0);
        // Output:
        // java.lang.Integer = 11
        // java.lang.String = GeeksForGeeks
        // java.lang.Double = 1.0

    }

}

// We use < > to specify Parameter type
class Test<T> {
    // An object of type T is declared
    T obj;

    Test(T obj) {
        this.obj = obj;
    } // constructor

    public T getObject() {
        return this.obj;
    }
}

class Test2<T, U> {
    T obj1; // An object of type T
    U obj2; // An object of type U

    // constructor
    Test2(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    // To print objects of T and U
    public void print() {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

// Why use generics? it allows us to templatize classes for all primative data
// types with minimal errors.