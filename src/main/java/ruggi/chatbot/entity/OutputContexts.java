package ruggi.chatbot.entity;

public class OutputContexts {
    private String name;
    private long lifespanCount;
    private Parameters parameters;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getLifespanCount() {
        return lifespanCount;
    }

    public void setLifespanCount(long lifespanCount) {
        this.lifespanCount = lifespanCount;
    }

    public Parameters getParameters() {
        return parameters;
    }

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }
}
