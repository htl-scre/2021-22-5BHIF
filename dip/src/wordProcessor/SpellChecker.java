package wordProcessor;

public class SpellChecker {

    private Dictionary dictionary;

    public void check(String content) {
        if (!dictionary.contains(content)) {
            throw new IllegalArgumentException("Spelling wrong");
        }
    }
}
