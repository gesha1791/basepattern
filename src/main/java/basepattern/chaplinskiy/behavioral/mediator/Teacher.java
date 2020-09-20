package basepattern.chaplinskiy.behavioral.mediator;

public class Teacher implements User {
    private SimpleClassRoom classRoom;
    private String name;

    public Teacher(SimpleClassRoom classRoom, String name) {
        this.classRoom = classRoom;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        classRoom.sendMessage(message, this);
    }

    public void getMessage(String message) {
        System.out.println(this.name + " receiving message: " + message + ".");
    }
}
