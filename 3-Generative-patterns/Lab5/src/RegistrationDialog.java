import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class RegistrationDialog extends JFrame {
    private JPanel contentPane;
    private JButton buttonRegister;
    private JButton buttonCancel;
    private JTextField textFieldLogin;
    private JPasswordField passwordField;
    private JPasswordField passwordFieldRepeat;

    public static class Builder extends AbstractWindowBuilder<RegistrationDialog> {
        public Builder() {
            result = new RegistrationDialog();
        }

        public Builder BuildProperties() {
            getResult().setTitle("Регистрация");
            getResult().pack();

            return this;
        }
    }

    private RegistrationDialog() {
        setContentPane(contentPane);
        getRootPane().setDefaultButton(buttonRegister);

        buttonRegister.addActionListener(e -> onRegister());

        buttonCancel.addActionListener(e -> onCancel());

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        contentPane.registerKeyboardAction(e -> onCancel(),
                KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),
                JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onRegister() {
        var reg = Controller.getInstance().RegisterNewAccount(textFieldLogin.getText(),
                new String(passwordField.getPassword()),
                new String(passwordFieldRepeat.getPassword()));

        new MessageBox.Builder()
                .BuildProperties()
                .BuildMessage(reg.getStatusMessage())
                .BuildIsNeedExit(reg.getStatus() == Registration.Status.Success)
                .getResult()
                .Show();
    }

    private void onCancel() {
        dispose();
    }

    public void Show() {
        setVisible(true);
    }
}
