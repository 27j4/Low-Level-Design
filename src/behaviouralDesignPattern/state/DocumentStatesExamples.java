package behaviouralDesignPattern.state;


interface DocumentState {
    void publish(Document doc);
}

class DraftState implements DocumentState {
    @Override
    public void publish(Document doc) {
        System.out.println("Document is in Draft state. Ready for review.");
        doc.setState(new ModerationState());
    }
}

class ModerationState implements DocumentState {
    @Override
    public void publish(Document doc) {
        System.out.println("Document is under Moderation. Awaiting approval.");
        doc.setState(new PublishedState());
    }
}

class PublishedState implements DocumentState {
    @Override
    public void publish(Document doc) {
        System.out.println("Document is Published and live.");
    }
}

class Document {
    private DocumentState state;

    public Document() {
        this.state = new DraftState();
    }

    public void setState(DocumentState state) {
        this.state = state;
    }

    public void publish() {
        state.publish(this);
    }
}

public class DocumentStatesExamples {
    public static void main(String[] args) {
        Document doc = new Document();

        doc.publish(); // Draft to Moderation
        doc.publish(); // Moderation to Published
        doc.publish(); // Already Published
    }
}
