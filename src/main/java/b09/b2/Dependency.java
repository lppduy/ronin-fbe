package b09.b2;

class Document {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

class Printer {
    public void print(Document doc) {  // Dependency: Printer depends on Document
        System.out.println("Printing document: " + doc.getContent());
    }
}

public class Dependency {
    public static void main(String[] args) {
        Document doc = new Document("Hello, World!");
        Printer printer = new Printer();
        printer.print(doc);  // Output: Printing document: Hello, World!
    }
}
