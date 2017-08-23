package methodrefference.constructor;

interface Messageable {

    Message getMessage(String msg);
}

class Message {

    public Message(String msg) {
        System.out.println(msg);
    }
}

public class MethodReferenceConstructor {
    public static void main(String[] args) {
        Messageable m = Message::new;
        m.getMessage("Hello, Constructor Reference");
    }

}
