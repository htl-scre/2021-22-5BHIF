package wordProcessor;

public class EnglishSpellChecker implements SpellChecker {

    private Dictionary dictionary;

    public EnglishSpellChecker(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    @Override
    public void check(String content) {
        if (!dictionary.contains(content)) {
            throw new IllegalArgumentException("Spelling wrong");
        }
    }
}
