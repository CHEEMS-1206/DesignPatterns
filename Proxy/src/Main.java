import com.designPatterns.subject.Image;
import com.designPatterns.proxy.ProxyImage;

public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Image is loaded only when display() is called
        System.out.println("First call to display()");
        image1.display();

        System.out.println("\nSecond call to display()");
        image1.display(); // No loading required this time

        System.out.println("\nDisplaying another image:");
        image2.display();
    }
}
