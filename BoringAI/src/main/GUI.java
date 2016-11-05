package main;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUI {
	static TextArea textarea=new TextArea();
	
	static void genWin(){
		Frame frame=new Frame("CLI");
		frame.setSize(500, 570);
		frame.setLayout(null);
		
		Button button=new Button("PUSH!");
		button.setBounds(380,520,100,30);
		frame.add(button);
		
		textarea.setBounds(10,30,480,480);
		frame.add(textarea);
		
		TextField textfield=new TextField("command");
		textfield.setBounds(10, 520, 350, 30);
		frame.add(textfield);
		
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
		frame.setVisible(true);
	}
	
	
	public static void shellPrintln(String str){
		textarea.append("\n"+str);
	}
	
	public static void shellPrint(String str){
		textarea.append(str);
	}
}
