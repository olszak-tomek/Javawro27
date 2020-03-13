package pl.sda.rafal.zientara.programowanie2.lesson5.FootballView;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.swing.*;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class FootballViewTest {

    private FootballView footballView = new FootballView();
    private FootballBoard board = new FootballBoard(6, 8);
    private FootballContract.Presenter presenter;
    private FootballContract.View view;
    private boolean playerTopTurn = true;


    @BeforeEach
    public void setup(){
        view = footballView;
        presenter = new FootballPresenter(view, board);
        footballView.setBoard(board);
        board.initSides();
        footballView.setPresenter(presenter);
        presenter.init();
    }

    @Test
    public void yolo(){

        presenter.moveTop();
        presenter.moveRight();
        presenter.moveBottomLeft();
        presenter.moveBottom();
        System.out.println("run");

    }

    @AfterEach
    public void test() {
        showMeBoard();
        waitForUser();
    }




    private void waitForUser(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Press ENTER");
        scanner.nextInt();
    }

    private void showMeBoard() {
        JFrame frame = new JFrame("Football");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        frame.add(footballView);
        frame.setVisible(true);

    }
}