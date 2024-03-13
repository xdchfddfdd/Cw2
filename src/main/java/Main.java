// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
    public static void main(String[] args) {
            String spacja = " ";
            String myString = "Hello world!";
        for (int i = 0; i < myString.length(); i++) {
            System.out.println(spacja.repeat(i)+myString.charAt(i));
        }
    }
}

  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
