public class Runner {
    public static void main(String[] args){

        Calculator calculator = new Calculator("calculator");
        System.out.println(calculator.add(4, 4));
        System.out.println(calculator.subtract(4, 4));
        System.out.println(calculator.multiply(4, 4));
        System.out.println(calculator.divide(4, 4));

        WaterBottle waterBottle = new WaterBottle("Volvic", 100);
        waterBottle.drink();
        System.out.println(waterBottle.getVolume());
        waterBottle.empty();
        System.out.println(waterBottle.getVolume());
        waterBottle.fill();
        System.out.println(waterBottle.getVolume());

        Printer printer = new Printer(50, 100);
        Printer printer2 = new Printer(6, 10);
        System.out.println(printer.getPaper());
        System.out.println(printer.getTonerVolume());
        printer.print(10, 2);
        System.out.println(printer.getPaper());
        System.out.println(printer.getTonerVolume());
        System.out.println(printer2.getPaper());
        System.out.println(printer2.getTonerVolume());
        printer2.print(4, 2);
        System.out.println(printer2.getPaper());
        System.out.println(printer2.getTonerVolume());





}}
