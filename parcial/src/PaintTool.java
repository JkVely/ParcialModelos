import java.util.List;
import java.util.Random;



public class PaintTool implements GraphicTool {
    private Color color;
    private int[] vector;

    public PaintTool(int[] vector) {
        this.vector = vector;
        this.color = chooseColor();
    }

    @Override
    public Color chooseColor() {
        List<Color> colors = ColorPalette.getColors();
        Random random = new Random();
        this.color = colors.get(random.nextInt(colors.size()));
        return this.color;
    }

    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }
}
