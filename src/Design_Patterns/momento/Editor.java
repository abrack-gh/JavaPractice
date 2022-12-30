package Design_Patterns.momento;

//Momento Design Pattern used to implement undo function.

public class Editor {
    private String content;

    public EditorState createdState(){
        return new EditorState(content);
    }

    public void restore(EditorState editorState){
        content = editorState.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
