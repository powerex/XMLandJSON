package ua.edu.npu.xmlexample.stax;

import javax.xml.stream.XMLStreamException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Application {

    private static InputStream is;
    private static String path = "src/main/resources/file.xmlexample";

    public static void main(String[] args) {
        try {
            is = new FileInputStream(path);
            StaxStreamProcessor processor = new StaxStreamProcessor(is);

            while (processor.startElement("City", "Cities")) {
                System.out.println(processor.getAttribute("id") +":" + processor.getText());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
