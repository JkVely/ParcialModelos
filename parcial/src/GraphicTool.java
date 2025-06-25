import java.util.List;

public interface GraphicTool {
    Color color = null;
    abstract Color chooseColor();

    
    default List<Color> getAvailableColors(){
        return ColorPalette.getColors();
    }

    default Color getCurrentColor(){
        return color;
    }
}
