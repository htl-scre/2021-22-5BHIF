package wordProcessor;

public class WordProcessor {

    private String content;
    private SpellChecker spellChecker;

    private void checkSpelling() {
        spellChecker.check(content);
    }
}
