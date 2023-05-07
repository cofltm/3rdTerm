package TimerCountdown;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;


public class JavaTimer extends Main {
    
    void Timer(){
        
        JFrame jframe = new JFrame();
        JLabel LabelTime = new JLabel();
        
        jframe.setLayout(new  FlowLayout());
        jframe.setBounds(500, 300, 400, 100);
        
        jframe.add(LabelTime);
        jframe.setVisible(true);
        
        JavaTimer lt = new JavaTimer();
        
        try{
            
            Timer timer = new Timer();
            timer.scheduleAtFixedRate(new TimerTask()
        {
            int i = 300;
            
            public void run()
            {
                int m = i / 60; //nidivide
                int s = i % 60; //remainder
                LabelTime.setText("Timer Countdown: " + m + ":" + s);
                i--;

                
                if (i < 0)
                {
                    timer.cancel();
                    LabelTime.setText("You are termeinated!, System Failure");
                }
            }
        }, 0, 1000);
    } catch (Exception e)
        {
            System.out.println("error");
        }

    }

}
