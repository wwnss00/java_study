package sec01.verify.exam04;

public class Chatting {
    void startChat(String chatId) {
        String nickName = chatId;


        Chatting chatting = new Chatting();

        class Chat {
            public void start(){
                while (true) {
                    String inputData = "안녕하세요";
                    String message = "[" + nickName + "]" + inputData;
                    sendMessage(message);
                }
            }
            void sendMessage(String message) {
            }
        }

        Chat chat = new Chat();
        chat.start();
    }
}
