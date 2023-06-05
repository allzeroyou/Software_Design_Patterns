package ch17.A2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameObserver extends Frame implements Observer, ActionListener {
  // GraphText는 통지된 수를 텍스트 필드로 표시하는 static 클래스
  static class GraphText extends TextField implements Observer {
    public GraphText(int columns) {
      super(columns);
    }

    // ⭐️
    @Override
    public void update(NumberGenerator generator) { // generator: 관찰대상

      int number = generator.getNumber(); // 숫자를 얻음

      String text = number + ":";
      for (int i = 0; i < number; i++) {
        text += '*';
      }

      setText(text); // 문자열 설정
    }
  }

  // GraphCanvas는 통지된 수를 원그래프로 표시하는 static 클래스
  static class GraphCanvas extends Canvas implements Observer {
    private int number;

    @Override
    public void update(NumberGenerator generator) { // 그림을 그린다.
      number = generator.getNumber();
      repaint(); // 도화지를 clear 한 후 숫자가 생성될때 마다 paint()를 호출함
    }

    public void paint(Graphics g) {
      int width = getWidth();
      int height = getHeight();

      // 원 전체를 그림
      g.setColor(Color.white);
      g.fillArc(0, 0, width, height, 0, 360);

      // 원호를 그림
      g.setColor(Color.red);
      g.fillArc(0, 0, width, height, 90, -number * 360 / 50);
    }
  }

  private GraphText textGraph = new GraphText(60);
  private GraphCanvas canvasGraph = new GraphCanvas();
  private Button buttonClose = new Button("Close");

  public FrameObserver() {
    super("FrameObserver"); // 부모생성자

    setLayout(new BorderLayout()); // 프레임 영역을 동서남북중앙으로 나눔

    setBackground(Color.pink);

    textGraph.setEditable(false); // text field 수정 불가

    add(textGraph, BorderLayout.NORTH); // 위치지정
    add(canvasGraph, BorderLayout.CENTER);
    add(buttonClose, BorderLayout.SOUTH);

    buttonClose.addActionListener(this);
    pack();
    setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println(e.toString());
    System.exit(0);
  }

  @Override
  public void update(NumberGenerator generator) {
    textGraph.update(generator); // textGraph에 update 호출
    canvasGraph.update(generator); // canvasGraph에 update 호출
  }
}
