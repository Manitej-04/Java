public class VariablesBug {

    public static void main(String[] args) {

        // 1. int age = "20";
        int age = 20;

        // 2. int marks;
        //System.out.println(marks);

        int marks = 100;
        System.out.println(marks);

        int a = 10;
        // 3. int b = 0;
        int b = 1;
        int result = a / b;
        System.out.println(result);

        // 4. System.out.println(name);
        String name = "Srujan";
        System.out.println(name);

        final int MAX = 100;
        // 5. MAX = 200;
    }
}