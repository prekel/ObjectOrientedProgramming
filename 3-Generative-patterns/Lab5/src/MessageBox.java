import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MessageBox extends JFrame {
    private JPanel panel1;
    private JLabel messageLabel;

    public static class Builder extends AbstractWindowBuilder<MessageBox> {
        public Builder() {
            result = new MessageBox();
        }

        public Builder BuildProperties() {
            getResult().setTitle("Сообщение");
            getResult().pack();

            return this;
        }

        public Builder BuildMessage(String message) {
            getResult().messageLabel.setText(message);

            return this;
        }

        public Builder BuildIsNeedExit(boolean isNeedExit) {
            if (isNeedExit) {
                getResult().setDefaultCloseOperation(EXIT_ON_CLOSE);
            } else {
                getResult().setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            }
            return this;
        }
    }

    private MessageBox() {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setContentPane(panel1);
    }

    public void Show() {
        setVisible(true);
    }
}
