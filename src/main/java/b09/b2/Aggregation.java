package b09.b2;

class Head {
    private String size;

    public Head(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}

class Body {
    private String type;

    public Body(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class Human {
    private Head head;
    private Body body;  // Aggregation: Human "has" Head and Body

    public Human(Head head, Body body) {
        this.head = head;
        this.body = body;
    }

    public void showDetails() {
        System.out.println("Human with head size: " + head.getSize() + " and body type: " + body.getType());
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Head head = new Head("Medium");
        Body body = new Body("Athletic");
        Human human = new Human(head, body);
        human.showDetails();  // Output: Human with head size: Medium and body type: Athletic
    }
}

