import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class RegistrationDialog extends JFrame {
    private Controller controller;

    private JPanel contentPane;
    private JButton buttonRegister;
    private JButton buttonCancel;
    private JTextField textFieldLogin;
    private JPasswordField passwordField;
    private JPasswordField passwordFieldRepeat;

    public static class Builder extends AbstractBuilder<RegistrationDialog> {
        public Builder() {
            result = new RegistrationDialog();
        }

        public Builder BuildController(Controller controller) {
            getResult().controller = controller;
            return this;
        }

        public Builder BuildProperties() {
            getResult().setTitle("Регистрация");
            getResult().pack();

            return this;
        }
    }

    public RegistrationDialog() {
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
        var reg = controller.RegisterNewAccount(textFieldLogin.getText(),
                new String(passwordField.getPassword()),
                new String(passwordFieldRepeat.getPassword()));

        JOptionPane.showMessageDialog(this, reg.getStatusMessage());

        if (reg.getStatus() == Registration.Status.Success) {
            dispose();
        }
    }

    private void onCancel() {
        dispose();
    }

    public void Show() {
        setVisible(true);
    }
}
