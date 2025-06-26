package test.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MyTest {
    public static void main(String[] args) {
        int gridSize = 5;
        int totalBombs = 5;

        JFrame frame = new JFrame("간단한 지뢰찾기");
        frame.setLayout(new GridLayout(gridSize, gridSize));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        JButton[][] buttons = new JButton[gridSize][gridSize];

        // 무작위로 폭탄 위치 지정
        Set<Point> bombs = new HashSet<>();
        Random rand = new Random();
        while (bombs.size() < totalBombs) {
            bombs.add(new Point(rand.nextInt(gridSize), rand.nextInt(gridSize)));
        }

     // 버튼 생성
        for (int row = 0; row < gridSize; row++) {
            for (int col = 0; col < gridSize; col++) {
                JButton btn = new JButton();
                buttons[row][col] = btn;

                final int r = row;  // final 또는 effectively final
                final int c = col;

                btn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Point p = new Point(r, c); // final 변수 사용
                        if (bombs.contains(p)) {
                            btn.setText("💣");
                            btn.setBackground(Color.RED);
                            JOptionPane.showMessageDialog(frame, "펑! 게임 오버!");
                            frame.dispose();
                        } else {
                            int count = countNearbyBombs(bombs, r, c, gridSize);
                            btn.setText(count > 0 ? String.valueOf(count) : "");
                            btn.setEnabled(false);
                        }
                    }
                });

                frame.add(btn);
            }
        }

        frame.setVisible(true);
    }

    // 주변 폭탄 수 계산
    private static int countNearbyBombs(Set<Point> bombs, int row, int col, int size) {
        int count = 0;
        for (int r = row - 1; r <= row + 1; r++) {
            for (int c = col - 1; c <= col + 1; c++) {
                if (r >= 0 && c >= 0 && r < size && c < size) {
                    if (bombs.contains(new Point(r, c))) count++;
                }
            }
        }
        return count;
    }
}