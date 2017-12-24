package Interface;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Program.Compute;

public class View extends JFrame {

	//宣告介面
	Container cp = this.getContentPane();
	
	//宣告物件
	public static JLabel output = new JLabel("0");
	JButton one = new JButton("1");
	JButton two = new JButton("2");
	JButton three = new JButton("3");
	JButton four = new JButton("4");
	JButton five = new JButton("5");
	JButton six = new JButton("6");
	JButton seven = new JButton("7");
	JButton eight = new JButton("8");
	JButton nine = new JButton("9");
	JButton zero = new JButton("0");
	JButton plus = new JButton("＋");
	JButton less = new JButton("−");
	JButton multiply = new JButton("×");
	JButton except = new JButton("÷");
	JButton equal = new JButton("＝");
	JButton point = new JButton(".");
	
	View()
	{
		//介面設定
		this.setSize(450, 290);//設定視窗大小
		this.setLayout(null);
		this.setTitle("Calculate");//視窗名稱
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//關閉視窗後動作
		this.setVisible(true);//顯示視窗
		
		//物件設定
		output.setBounds(10, 10, 400, 50);//設定位置
		output.setBorder(BorderFactory.createLineBorder(Color.gray, 1));//設定框線
		output.setHorizontalAlignment(SwingConstants.RIGHT);//設定文字對齊靠右
		output.setFont(new Font("Dialog",0,24));//設定字體大小，Font("字型",粗細(1＝粗，0＝預設),字體大小)
		
		seven.setBounds(10, 60, 100, 50);//設定位置
		eight.setBounds(110, 60, 100, 50);//設定位置
		nine.setBounds(210, 60, 100, 50);//設定位置
		except.setBounds(310, 60, 100, 50);//設定位置
		
		four.setBounds(10, 110, 100, 50);//設定位置
		five.setBounds(110, 110, 100, 50);//設定位置
		six.setBounds(210, 110, 100, 50);//設定位置
		multiply.setBounds(310, 110, 100, 50);//設定位置
		
		one.setBounds(10, 160, 100, 50);//設定位置
		two.setBounds(110, 160, 100, 50);//設定位置
		three.setBounds(210, 160, 100, 50);//設定位置
		less.setBounds(310, 160, 100, 50);//設定位置
		
		zero.setBounds(10, 210, 100, 50);//設定位置
		point.setBounds(110, 210, 100, 50);//設定位置
		equal.setBounds(210, 210, 100, 50);//設定位置
		plus.setBounds(310, 210, 100, 50);//設定位置
		
		//將物件放入介面
		cp.add(output);
		cp.add(seven);
		cp.add(eight);
		cp.add(nine);
		cp.add(except);
		cp.add(four);
		cp.add(five);
		cp.add(six);
		cp.add(multiply);
		cp.add(one);
		cp.add(two);
		cp.add(three);
		cp.add(less);
		cp.add(zero);
		cp.add(point);
		cp.add(equal);
		cp.add(plus);
		
		//設定按鈕點擊事件
		one.addActionListener(btnaction);
		two.addActionListener(btnaction);
		three.addActionListener(btnaction);
		four.addActionListener(btnaction);
		five.addActionListener(btnaction);
		six.addActionListener(btnaction);
		seven.addActionListener(btnaction);
		eight.addActionListener(btnaction);
		nine.addActionListener(btnaction);
		zero.addActionListener(btnaction);
		point.addActionListener(btnaction);
		except.addActionListener(btnaction);
		multiply.addActionListener(btnaction);
		less.addActionListener(btnaction);
		plus.addActionListener(btnaction);
		equal.addActionListener(btnaction);
	}
	
	public ActionListener btnaction = new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton)e.getSource();//取得點擊按鈕資訊
			Compute.buttonclick(b.getText().toString());//將點擊按鈕的文字放入Compute類別內的buttonclick方法
		}};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new View();
	}

}
