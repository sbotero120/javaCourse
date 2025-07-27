public class Main {
    public static void main(String[] args) {
        // Variable that can change its content
        String editableMessage = "This variable can change";
        System.out.println("The current content of the variable \"editableMessage\" is: " + editableMessage);

        System.out.println("The variable \"editableMessage\" will be updated...");
        editableMessage = "The variable no longer holds the same value";
        System.out.println("The new content of the variable \"editableMessage\" is: " + editableMessage);

        // Constant variable, its value cannot be changed
        final String constantMessage = "This value cannot be modified due to the use of the \"final\" keyword";
        System.out.println("The content of the constant variable \"constantMessage\" is: " + constantMessage);
    }
}
