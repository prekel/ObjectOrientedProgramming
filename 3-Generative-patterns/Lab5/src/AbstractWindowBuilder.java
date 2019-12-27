import javax.swing.*;

public abstract class AbstractWindowBuilder<T extends JFrame> extends AbstractBuilder<T> {
    abstract AbstractWindowBuilder<T> BuildProperties();
}
