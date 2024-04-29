import java.util.HashMap;

public class CharacterPropertiesFactory {
    private HashMap<String, CharacterProperties> characterPropertiesSet = new HashMap<>();

    public CharacterProperties getProperties(String font, String color, int size) {
        String key = font + color + size;
        if (characterPropertiesSet.containsKey(key)) {
            return characterPropertiesSet.get(key);
        } else {
            CharacterProperties prop = new CharacterProperties(font, color, size);
            characterPropertiesSet.put(key, prop);
            return prop;
        }

    }

    public int getSize() {
        return characterPropertiesSet.size();
    }
}
