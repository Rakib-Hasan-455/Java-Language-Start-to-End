import jdk.nashorn.internal.runtime.ECMAException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception_Handle_Throw_Finally {
    public static void main(String[] args) throws FileNotFoundException, CustomException {
        Exception_Handle_Throw_Finally exceptions = new Exception_Handle_Throw_Finally();


            exceptions.FileNotFoundExceptionThrowStackTraceMethod();

            exceptions.TryCatchExceptionStackTrace();

// Nullpointerexception, outofboundexception, arthmeticexceptions
        exceptions.runTimeExceptions();

        exceptions.customExceptions();

        exceptions.multipleException();
    }

    private void multipleException() {
        int x = 0;

        try {
            File file = new File("Test.txt");
            FileReader fR = new FileReader(file);
            if(x == 0) {
                throw new CustomException("Hello X = 0\n");
            }
        } catch (CustomException | FileNotFoundException e) {
            System.out.println("Multiple Exception Occurred");
        }
    }


    private void runTimeExceptions() {
        try {
            System.out.println(1 / 0);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    private void customExceptions() {
        int x = 0;

        try {

            if(x == 0) {
                throw new CustomException("Hello X = 0\n");
            }
        } catch (CustomException e) {
            System.out.println("Exception Occurred ->  "+e);
        }
    }

    // Throws and Prints
    void FileNotFoundExceptionThrowStackTraceMethod() throws FileNotFoundException {
        File file = new File("Test.txt");

        FileReader fR = new FileReader(file);
    }


    // Throws and Print the exception
    void TryCatchExceptionStackTrace(){
        File file = new File("Test.txt");
        try{
            FileReader fR = new FileReader(file);
            System.out.println("This won't run anything as exception found above");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("There was file exception");
        }
        System.out.println("This will run as exception threw\n\n");
    }

    // Try catch is better way to throw exception as error not printed in console
    // Throws and Print In console without error
    void TryCatchExceptionNoStackTrace() {
        File file = new File("Test.txt");
        try{
            FileReader fR = new FileReader(file);
            System.out.println("This won't run anything as exception found above");
        } catch (FileNotFoundException e) {
            System.out.println("There was file exception");
        }
        System.out.println("This will run as exception threw");
    }

}
