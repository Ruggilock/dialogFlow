package ruggi.chatbot.entity.response;

import ruggi.chatbot.entity.FulfillmentMessages;

import java.util.ArrayList;

public class CustomResponse {
    private String fulfillmentText = "holaRuggilock";
    private ArrayList<FulfillmentMessages >fulfillmentMessages = new ArrayList<>();
    private String source = "testPage";

    public String getFulfillmentText() {
        return fulfillmentText;
    }

    public void setFulfillmentText(String fulfillmentText) {
        this.fulfillmentText = fulfillmentText;
    }

    public ArrayList<FulfillmentMessages> getFulfillmentMessages() {
        return fulfillmentMessages;
    }

    public void setFulfillmentMessages(ArrayList<FulfillmentMessages> fulfillmentMessages) {
        this.fulfillmentMessages = fulfillmentMessages;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
