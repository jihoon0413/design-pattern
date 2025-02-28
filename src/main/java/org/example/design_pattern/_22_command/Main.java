package org.example.design_pattern._22_command;

import org.example.design_pattern._22_command.command.Command;
import org.example.design_pattern._22_command.command.MacroCommand;
import org.example.design_pattern._22_command.drawer.ColorCommand;
import org.example.design_pattern._22_command.drawer.DrawCanvas;
import org.example.design_pattern._22_command.drawer.DrawCommand;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
    private MacroCommand history = new MacroCommand();
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);
    private JButton clearButton = new JButton("clear");
    private JButton redButton = new JButton("red");
    private JButton greenButton = new JButton("green");
    private JButton blueButton = new JButton("blue");
    private JButton undoButton = new JButton("undo");


    public Main(String title) {
        super(title);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        canvas.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                Command cmd = new DrawCommand(canvas, e.getPoint());
                history.append(cmd);
                cmd.execute();
            }

        });

        clearButton.addActionListener(e -> {
            history.clear();
            canvas.init();
            canvas.repaint();
        });

        redButton.addActionListener(e -> {
            Command cmd = new ColorCommand(canvas, Color.red);
            history.append(cmd);
            cmd.execute();
        });

        greenButton.addActionListener(e -> {
            Command cmd = new ColorCommand(canvas, Color.green);
            history.append(cmd);
            cmd.execute();
        });

        blueButton.addActionListener(e -> {
            Command cmd = new ColorCommand(canvas, Color.blue);
            history.append(cmd);
            cmd.execute();
        });

        undoButton.addActionListener(e -> {
            history.undo();
            canvas.repaint();
        });

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        buttonBox.add(redButton);
        buttonBox.add(greenButton);
        buttonBox.add(blueButton);
        buttonBox.add(undoButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        setVisible(true);
    }

//    @Override
//    public void mouseDragged(MouseEvent e) {
//        Command cmd = new DrawCommand(canvas, e.getPoint());
//        history.append(cmd);
//        cmd.execute();
//    }
//
//    @Override
//    public void windowClosing(WindowEvent e) {
//        System.exit(0);
//    }
//
//    @Override
//    public void mouseMoved(MouseEvent e) {}
//    @Override
//    public void windowOpened(WindowEvent e) {}
//    @Override
//    public void windowClosed(WindowEvent e) {}
//    @Override
//    public void windowIconified(WindowEvent e) {}
//    @Override
//    public void windowDeiconified(WindowEvent e) {}
//    @Override
//    public void windowActivated(WindowEvent e) {}
//    @Override
//    public void windowDeactivated(WindowEvent e) {}

    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }
}
