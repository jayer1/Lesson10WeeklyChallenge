package independentcopy.reader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A simple interface (abstraction) to be used by all derived classes that need
 * to perform read operations. Although using an interface as a super class for
 * low-level detail classes is the preferred technique for implementing the
 * Dependency Inversion Principle, you could make this an abstract class and
 * achieve the same results. Just make sure you keep the readln() method
 * abstract as well.
 *
 * @author Jim Lombardo, WCTC Lead Java Instructor
 * @version 1.02
 * @see Copier.java, KeyboardReader.java and FileReader.java for dependencies
 * @see Driver for run instructions and info about design rules
 */
public interface Reader {

    // implement this interface and create your own derived class implementation
    public String readln();

}
