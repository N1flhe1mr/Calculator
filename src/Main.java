public class Main {
    public static void main(String[] args) throws DevideByZeroException {
        Calculator calc = new Calculator();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        /*
        int на 0 делить нельзя, чтобы избежать ArithmeticException
        тип данных должен быть с плавающей точкой.
        */
        try {
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println(e + "- Integer can't devide by zero!");
        }
    }
}