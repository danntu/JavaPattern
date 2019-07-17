package singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject instance = SingleObject.getInstance();

        System.out.println(instance.toString());

        SingleObject singleObject = SingleObject.getInstance();
        System.out.println(singleObject.toString());

        instance.showMessage();
    }
}
