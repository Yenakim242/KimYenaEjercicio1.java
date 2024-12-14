import java.util.ArrayList;
import java.util.List;

public class KimYenaPerfil {
    // Nombre del perfil
    private String name;
    // Historia personal
    private String story;
    // Lista de hobbies
    private List<String> hobbies;
    // Lista de comidas favoritas
    private List<String> foods;
    // Lista de datos curiosos
    private List<String> funFacts;

    // Constructor
    public KimYenaPerfil(String name, String story) {
        this.name = name;
        this.story = story;
        this.hobbies = new ArrayList<>();
        this.foods = new ArrayList<>();
        this.funFacts = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getStory() {
        return story;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public List<String> getFoods() {
        return foods;
    }

    public List<String> getFunFacts() {
        return funFacts;
    }

    // Métodos para devolver información formateada
    public String getFormattedStory() {
        return "=== My Story === \n" + story;
    }

    public String getFormattedHobbies() {
        return "=== Hobbies === \n" + String.join(", ", hobbies);
    }

    public String getFormattedFoods() {
        return "=== Favorite Foods ===\n" + String.join(", ", foods);
    }
}
