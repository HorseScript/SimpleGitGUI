import javax.swing.*;
import java.awt.*;

public final class PushSuccess {

    private JButton OKButton;
    private JPanel panel;


    private PushSuccess() {

        OKButton.addActionListener(e -> {

            Main.end();

        });

        panel.update(panel.getGraphics());
        panel.setVisible(true);




    }

    public static void create () {
        JFrame frame = new JFrame("PullSuccess");
        frame.setPreferredSize(new Dimension(400, 200));
        frame.setContentPane(new PushSuccess().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
