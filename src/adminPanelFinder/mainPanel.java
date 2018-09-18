/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminPanelFinder;

import static burp.BurpExtender.output;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author "Moein Fatehi moein.fatehi@gmail.com"
 */
public class mainPanel extends JPanel
{
    
    static AdminPanelFinder adminPanelFinder_panel;
    
    static int adminPanelFinder_index=0;
    static int help_index=1;
    
    public static JTabbedPane firstLevelTabs;
    private JPanel mainPanel;
    private JPanel helpPanel;
    
    
    

    public mainPanel()
    {
        mainPanel = new JPanel(); //Creating the mainPanel JPanel
        adminPanelFinder_panel=new AdminPanelFinder();
        helpPanel=new HelpPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS)); //Setting Box layout, and set the direction to Y axis.
        firstLevelTabs = new JTabbedPane(); //Creating the additionalPanel JPanel     
        firstLevelTabs.add(adminPanelFinder_panel,"Admin Panel Finder");
        firstLevelTabs.add(helpPanel,"Help");
        firstLevelTabs.setSelectedIndex(0);
        mainPanel.add(firstLevelTabs); //Adding panel2 into mainPanel
        this.setLayout(new GridLayout(1,1));
        this.add(mainPanel); //Setting mainPanel into JFrame
        this.setVisible(true); //Making JFrame Visible
    }
    static void resetadminPanelFinder_panel() {
        adminPanelFinder_panel=new AdminPanelFinder();
        firstLevelTabs.remove(adminPanelFinder_index);
        firstLevelTabs.add(adminPanelFinder_panel,"Finder",adminPanelFinder_index);
    }

}
