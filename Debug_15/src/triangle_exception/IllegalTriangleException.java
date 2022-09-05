package triangle_exception;

import java.util.Scanner;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String str) {
        super(str);
    }
}
