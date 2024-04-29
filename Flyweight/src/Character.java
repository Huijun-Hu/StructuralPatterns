public class Character {
    private char content;
    private CharacterProperties properties;

    public Character(char content, CharacterProperties properties) {
        this.content = content;
        this.properties = properties;
    }

    public char getContent() {
        return content;
    }

    public void setContent(char content) {
        this.content = content;
    }

    public CharacterProperties getProperties() {
        return properties;
    }

    public void setProperties(CharacterProperties properties) {
        this.properties = properties;
    }

}
