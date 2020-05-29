import Factory.User;
import Factory.UserFactory;
import Mediator.ChatRoom;

public class Main {

    public static void main(String[] args) {

        ChatRoom room = new ChatRoom();

        User ivan = UserFactory.createUser(  room, "user", "Ivan");
        User angel = UserFactory.createUser(room, "user", "Angel");
        User miro = UserFactory.createUser(room, "user", "Miro");

        ivan.send("Kum kolko shte se vijdame?");
        angel.send("Защо пишеш на шльокавица бе, неграмотник?");
        miro.send("addBot");
        ivan.send("Миро, защо и ти си неадекватен и какъв е този бот?");
        miro.send("Аз ще съм свободен след 5 ,защото съм на урок по английски.Как беше котка на английски ?");
        ivan.send("cat");

    }
}
