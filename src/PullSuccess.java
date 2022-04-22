import javax.swing.*;
import java.awt.*;

public final class PullSuccess {

    private JButton OKButton;
    private JPanel panel;



    private PullSuccess() {

        OKButton.addActionListener(e -> {

            Main.end();

        });

        panel.update(panel.getGraphics());
        panel.setVisible(true);




    }

    public static void create () {
        JFrame frame = new JFrame("PullSuccess");
        frame.setPreferredSize(new Dimension(400, 200));
        frame.setContentPane(new PullSuccess().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
