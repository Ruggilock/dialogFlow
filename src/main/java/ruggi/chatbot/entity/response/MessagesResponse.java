package ruggi.chatbot.entity.response;

import java.util.ArrayList;

public class MessagesResponse {
    private ArrayList<MessageResponse> messages = new ArrayList<>();

    public ArrayList<MessageResponse> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<MessageResponse> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "MessagesResponse{" +
                "messages=" + messages +
                '}';
    }
}

