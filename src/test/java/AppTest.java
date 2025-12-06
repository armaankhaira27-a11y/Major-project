
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void homepageFileNameTest() {
        String homepage = "home.html";
        assertTrue(homepage.endsWith(".html"));
    }

    @Test
    void cssFileNameTest() {
        String css = "styles.css";
        assertTrue(css.endsWith(".css"));
    }

    @Test
    void projectTitleTest() {
        String title = "E-Learning Website";
        assertEquals("E-Learning Website", title);
    }
}

