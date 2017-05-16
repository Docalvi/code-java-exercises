package JavaII;

/**
 * Created by emilioalvarado on 5/16/17.
 */
public class person {
    private String name;

    // returns the person's name
    public String getName() {
        return this.name;
    }

    // changes the name property to the passed value
    public void setName(String name) {
            this.name = name;
    }

    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.println("Hello " + getName());
    }
}
