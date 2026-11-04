//დავალება N4
//მომხმარებელმა გამოიწერა პროდუქცია და სტატუსების მიხედვით უნდა მიიღოს შეტყობინება.
// დაწერეთ კოდი, რომელიც switch -ის გამოყენებით დაამუშავებს შემდეგ მნიშვნელობებს:
//● როდესაც შეკვეთა არის ახალი და მისი სტატუსი არის NEW → მომხმარებელმა უნდა მიიღოს შეტყობინება Order received
//● როდესაც შეკვეთას ვამზადებთ და მისი სტატუსი არის PROCESSING → მომხმარებელმა უნდა მიიღოს შეტყობინება Order is being prepared
//● როდესაც გავუგზავნეთ შეკვეთა და სტატუსი არის SHIPPED → მომხმარებელმა უნდა მიიღოს შეტყობინება Order is on the way
//● როდესაც ჩაიბარა პროდუქტი და სტატუსი არის DELIVERED → მომხმარებელმა უნდა მიიღოს შეტყობინება Order delivered
//● თუ ზემოთ ჩამოთვლილი არცერთი სტატუსი არ არის მინიჭებული, მაშინ დაიბეჭდოს Unknown status.

public class Status {
    public static void main(String[] args) {

        String status = "PROCESSING";

        switch (status) {

            case "NEW":
                System.out.println("Order received");
                break;

            case "PROCESSING":
                System.out.println("Order is being prepared");
                break;

            case "SHIPPED":
                System.out.println("Order is on the way");
                break;

            case "DELIVERED":
                System.out.println("Order delivered");
                break;

            default:
                System.out.println("Unknown status");
                break;
        }
    }
}