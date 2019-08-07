import java.awt.*;
import java.awt.event.*;
class TextAreaEvent extends Frame implements ActionListener
{
Label l1,l2;
TextArea t;
Button b;
TextAreaEvent()
{
l1=new Label();
l1.setBounds(50,50,100,30);
l2=new Label();
l2.setBounds(160,50,100,30);
t=new TextArea();
t.setBounds(20,100,300,300);
b=new Button("Click");
b.setBounds(100,400,100,30);
b.addActionListener(this);
add(l1);
add(l2);
add(t);
add(b);
setSize(400,400);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{

String s=t.getText();
String words[]=s.split("\\s");
l1.setText("words :" + words.length);
l2.setText("Characters:" + s.length());
}
public static void main(String args[])
{
TextArea t=new TextArea();
}
}
