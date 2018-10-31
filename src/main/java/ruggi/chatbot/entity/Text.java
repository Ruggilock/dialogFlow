package ruggi.chatbot.entity;

import java.util.ArrayList;

public class Text {
    private ArrayList<String> text = new ArrayList<>();

    public ArrayList<String> getText() {
        return text;
    }

    public void setText(ArrayList<String> text) {
        this.text = text;
    }
}
