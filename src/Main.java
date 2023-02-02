public class Main {
    public static void main(String[] args) throws DevideByZeroException {
        Calculator calc = new Calculator();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        /*
        int на 0 делить нельзя, чтобы избежать ArithmeticException
        тип данных должен быть с плавающей точкой.
        */
        if (b != 0) {
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } else {
            throw new DevideByZeroException("Can't divide by zero!!!");
        }
    }
}