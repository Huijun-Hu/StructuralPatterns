import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocumentEditor {
    private List<Character> charList = new ArrayList<>();
    private String filepath;
    // private CharacterPropertiesFactory factory;

    public DocumentEditor(String filepath) {
        this.filepath = filepath;
        // this.factory = factory;
    }

    public void save() {
        try (PrintWriter writer = new PrintWriter(filepath)) {
            for (Character c : charList) {
                writer.print(c.getContent());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String load() {
        StringBuilder data = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                data.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data.toString();
    }

    public void add(Character c) {
        charList.add(c);
    }

    public void edit(Character c, CharacterProperties prop) {
        c.setProperties(prop);
    }
}
