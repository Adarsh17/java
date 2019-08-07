import java.awt.*;
import java.awt.event.*;
class TfEvent extends Frame implements ActionListener
{
TextField t1,t2,t3;
Button b1,b2,b3,b4,b5;
TfEvent()
{
t1=new TextField();
t2=new TextField();
t3=new TextField();
b1=new Button("+");
b2=new Button("-");
b3=new Button("*");
b4=new Button("/");
b5=new Button("%");
t1.setBounds(50,50,100,50);
t2.setBounds(50,120,100,50);
t3.setBounds(50,190,100,50);
t3.setEditable(false);
b1.setBounds(200,200,40,40);
b2.setBounds(240,200,40,40);
b3.setBounds(280,200,40,40);
b4.setBounds(320,200,40,40);
b5.setBounds(360,200,40,40);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
add(t1);
add(t2);
add(t3);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
setSize(400,400);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
String a=t1.getText();
String b=t2.getText();
int num1=Integer.parseInt(a);
int num2=Integer.parseInt(b);
int result=0;
if(e.getSource()==b1)
{
result=num1+num2;
}

if(e.getSource()==b2)
{
result=num1-num2;
}

if(e.getSource()==b3)
{
result=num1*num2;
}

if(e.getSource()==b4)
{
result=num1/num2;
}

if(e.getSource()==b5)
{
result=num1%num2;
}


String answer=String.valueOf(result);
t3.setText(answer);
}
public static void main(String args[])
{
TfEvent t=new TfEvent();
}
}
