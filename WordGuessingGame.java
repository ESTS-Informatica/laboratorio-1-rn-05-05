
/**
 * Escreva uma descrição da classe WordGuessingGame aqui.
 * 
 * @author (Diana e Vitor) 
 * @version (versão 2.3)
 */

public class WordGuessingGame
{
    // variáveis de instância
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;   
    private InputReader reader;
    

    /**
     * Construtor para objetos da classe WordGuessingGame
     */
    public WordGuessingGame()
    {
        // inicializa variáveis de instância
        this.hiddenWord = "abc";
        this.guessedWord = "___";
        this.numberOfTries = numberOfTries;
        this.reader = new InputReader();
    }
    
    public void setHiddenWord(String hiddenWord){
        this.hiddenWord = hiddenWord;
    }
    
    public String getHiddenWord(){
        return hiddenWord;
    }
    
    public void setGuessedWord(String guessedWord){
        this.guessedWord = guessedWord;
    }
    
    public String getGuessedWord(){
        return guessedWord;
    }
    
    public void setNumberOfTries(int numberOfTries){
        this.numberOfTries = numberOfTries;
    }
    
    public int getNumberOfTries(){
        return numberOfTries;
    }
    
    private void showGuessedWord(){
        System.out.println("Guessed word: " + getGuessedWord());
    }
    
    public void play(){
        showWelcome();
        char key = reader.getChar("Please enter a letter: ");
        if(guessedWord.equals(hiddenWord)){
            showGuessedWord();
            showResult();
        }
        else{
            guess(key);
        }
    }
    
    private void showWelcome(){
     System.out.println("********* Welcome ********");
    }
    
    private void guess(char letter){
        for(int i = 0 ; i < hiddenWord.length(); i++ ){ 
            if(hiddenWord.charAt(i) == letter){
                System.out.println("Letter is correct.");
                guessedWord = guessedWord.substring(0, i) + letter + guessedWord.substring(i + 1);
                break;
            }
            else{
                System.out.println("Wrong letter.");
                numberOfTries++;
            }
        }
     
    }
    
    private void showResult(){
        System.out.println("Number of tries: " + numberOfTries);
    }
    
}
