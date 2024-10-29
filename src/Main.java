public class Main {
    public static void main(String[] args) {
        //დავალება 1
        int num1 = 11;
        int num2 = 12;
        int num3 = 13;
        double average = (num1 + num2 + num3) / 3.0;
        System.out.println("საშუალო: " + average);
        // დავალება 2
        int number = 9;
        String result = (number % 2 == 0) ? "ლუწი" : "კენტი";
        System.out.println("მოცემული რიცხვი: " + result);
        // დავალება 3
        int number1 = 17;
        int number2 = 23;
        int largest = (number1 > number2) ? number1 : number2;
        System.out.println("მოცემული რიცხვებიდან ყველაზე დიდი რიცხვია: " + largest);
        //დავალება 4
        int ricxvi = 7685;
        int ataseuli = ricxvi / 1000;
        int aseuli = (ricxvi / 100) % 10;
        int ateuli = (ricxvi / 10) % 10;
        int erteuli = ricxvi  % 10;
        int sumOfDigits = ataseuli + aseuli + ateuli + erteuli;
        System.out.println("ციფრთა ჯამი: " + sumOfDigits);
        // დავალება 5
        int angle1 = 60;
        int angle2 = 70;
        int angle3 = 80;

        if (angle1 + angle2 + angle3 == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0) {
            System.out.println("სამკუთხედი მიიღება.");
        } else {
            System.out.println("სამკუთხედი არ მიიღება.");
        }

    }
}