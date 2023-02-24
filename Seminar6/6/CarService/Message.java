package Task1.CarSevice;

public class EmailMessage implements IMessage {
    @Override
    public void SendMessage(String typeMessage, String message) {

        if (typeMessage.equals("email")) {
            // email
        }

    }
}
public class SmsMessage implements IMessage {
    @Override
    public void SendMessage(String typeMessage, String message) {

        if (typeMessage.equals("SMS")) {
            // SMS
        }

    }
}

