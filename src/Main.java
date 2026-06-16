public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from Main class!");
        Calculator calc = new Calculator();
        int result = calc.add(5, 3);
        System.out.println("5 + 3 = " + result);
    }
}
