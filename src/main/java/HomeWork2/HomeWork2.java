package HomeWork2;

public class HomeWork2 {
    public static void main(String[] args) {

        String testString = "My test string";
        String newString = "My new string";

        String firstName = "Denis";
        String lastName = "Velinov";
        String middleName = "Lyubomirov";

        System.out.println("My name is: " + firstName);

        // Сравнете 2 стринга дали са еднакви
        System.out.println(testString.equals(testString + newString));

        // Пребройте колко думи има в един стринг
        String [] stringsArray = testString.split(" ");
        System.out.println(testString + " has " + stringsArray.length + " words ");

        //Обединете 2 или повече стринга
        System.out.println(firstName + " " + middleName + " " + lastName);


    }
}
