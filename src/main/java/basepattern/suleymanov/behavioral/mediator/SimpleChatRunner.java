package basepattern.suleymanov.behavioral.mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        Admin admin = new Admin(chat, "Admin");
        SimpleUser user1 = new SimpleUser(chat, "User1");
        SimpleUser user2 = new SimpleUser(chat, "User2");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("Hello, I am user 1 !!!!");

        admin.sendMessage("I am admin");


    }
}
