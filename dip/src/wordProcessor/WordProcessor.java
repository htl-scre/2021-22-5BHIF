package wordProcessor;

public class WordProcessor {

    private String content = "Lorem ipüsum";
    private SpellChecker spellChecker;

    public WordProcessor(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    private void checkSpelling() {
        spellChecker.check(content);
    }
}
