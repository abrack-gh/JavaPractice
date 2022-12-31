package Design_Patterns.state;

public class Main {
    public static void Main(String[] args){
        var canvas = new Canvas();
        canvas.getCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}

