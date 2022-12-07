import javax.swing.*;
import java.awt.*;

import java.awt.event.*;

class JMenuDemo extends JFrame implements ActionListener {

JMenuBar mb;
JMenu draw;

JMenuItem rect,line,oval;

JMenuDemo()
{
setLayout(null);
mb=new JMenuBar();

draw=new JMenu("draw");
draw.setMnemonic('d');
mb.add(draw);

rect=new JMenuItem("rect");
rect.addActionListener(this);

rect.setMnemonic('r');
draw.add(rect);

line=new JMenuItem("line");
line.addActionListener(this);
line.setMnemonic('l');

draw.add(line);

oval=new JMenuItem("oval");
oval.addActionListener(this);
oval.setMnemonic('o');
draw.add(oval);

setJMenuBar(mb);
}

public void actionPerformed(ActionEvent ae)
 
{
String str=ae.getActionCommand();
Graphics g=getGraphics();

if(str=="rect")
g.drawRect(100,100,50,50);

if(str=="line")
g.drawLine(300,50,400,350);

if(str=="oval")
g.drawOval(400,50,50,50);
}

public static void main(String args[])
{
JMenuDemo f=new JMenuDemo();

f.setTitle("my frame");
f.setSize(500,500);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
