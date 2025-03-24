/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Aluno
 */
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax. swing.JLabel;
import javax. swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class LabelFrame2 extends JFrame{
    
    private JLabel label3;

    public LabelFrame2(){
        super("Testing JLabel");
        setLayout(new FlowLayout());
    
        
        Icon bug = new ImageIcon(getClass().getResource("bug2.png"));
        label3 = new JLabel();
        label3.setText(" INSTITUTO FEDERAL DE EDUCACAO, CIENCIA E TECNOLOGIA DE MATO GROSSO ");
        label3.setIcon(bug);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("IFMT (logo)");
        add(label3);
    }
}
 