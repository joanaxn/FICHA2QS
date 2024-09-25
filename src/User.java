
public class User {

    private double height;
    private int age;
    private String name;
    private double weight;
    private static int instanceCount = 0;

    /**
     * Empty constructor
     */
    public User() {
        instanceCount++;
    }

    /**
     * Constructor with two parameters
     *
     * @param height
     * @param age
     */
    public User(double height, int age) {
        this.height = height;
        this.age = age;
        instanceCount++;
    }

    /**
     * Constructor complete
     *
     * @param height
     * @param age
     * @param name
     * @param weight
     */

    public User(double height, int age, String name, double weight) {
        this.height = height;
        this.age = age;
        this.name = name;
        this.weight = weight;
        instanceCount++;
    }
}