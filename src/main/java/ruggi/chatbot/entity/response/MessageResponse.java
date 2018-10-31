package ruggi.chatbot.entity.response;

public class MessageResponse {
    private String speech;
    private long type;

    public String getSpeech() {
        return speech;
    }

    public void setSpeech(String speech) {
        this.speech = speech;
    }

    public long getType() {
        return type;
    }

    public void setType(long type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "MessageResponse{" +
                "speech='" + speech + '\'' +
                ", type=" + type +
                '}';
    }
}
