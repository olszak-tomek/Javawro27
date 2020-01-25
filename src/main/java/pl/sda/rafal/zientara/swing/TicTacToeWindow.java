package pl.sda.rafal.zientara.swing;

import pl.sda.rafal.zientara.FieldStatus;
import pl.sda.rafal.zientara.TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeWindow {
    private TicTacToe game = new TicTacToe();

    public static void main(String[] args) { //psvm
        new TicTacToeWindow();
    }
    public TicTacToeWindow() {
        JFrame frame = new JFrame("First");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(true); //żeby się okno pokazało
        frame.setSize(300, 350);

        GridLayout gridLayout = new GridLayout(3, 3);
        frame.setLayout(gridLayout);
        for (int i = 0; i < 9; i++) {
            int col = i % TicTacToe.BOARD_SIZE;
            int row = i / TicTacToe.BOARD_SIZE;
 //           String text = Integer.toString(i);
            JButton button = new JButton();
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
//                    System.out.println("col" + col);
//                    System.out.println("row" + row);
                    game.action(col,row);
                    FieldStatus fieldStatus = game.getFieldStatus(col,row);
                    button.setText(fieldStatus.getText());
                    frame.setTitle(game.checkResult().toString());
                }
            });
        frame.add(button);
    }
        frame.setVisible(true);

    }

}
