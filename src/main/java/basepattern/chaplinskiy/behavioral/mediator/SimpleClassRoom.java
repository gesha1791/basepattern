package basepattern.chaplinskiy.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleClassRoom implements ClassRoom {
    User teacher;
    List<User> users = new ArrayList<User>();

    public void setAdmin(User teacher) {
        this.teacher = teacher;
    }

    public void addUserToChat(User user){
        this.users.add(user);
    }

    public void sendMessage(String message, User user) {
        for(User u : users){
            if (u != user){
                u.getMessage(message);
            }
        }
        teacher.getMessage(message);
    }
}
