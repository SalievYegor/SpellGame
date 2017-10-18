import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter Invoker's combo letters: ");
        String invSpell = br.readLine();

        InputFile inFile = new InputFile("E:\\InvokerSpells.txt");
        inFile.invokerSpellCombo(invSpell);
        inFile.printMap();

    }
}
