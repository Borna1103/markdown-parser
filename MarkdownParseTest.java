import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
public class MarkdownParseTest {
    Path fileName = Path.of("test-file.md");
    String content = Files.readString(fileName);
    ArrayList<String> output = new ArrayList<>();
    output.add("https://something.com");
    output.add("some-thing.html");
    
    @Test
    public void test() throws IOException{
        assertEquals(output , MarkdownParse.getLinks(content));
    }
}
