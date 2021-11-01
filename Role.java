import javax.swing.*;

public class Role extends JLabel {
    ImageIcon icon;


    Role(String path,int x,int y,int width,int height){
        icon=new ImageIcon(path);
        this.setIcon(icon);
        this.setBounds(x,y,width,height);
        this.setVisible(true);
    }
    
}
