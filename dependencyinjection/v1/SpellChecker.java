package dependencyinjection.v1;

import dependencyinjection.Lexicon;

import java.util.Collections;
import java.util.List;

public class SpellChecker {
    private final Lexicon dictionary = new Lexicon();

    private SpellChecker() {
    }

    public static SpellChecker instance = new SpellChecker();

    public static SpellChecker getInstance() {
        return instance;
    }

    public boolean isValid(String word) {
        return true;
    }

    public List<String> suggestions(String typo) {
        return Collections.emptyList();
    }
}
