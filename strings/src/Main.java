public class Main {
    public static void main(String[] args) {
        // Se define el string
        // Define the string
        String feeling = "Today I feel very happy";
        System.out.println("The content of your string is: " + feeling);

        // Este sirve para contar cuántos caracteres tiene el string
        // This counts how many characters the string has
        int length = feeling.length();
        System.out.println("Your mood has this number of characters: " + length);

        // Este sirve para reemplazar una parte del string
        // This replaces a part of the string
        String updatedFeeling = feeling.replace("happy", "tired");
        System.out.println("Your mood has changed: " + updatedFeeling);

        // Verifica si el string termina con cierta secuencia
        // Checks if the string ends with a specific sequence
        boolean endsWithHappy = feeling.endsWith("happy");
        System.out.println("Does your mood end with 'happy'?: " + endsWithHappy);

        boolean endsWithBye = feeling.endsWith("sad");
        System.out.println("Does your mood end with 'sad'?: " + endsWithBye);

        // Verifica si el string empieza con cierta secuencia
        // Checks if the string starts with a specific sequence
        boolean startsWithToday = feeling.startsWith("Today");
        System.out.println("Does your mood start with 'Today'?: " + startsWithToday);

        boolean startsWithMy = feeling.startsWith("My");
        System.out.println("Does your mood start with 'My'?: " + startsWithMy);

        // Verifica si contiene cierta palabra
        // Checks if the string contains a specific word
        boolean containsMorning = feeling.contains("morning");
        System.out.println("Does it contain 'morning'?: " + containsMorning);

        boolean containsFeel = feeling.contains("feel");
        System.out.println("Does your mood contain loneliness?: " + containsFeel);

        // Devuelve la posición donde aparece una letra específica
        // Returns the position where a specific letter appears
        int indexOfF = feeling.indexOf("f");
        System.out.println("Your mood (which is 'happy') is at position: " + indexOfF);

        // Convierte todo el string a mayúsculas
        // Converts the string to uppercase
        String upperCaseFeeling = feeling.toUpperCase();
        System.out.println("Your mood in uppercase is: " + upperCaseFeeling);

        // Convierte todo el string a minúsculas
        // Converts the string to lowercase
        String lowerCaseFeeling = feeling.toLowerCase();
        System.out.println("Your mood in lowercase is: " + lowerCaseFeeling);
    }
}
