package activities;
class CustomException extends Exception{
private String message = null;
//constructor
public CustomException (String message){
    this.message = message;
}
@Override
public String getMessage() {
    return message;
}
}
public class Activity8 {
    public static void main(String[] a){
        try {
            // Method call with correct input
            Activity8.exceptionTest("print to console");
            // Method call with incorrect input
            Activity8.exceptionTest(null); // Exception is thrown here
            Activity8.exceptionTest("Won't execute");
        } catch(CustomException exp) {
            System.out.println("Catch block error: " + exp.getMessage());
        }
    }
 
    static void exceptionTest(String string) throws CustomException {
        if(string == null) {
            throw new CustomException("String value is null");
        } else {
            System.out.println(string);
        }
    }

}
