package Design_Patterns.state;

public class Canvas {

    private Tool currentTool;

    public void mouseDown(){
        currentTool.mouseDown();
    }

    public void mouseUp(){
        currentTool.mouseUp();
    }

    public Tool getCurrentTool(EraserTool selectionTool) {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
