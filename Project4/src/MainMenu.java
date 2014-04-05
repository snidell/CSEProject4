import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;


public class MainMenu extends JPanel{
	Enterprise myEnt = new Enterprise("");
 
	MainMenu(Enterprise ent){
		this.myEnt=ent; 
		setLayout(new BorderLayout());

		
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		    }catch (ClassNotFoundException | InstantiationException
					| IllegalAccessException | UnsupportedLookAndFeelException e) {
			  System.out.println("Look and feel not found");
			  e.printStackTrace();
			}
		UIManager.put("TabbedPane.selected", Color.green);

		JTabbedPane tabbedPane = new JTabbedPane();
		
		tabbedPane.addTab("Main", this.createMainPane("Main"));//Create main tab
		tabbedPane.addTab("Customers", this.createCustomersPane("Customers"));//Create Customer tab
		tabbedPane.addTab("Employees", this.createEmployeePane("Employees"));//Create Emp Tab
		tabbedPane.addTab("Items", this.createItemsPane("Items"));//Creat items tab
		tabbedPane.setSelectedIndex(0);//set the first view pane to main
		
		add(tabbedPane, BorderLayout.CENTER);
		
		
	}
	/*
	 * Creates unique panel for the Main page
	 * @param String name of panel
	 * @return panel that was created
	 * 
	 * 
	 */
	public JPanel createMainPane(String s) {
	    JPanel p = new JPanel(new BorderLayout());
	    JPanel p1= new JPanel(new BorderLayout());
	    p1.setBorder(new EmptyBorder(250,20,250,20));
	    p.add(p1,BorderLayout.WEST);
	    p.add(new JLabel(s),BorderLayout.CENTER);
	    String[] values = {"WHEEEEEEEEEE", "Value2", "Value3", "Value4","Value5","Value 6",
	    		"Value 7","Value 8","Value9","Value 10", "Value 11"};
	    
	    JList mainList= new JList(values);
	    JScrollPane mainScroll= new JScrollPane(mainList);
	    GridBagConstraints gbc= new GridBagConstraints();
	    p1.add(mainScroll, BorderLayout.CENTER);
	    
	    return p;
	  }
	/*
	 * Creates unique panel for Employees in enterprise
	 * @param String name of panel
	 * @return panel that was created	 * 
	 * 
	 */
	public JPanel createEmployeePane(String s) {
	    JPanel p = new JPanel(new GridBagLayout());
	    p.add(new JLabel(s));
	    
	    return p;
	  }
	/*
	 * Creates unique panel for Items in Enterprise
	 * @param String name of panel
	 * @return panel that was created
	 * 
	 * 
	 */
	public JPanel createItemsPane(String s) {
	    JPanel p = new JPanel(new GridBagLayout());
	    p.add(new JLabel(s));
	    
	    return p;
	  }
	
	/*
	 * Creates unique panel for Customers in enterprise
	 * @param String name of panel
	 * @return panel that was created
	 * 
	 * 
	 */
	public JPanel createCustomersPane(String s) {
	    JPanel p = new JPanel(new GridBagLayout());
	    p.add(new JLabel(s));
	    p.add(new JButton("Hey"));
	    
	    return p;
	  }
	/*
	 * 
	 * Creates the frame that is populated with this class
	 * and makes it visible
	 * 
	 */
	public void load(){
		
		JFrame frame = new JFrame(this.myEnt.getName());
	    frame.addWindowListener(new WindowAdapter() {
	      public void windowClosing(WindowEvent e) {
	        System.exit(0);
	      }
	    });
	    frame.getContentPane().add(this);
	    frame.setSize(600, 700);
	    frame.setVisible(true);
	}
	
	
	
	public static void main(String []args){
		
		Enterprise myEnt= new Enterprise("Dookie and the Crew");
		MainMenu myMenu= new MainMenu(myEnt);
	    myMenu.load();
		
	
	}
}
