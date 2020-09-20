package basepattern.chaplinskiy.behavioral.mediator;


public class App {
    public static void main(String[] args) {
        SimpleClassRoom classRoom = new SimpleClassRoom();

        Teacher teacher = new Teacher(classRoom, "Techer");
        Student user1 = new Student(classRoom, "User1");
        Student user2 = new Student(classRoom, "User2");

        classRoom.setAdmin(teacher);
        classRoom.addUserToChat(user1);
        classRoom.addUserToChat(user2);

        user1.sendMessage("Hello, I am student 1 !!!!");

        teacher.sendMessage("I am admin");
    }
}
