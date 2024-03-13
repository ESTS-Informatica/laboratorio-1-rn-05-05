
/**
 * Escreva uma descrição da classe WordGuessingGame aqui.
 * 
 * @author (Diana e Vitor) 
 * @version (versão 0.1)
 */
public class WordGuessingGame
{
    // variáveis de instância
    private String hiddenWord;
    private String guessWord;
    private int numberOfTries;    

    /**
     * Construtor para objetos da classe WordGuessingGame
     */
    public WordGuessingGame()
    {
        // inicializa variáveis de instância
        this.hiddenWord = "abc";
        this.guessWord = "___";
        this.numberOfTries = numberOfTries;
    }
    
    public void setHiddenWord(String hiddenWord){
        this.hiddenWord = hiddenWord;
    }
    
    public String getHiddenWord(){
        return hiddenWord;
    }
    
    public void setGuessWord(String guessWord){
        this.guessWord = guessWord;
    }
    
    public String getGuessWord(){
        return guessWord;
    }
    
    public void setNumberOfTries(int numberOfTries){
        this.numberOfTries = numberOfTries;
    }
    
    public int getNumberOfTries(){
        return numberOfTries;
    }
    
    public void ShowGuessWord(){
        System.out.println("Guess word: " + getGuessWord());
    }
}
