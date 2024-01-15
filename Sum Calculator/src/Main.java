public class Main {
    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.setFirstNumber(0.0);
        simpleCalculator.setSecondNumber(1.25);
        System.out.println("Add =" + simpleCalculator.getAdditionResult());
        System.out.println("Substract =" + simpleCalculator.getSubtractionResult());
        System.out.println("Multiple =" + simpleCalculator.getMultiplicationResult());
        System.out.println("Division =" + simpleCalculator.getDivisionResult());
    }
}
