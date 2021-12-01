package task8.laba_5_3;


import java.awt.*;
import java.awt.event.*;
class Animation extends Frame
{
    private Image[] img=new Image[10];
    private int count;
    Animation (String s)
    {
        super(s);
        MediaTracker tr=new MediaTracker(this);
        for (int k=0; k<3; k++)
        {
            img[k]=getToolkit().getImage("C:\\Users\\nekit\\Desktop\\task8\\laba_5_3\\pic_"+(k+1)+".jpg");
            tr.addImage(img[k],0);
        }
        try
        {
            tr.waitForAll();
        }
        catch (InterruptedException e){}
        setSize(400, 400);
        setVisible(true);
    }
    public void paint(Graphics g)  //рисование через объект Graphics.
    {
        g.drawImage(img[count%3], 0, 0, this); 
        // % число = кол картинок
    }
    public void update(Graphics g) {paint(g); }
    public void go()
    {
        while(count<100)
        {
            repaint(); //используется для вызова paint() для потока рисования AWT.
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e){}
            count+=1;
        }
    }
}
