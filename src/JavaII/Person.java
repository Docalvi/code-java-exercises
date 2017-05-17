package JavaII;

/**
 * Created by emilioalvarado on 5/16/17.
 */
public class Person {
    private String name;

    public Person(){

    }

    public String getName(){
    return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello " + name);
    }
}
