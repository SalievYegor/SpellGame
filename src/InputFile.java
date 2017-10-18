import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Halvasan on 18.10.2017.
 */
public class InputFile {

    private final Map<String,String> map = new HashMap<>();
    private final String fileName;

    public InputFile(String fileName) {
        this.fileName = fileName;
    }

    private void reader() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            String parts[] = line.split(" ");
            map.put(parts[0], parts[1]);
        }
        reader.close();
    }

    public void printMap() throws IOException {
        reader();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public void invokerSpellCombo (String invSpell) throws IOException {
        reader();

        String spells = map.get(invSpell);
        System.out.println(spells);
    }
}
