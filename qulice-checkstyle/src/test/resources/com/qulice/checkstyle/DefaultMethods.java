/**
 * Hello.
 */
package foo;

import java.util.List;
import java.util.function.Consumer;

/**
 * Simple.
 * @version $Id$
 * @author John Smith (john@example.com)
 */
public interface DefaultMethods {
    /**
     * Some data.
     * @return Some data.
     */
    List<String> data();

    /**
     * Some default method.
     * @param action Value to print
     */
    default void forEach(final Consumer<String> action) {
        for (final String blah : this.data()) {
            action.accept(blah);
        }
    }
}

