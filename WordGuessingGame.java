
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
    private String guessebWord;
    private int numberOfTries;   
    private InputReader reader;
    

    /**
     * Construtor para objetos da classe WordGuessingGame
     */
    public WordGuessingGame()
    {
        // inicializa variáveis de instância
        this.hiddenWord = "abc";
        this.guessebWord = "___";
        this.numberOfTries = numberOfTries;
        this.reader = new InputReader();
    }
    
    public void setHiddenWord(String hiddenWord){
        this.hiddenWord = hiddenWord;
    }
    
    public String getHiddenWord(){
        return hiddenWord;
    }
    
    public void setGuessebWord(String guessebWord){
        this.guessebWord = guessebWord;
    }
    
    public String getGuessebWord(){
        return guessebWord;
    }
    
    public void setNumberOfTries(int numberOfTries){
        this.numberOfTries = numberOfTries;
    }
    
    public int getNumberOfTries(){
        return numberOfTries;
    }
    
    private void showGuessebWord(){
        System.out.println("Guess word: " + getGuessebWord());
    }
     public void play(){
        new InputReader
        char key = input.next().charAt(0);
        guess(key);
        
        }
    private void showWelcome(){
     System.out.println("********* Bem Vindo ********");
    }
    
    private void guess(char letter){
        for(int i = 0 ; i < hiddenWord.length(); i++ ){ 
            if(hiddenWord.charAt(i)==letter){
                System.out.println("Letra encontrada");
                guessedWord.replace(i, letter);
                break;
            }
            else{
                System.out.println("Letra não encontrada");
                numeberOfTries++;
            }
        }
     
    } 
    private void showResult(){
        System.out.println("Tentativas: " + numberOfTries);
    }
    
}
