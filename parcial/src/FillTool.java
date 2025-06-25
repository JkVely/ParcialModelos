import java.util.List;
import java.util.Random;

public class FillTool implements GraphicTool {
    private Color color;

    public FillTool(){
        this.color = chooseColor();
    }

    @Override
    public Color chooseColor() {
        List<Color> colors = ColorPalette.getColors();
        Random random = new Random();
        this.color = colors.get(random.nextInt(colors.size()));
        return this.color;
    }

    public List<Color> getAvailableColors() {
        return ColorPalette.getColors();
    }

    public Color getCurrentColor() {
        return color;
    }
}