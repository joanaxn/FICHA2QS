
public class User {

    private double height;
    private int age;
    private String name;
    private double weight;
    private static double bmiSkinny = 18;
    private static double bmiHealthy = 25;
    private static double bmiOverW = 25;
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

    /**
     * Interrogative and modifier methods for instance variables.
     * Set methods allow for changing the value of the variable.
     * Get methods return the value of the variable.
     */

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {

        this.height = height;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public double getWeight() {

        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void setBmiSkinny(double bmiSkinny) {
        User.bmiSkinny = bmiSkinny;
    }

    public static double getBmiOverW() {
        return bmiOverW;
    }

    public static void setBmiHealthy(double bmiHealthy) {
        User.bmiHealthy = bmiHealthy;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public static void setInstanceCount(int instanceCount) {

        User.instanceCount = instanceCount;
    }


    public static void setBmiOverW(double bmiOverW) {

        User.bmiOverW = bmiOverW;
    }


    @Override
    public String toString () {
        return "Utente{" +
                "height=" + height +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    //vamos ver se funciona
}