public class MyClass {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int index = 10;

        try {
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
            //Handle the exception appropriately. For example, you can provide a default value or log the error
            System.out.println("Index out of bounds. Using default value 0");
            System.out.println(0);
        }
    }
}