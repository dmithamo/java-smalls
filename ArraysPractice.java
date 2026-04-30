public class ArraysPractice {

    public static void main(String[] args) {
        for (String arg : args) {
            arg = arg.equals("-h")
                ? "Hello"
                : arg.equals("-g")
                    ? "Goodbye"
                    : arg;
            System.out.print(arg + " ");
        }
    }
}
