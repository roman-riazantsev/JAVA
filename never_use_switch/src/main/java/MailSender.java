import java.util.HashMap;
import java.util.Map;

public class MailSender {

    public void sendMail(MailInfo mailInfo) {
        Map<Integer, Runnable> commands = new HashMap<>();

        commands.put(1, () -> System.out.println("welcome mail was generated and sent to " + mailInfo));
        commands.put(2, () -> System.out.println("don't call us we call you. was generated and sent to " + mailInfo));

        int num = mailInfo.getMailCode();

        if (commands.get(num) != null) {
            commands.get(num).run();
        } else {
            System.out.println("nothing");
        }
    }
}

