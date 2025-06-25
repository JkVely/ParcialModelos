import java.util.ArrayList;
import java.util.List;

public class ColorPalette {
    private static final List<Color> colors = new ArrayList<>();
    private static ColorPalette instance;

    private ColorPalette() {
        // Prevent instantiation
    }

    public static void addColor(Color color) {
        if (colors.contains(color)) {
            System.out.printf("\nColor %s already exists in the palette.", color);
            return;
        }
        if (color == null) {
            System.out.println("Color cannot be null.");
            return;
        }
        colors.add(color);
    }

    public static List<Color> getColors() {
        return new ArrayList<>(colors);
    }

    public static ColorPalette getInstance() {
        if (instance == null) {
            instance = new ColorPalette();
        }
        return instance;
    }
}
