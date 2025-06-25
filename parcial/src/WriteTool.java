
import java.util.List;
import java.util.Random;

public class WriteTool implements GraphicTool {
    private String text;
    private Color color;

    public WriteTool(String text) {
        this.text = text;
        this.color = chooseColor();
    }

    @Override
    public Color chooseColor() {
        List<Color> colors = ColorPalette.getColors();
        Random random = new Random();
        this.color = colors.get(random.nextInt(colors.size()));
        return this.color;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
