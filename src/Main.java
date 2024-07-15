public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Initialize array
        String[] names = {"Alice", "Pedro", "Chris", "Amanda"};

        //Print length
        System.out.println(names.length);

        //Print all
        for (String item : names) {
            System.out.println(item + ",");
        }

        //Retrieve element at index
        System.out.println(names[2]);

        //Replace value with null. Cannot delete since cannot change array size.
        names[1] = null;
        for (String item : names) {
            System.out.println(item + ",");
        }
    }
}