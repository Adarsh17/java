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
l2=new Label();
t=new TextArea();
b=new Button("Click");
l1.setBounds(20,20,50,50)
l2.setBounds(100,20,50,50);
t.setBounds();
b.setBounds(100,200,50,50);
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
}
public static void main(String args[])
{
TextArea t=new TextArea();
}
}