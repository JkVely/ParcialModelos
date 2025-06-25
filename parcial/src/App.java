public class App {
    public static void main(String[] args) throws Exception {
        Red red = new Red();
        Green green = new Green();
        Blue blue = new Blue();
        Yellow yellow = new Yellow();
        Black black = new Black();

        // Intentar crear 3 instancias (con distintos colores o distinto orden)
        ColorPalette palette = ColorPalette.getInstance();
        palette.addColor(red);
        palette.addColor(green);

        System.out.println(palette.getColors());

        ColorPalette palette2 = ColorPalette.getInstance();
        palette2.addColor(yellow);
        System.out.println(palette2.getColors());

        ColorPalette palette3 = ColorPalette.getInstance();
        palette3.addColor(yellow);
        palette3.addColor(red);

        System.out.println(palette3.getColors());

        // Probar cada herramienta
        PaintTool paintTool = new PaintTool(new int[]{1, 2, 3});
        System.out.println(paintTool.getAvailableColors());
        paintTool.chooseColor();
        System.out.println("PaintTool color: " + paintTool.getCurrentColor());

        WriteTool writeTool = new WriteTool("Hello World");
        System.out.println(writeTool.getAvailableColors());
        writeTool.chooseColor();
        System.out.println("WriteTool color: " + writeTool.getCurrentColor());

        FillTool fillTool = new FillTool();
        System.out.println(fillTool.getAvailableColors());
        fillTool.chooseColor();
        System.out.println("FillTool color: " + fillTool.getCurrentColor());

        // Probar el singleton al añadir 2 colores
        ColorPalette palette4 = ColorPalette.getInstance();
        palette4.addColor(black);
        palette4.addColor(blue);
        System.out.println("Final Color Palette: " + palette4.getColors());

        // Volver a probar la paleta en cada Herramienta
        System.out.println("PaintTool available colors: " + paintTool.getAvailableColors());
        System.out.println("PaintTool choosen color: " + paintTool.chooseColor());
        
        System.out.println("WriteTool available colors: " + writeTool.getAvailableColors());
        System.out.println("WriteTool choosen color: " + writeTool.chooseColor());
        
        System.out.println("FillTool available colors: " + fillTool.getAvailableColors());
        System.out.println("FillTool choosen color: " + fillTool.chooseColor());


    }
}
