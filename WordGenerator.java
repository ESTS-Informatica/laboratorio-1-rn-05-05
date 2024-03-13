import java.util.ArrayList;
import java.util.Random;
/**
 * Escreva uma descrição da classe WordGenerator aqui.
 * 
 * @author (Diana e Vitor) 
 * @version (versão 1)
 */
public class WordGenerator
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private ArrayList<String> words;

    /**
     * Construtor para objetos da classe WordGenerator
     */
    public WordGenerator()
    {
        // inicializa variáveis de instância
        this.words = new ArrayList<>();
        fillArrayList();
    }
    
    private void fillArrayList(){
        words.add("boolean");
        words.add("break");
        words.add("byte");
        words.add("case");
        words.add("char");
        words.add("class");
        words.add("continue");
        words.add("do");
        words.add("double");
        words.add("else");
        words.add("enum");
        words.add("for");
        words.add("if");
        words.add("import");
        words.add("int");
    }
    
    public String generateWord(){
        Random random = new Random();
        int index = random.nextInt(words.size());
        return words.get(index);
    }
    
    public void addWord(String word){
        words.add(word);
    }
}
