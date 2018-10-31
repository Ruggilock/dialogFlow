package ruggi.chatbot.entity;

import java.util.Arrays;

public class QueryResult {
    private String queryText = "";
    private Parameters parameters ;
    private Boolean allRequiredParamsPresent = true;
    private String fulfillmentText = "";
    private FulfillmentMessages fulfillmentMessages[] ;
    private OutputContexts outputContexts[];
    private Intent intent;
    private double intentDetectionConfidence;
    private String languageCode;

    public String getQueryText() {
        return queryText;
    }

    public void setQueryText(String queryText) {
        this.queryText = queryText;
    }

    public Parameters getParameters() {
        return parameters;
    }

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    public Boolean getAllRequiredParamsPresent() {
        return allRequiredParamsPresent;
    }

    public void setAllRequiredParamsPresent(Boolean allRequiredParamsPresent) {
        this.allRequiredParamsPresent = allRequiredParamsPresent;
    }

    public String getFulfillmentText() {
        return fulfillmentText;
    }

    public void setFulfillmentText(String fulfillmentText) {
        this.fulfillmentText = fulfillmentText;
    }

    public FulfillmentMessages[] getFulfillmentMessages() {
        return fulfillmentMessages;
    }

    public void setFulfillmentMessages(FulfillmentMessages[] fulfillmentMessages) {
        this.fulfillmentMessages = fulfillmentMessages;
    }

    public OutputContexts[] getOutputContexts() {
        return outputContexts;
    }

    public void setOutputContexts(OutputContexts[] outputContexts) {
        this.outputContexts = outputContexts;
    }

    public Intent getIntent() {
        return intent;
    }

    public void setIntent(Intent intent) {
        this.intent = intent;
    }

    public double getIntentDetectionConfidence() {
        return intentDetectionConfidence;
    }

    public void setIntentDetectionConfidence(double intentDetectionConfidence) {
        this.intentDetectionConfidence = intentDetectionConfidence;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    @Override
    public String toString() {
        return "QueryResult{" +
                "queryText='" + queryText + '\'' +
                ", parameters=" + parameters +
                ", allRequiredParamsPresent=" + allRequiredParamsPresent +
                ", fulfillmentText='" + fulfillmentText + '\'' +
                ", fulfillmentMessages=" + Arrays.toString(fulfillmentMessages) +
                ", outputContexts=" + Arrays.toString(outputContexts) +
                ", intent=" + intent +
                ", intentDetectionConfidence=" + intentDetectionConfidence +
                ", languageCode='" + languageCode + '\'' +
                '}';
    }
}
