package javadoc;

import java.io.Serializable;
import java.io.*;

/**
 * Example {@link Main}
 *
 * @author styopa
 * @version 1.0
 */
public class Dog implements Serializable {

    /**
     * field that stores name of the dog
     */
    String name;

    public Dog() {}

    /**
     * This is constructor
     * @param name name
     * @since 1.0
     */

    public Dog(String name) {
        this.name = name;
    }

    /**
     *
     * @return dog`s name
     */
    public String getName() {
        return name;
    }

    /**
     * @deprecated
     * @param name of the dog
     */
    @Deprecated
    public void setName(String name) {
        this.name = name;
    }
}

