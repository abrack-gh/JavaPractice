package Design_Patterns.momento;

public class Main {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();


        editor.setContent("a");
        history.push(editor.createdState());

        editor.setContent("b");
        history.push(editor.createdState());

        editor.setContent("b");
        editor.restore(history.pop());
        editor.restore(history.pop());

        System.out.println(editor.getContent());


    }
}
