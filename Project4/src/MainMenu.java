import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.UIManager.*;


public class MainMenu extends JFrame implements Proj3Constants,DateConstants,ActionListener {
	Enterprise myEnt = new Enterprise("");
	String myString = new String();
	JLabel lockedLabel= new JLabel("");
	String code = new String();
	String [] empNames={"Bill","John","Cathy","Hernando","Da Vinci","Riario","Amerigo"}; 
    JList employeeList= new JList(empNames);
    JList employeeList1=new JList(empNames);
    JScrollPane empScroll= new JScrollPane(employeeList);
    JTextArea empTA;
    JComboBox yearCombo;
    
 
	MainMenu(Enterprise ent){
		this.myEnt=ent; 
		
		this.loadMainWindow();
		//this.loadEmployeeWindow();
		
		
	}
	
	public void loadMainWindow(){
		JFrame myFrame = new JFrame();    
	    myFrame.setTitle("Mav Bay Auctionhouse");
	    myFrame.setSize(600,600);//making the size of the window
	    myFrame.setLocation(300,300);//window placed at 100 pixel x 100 pixel
	    myFrame.setVisible(true);//make the window visable
	    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       
	    JPanel panel1 = new JPanel();
	    panel1.setLayout(new GridBagLayout());//creating a grid layout for panel one
	    panel1.setBackground(Color.BLUE);
	    GridBagConstraints c = new GridBagConstraints();//Constraints for products being added
	    
	    
	    
	    
	    
	    JPanel panel2 = new JPanel();//panel for "Locked" label
	    panel2.setBackground(Color.BLACK);
	    
	    JPanel panel3 = new JPanel();//panel for "Start" and "Okay" buttons
	    panel3.setBackground(Color.RED);
	    
	    
	    //Adding Pad top left
	    JPanel panel4=new JPanel(); //Top Left Pad
	    panel4.setBackground(Color.GREEN);
	    c.fill=GridBagConstraints.HORIZONTAL;
	    c.gridx=0;
	    c.gridy=0;
	    c.gridwidth = 1;	    
	    c.ipady=350;
	    c.ipadx=100;
	    panel1.add(panel4,c);
	    
	    JLabel empL= new JLabel("Select Year");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.ipady = 10;      //make this component tall
	    c.ipadx= 50;
	    c.gridwidth = 1;  
	    c.gridx = 0;
	    c.gridy = 1;	    
	    panel1.add(empL,c);
	    
	    
	    String [] years={"All","2014","2013","2012","2011","2010"};
	    final JComboBox yearCombo= new JComboBox(years);
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.ipady = 20;      //make this component tall
	    c.ipadx= 50;
	    c.gridwidth = 1;  
	    c.gridx = 0;
	    c.gridy = 2;
	    panel1.add(yearCombo, c);
	    
	    
	    JButton button;
	    button = new JButton("Get Revenue");
	    button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String myString= (String)yearCombo.getSelectedItem();
                System.out.println("String! "+myString);
                empTA.append("MyString!"+myString);
            }
        });
	    button.setBackground(new Color(47,92,180));
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.ipady = 20;      //make this component tall
	    c.ipadx= 50;
	    c.weightx = 0.0;
	    c.gridwidth = 1;
	    c.gridheight= 1;	    		 
	    c.gridx = 0;
	    c.gridy = 3;
	    
	    panel1.add(button, c);
	    
	    /*
	    JLabel empL1= new JLabel("Currently Employed Employees");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.ipady = 10;      //make this component tall
	    c.ipadx= 50;
	    c.gridwidth = 1;  
	    c.gridx = 0;
	    c.gridy = 4;
	    
	    panel1.add(empL1,c);
	    
	    
	    //Adding ScrolPane	    
	    String [] empNames1={"John Snow","Bill","John","Cathy","Hernando","Da Vinci","Riario","Amerigo"};
	    employeeList= new JList(myEnt.empList(myEnt.getEmployees()));
	    //employeeList= new JList(empNames);
	    employeeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    empScroll= new JScrollPane(employeeList);	    
	    
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.ipady = 80;      //make this component tall
	    c.ipadx= 50;
	    c.gridwidth = 1;  
	    c.gridx = 0;
	    c.gridy = 5;
	    panel1.add(empScroll, c);
	    
	    
	    JButton button1;
	    button1 = new JButton("Get Employee Details");
	    button1.setBackground(new Color(47,92,180));
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.ipady = 20;      //make this component tall
	    c.ipadx= 50;
	    c.weightx = 0.0;
	    c.gridwidth = 1;
	    c.gridheight= 1;	    		 
	    c.gridx = 0;
	    c.gridy = 6;
	    button1.addActionListener(this);
	    panel1.add(button1, c);*/
	     
	    JPanel panel6=new JPanel();//Bottom left panel
		panel6.setBackground(Color.RED);
		c.fill=GridBagConstraints.HORIZONTAL;
		c.gridx=0;
		c.gridy=7;
		c.gridwidth = 1;
		c.ipady=350;
		c.ipadx=100;
		//button=new JButton("Get Oldest Associate");
		//button.addActionListener(this);
		//panel6.add(button);
	    panel1.add(panel6,c);    
	    
	    empTA= new JTextArea();
	    empTA.setEditable(false);
	    c.fill=GridBagConstraints.HORIZONTAL;
		c.gridx=1;
		c.gridy=0;
		c.gridwidth = 5;
		c.ipady=500;
		c.ipadx=1;
		c.gridwidth = 1;
		c.gridheight=8;
		panel1.add(empTA,c);
	     
		JButton b9 = new JButton("9");
	    b9.setForeground(Color.YELLOW);
	    b9.setBackground(Color.BLACK);
	    b9.setActionCommand("9");
	    b9.addActionListener(this);
	    c.fill=GridBagConstraints.HORIZONTAL;
	    c.gridx=1;
		c.gridy=0;
		c.gridwidth = 1;
		c.gridheight=5;
		c.ipady=500;
		c.ipadx=340;
	    panel1.add(b9,c);
	     	     
	    JButton buttonStart = new JButton("Main");
	    buttonStart = new JButton("Main");
	    buttonStart.setForeground(Color.BLACK);
	    buttonStart.setBackground(new Color(0,128,0));
	    buttonStart.setActionCommand("Main");
        buttonStart.addActionListener(this);
	    panel3.add(buttonStart);
	     
	    JButton buttonOkay=new JButton("Employee");
	    buttonOkay.setForeground(Color.BLACK);
	    buttonOkay.setBackground(Color.GRAY);
	    buttonOkay.setActionCommand("Employee");
	    buttonOkay.addActionListener(this);
	    panel3.add(buttonOkay);
	     
	    JButton customerButton = new JButton("Customers");
	    customerButton = new JButton("Customers");
	    customerButton.setForeground(Color.BLACK);
	    customerButton.setBackground(Color.GRAY);
	    customerButton.setActionCommand("START");
	    customerButton.addActionListener(this);
	    panel3.add(customerButton);
	     
	    JButton itemButton = new JButton("Item");
	    customerButton = new JButton("Item");
	    customerButton.setForeground(Color.BLACK);
	    customerButton.setBackground(Color.GRAY);
	    customerButton.setActionCommand("START");
	    customerButton.addActionListener(this);
	    panel3.add(customerButton);
	     
	    myFrame.add(panel1,BorderLayout.CENTER);//add first panel to the screen
	     
	    lockedLabel = new JLabel("Main Menu");
	     
	    lockedLabel.setForeground(Color.RED);
	    lockedLabel.setBackground(Color.BLACK);
	    panel2.add(lockedLabel);
	    myFrame.add(panel2,BorderLayout.NORTH);//add second panel to the screen
	    myFrame.add(panel3,BorderLayout.SOUTH);
	}
	
	/**
	 * 
	 * 
	 * loads mainWindow
	 * 
	 * 
	 */
	public void loadEmployeeWindow(){
		
		JFrame myFrame = new JFrame();    
	    myFrame.setTitle("Mav Bay Auctionhouse");
	    myFrame.setSize(600,600);//making the size of the window
	    myFrame.setLocation(300,300);//window placed at 100 pixel x 100 pixel
	    myFrame.setVisible(true);//make the window visable
	    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       
	    JPanel panel1 = new JPanel();
	    panel1.setLayout(new GridBagLayout());//creating a grid layout for panel one
	    panel1.setBackground(Color.BLUE);
	    GridBagConstraints c = new GridBagConstraints();//Constraints for products being added
	    
	    
	    
	    
	    
	    JPanel panel2 = new JPanel();//panel for "Locked" label
	    panel2.setBackground(Color.BLACK);
	    
	    JPanel panel3 = new JPanel();//panel for "Start" and "Okay" buttons
	    panel3.setBackground(Color.RED);
	    
	    
	    //Adding Pad top left
	    JPanel panel4=new JPanel(); //Top Left Pad
	    panel4.setBackground(Color.GREEN);
	    c.fill=GridBagConstraints.HORIZONTAL;
	    c.gridx=0;
	    c.gridy=0;
	    c.gridwidth = 1;	    
	    c.ipady=350;
	    c.ipadx=100;
	    panel1.add(panel4,c);
	    
	    JLabel empL= new JLabel("Released Employees");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.ipady = 10;      //make this component tall
	    c.ipadx= 50;
	    c.gridwidth = 1;  
	    c.gridx = 0;
	    c.gridy = 1;	    
	    panel1.add(empL,c);
	    
	    
	    //Adding ScrolPane	    
	    String [] empNames={"John Snow","Bill","John","Cathy","Hernando","Da Vinci","Riario","Amerigo"};
	    employeeList1= new JList(myEnt.empList(myEnt.getPastEmployees()));
	    //employeeList= new JList(empNames);
	    employeeList1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    empScroll= new JScrollPane(employeeList1);	    
	    
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.ipady = 80;      //make this component tall
	    c.ipadx= 50;
	    c.gridwidth = 1;  
	    c.gridx = 0;
	    c.gridy = 2;
	    panel1.add(empScroll, c);
	    
	    JButton button;
	    button = new JButton("Released");
	    button.setBackground(new Color(47,92,180));
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.ipady = 20;      //make this component tall
	    c.ipadx= 50;
	    c.weightx = 0.0;
	    c.gridwidth = 1;
	    c.gridheight= 1;	    		 
	    c.gridx = 0;
	    c.gridy = 3;
	    button.addActionListener(this);
	    panel1.add(button, c);
	    
	    /*-------------------------*/
	    JLabel empL1= new JLabel("Currently Employed Employees");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.ipady = 10;      //make this component tall
	    c.ipadx= 50;
	    c.gridwidth = 1;  
	    c.gridx = 0;
	    c.gridy = 4;
	    
	    panel1.add(empL1,c);
	    
	    
	    //Adding ScrolPane	    
	    String [] empNames1={"John Snow","Bill","John","Cathy","Hernando","Da Vinci","Riario","Amerigo"};
	    employeeList= new JList(myEnt.empList(myEnt.getEmployees()));
	    //employeeList= new JList(empNames);
	    employeeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    empScroll= new JScrollPane(employeeList);	    
	    
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.ipady = 80;      //make this component tall
	    c.ipadx= 50;
	    c.gridwidth = 1;  
	    c.gridx = 0;
	    c.gridy = 5;
	    panel1.add(empScroll, c);
	    
	    
	    JButton button1;
	    button1 = new JButton("Get Employee Details");
	    button1.setBackground(new Color(47,92,180));
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.ipady = 20;      //make this component tall
	    c.ipadx= 50;
	    c.weightx = 0.0;
	    c.gridwidth = 1;
	    c.gridheight= 1;	    		 
	    c.gridx = 0;
	    c.gridy = 6;
	    button1.addActionListener(this);
	    panel1.add(button1, c);
	     
	    JPanel panel6=new JPanel();//Bottom left panel
		panel6.setBackground(Color.RED);
		c.fill=GridBagConstraints.HORIZONTAL;
		c.gridx=0;
		c.gridy=7;
		c.gridwidth = 1;
		c.ipady=350;
		c.ipadx=100;
		button=new JButton("Get Oldest Associate");
		button.addActionListener(this);
		panel6.add(button);
	    panel1.add(panel6,c);    
	    
	    empTA= new JTextArea();
	    empTA.setEditable(false);
	    c.fill=GridBagConstraints.HORIZONTAL;
		c.gridx=1;
		c.gridy=0;
		c.gridwidth = 5;
		c.ipady=500;
		c.ipadx=1;
		c.gridwidth = 1;
		c.gridheight=8;
		panel1.add(empTA,c);
	     
		JButton b9 = new JButton("9");
	    b9.setForeground(Color.YELLOW);
	    b9.setBackground(Color.BLACK);
	    b9.setActionCommand("9");
	    b9.addActionListener(this);
	    c.fill=GridBagConstraints.HORIZONTAL;
	    c.gridx=1;
		c.gridy=0;
		c.gridwidth = 1;
		c.gridheight=5;
		c.ipady=500;
		c.ipadx=340;
	    panel1.add(b9,c);
	     	     
	    JButton buttonStart = new JButton("Main");
	    buttonStart = new JButton("Main");
	    buttonStart.setForeground(Color.BLACK);
	    buttonStart.setBackground(Color.GRAY);
	    buttonStart.setActionCommand("Main");
        buttonStart.addActionListener(this);
	    panel3.add(buttonStart);
	     
	    JButton buttonOkay=new JButton("Employee");
	    buttonOkay.setForeground(Color.BLACK);
	    buttonOkay.setBackground(new Color(0,128,0));
	    buttonOkay.setActionCommand("Employee");
	    buttonOkay.addActionListener(this);
	    panel3.add(buttonOkay);
	     
	    JButton customerButton = new JButton("Customers");
	    customerButton = new JButton("Customers");
	    customerButton.setForeground(Color.BLACK);
	    customerButton.setBackground(Color.GRAY);
	    customerButton.setActionCommand("START");
	    customerButton.addActionListener(this);
	    panel3.add(customerButton);
	     
	    JButton itemButton = new JButton("Item");
	    customerButton = new JButton("Item");
	    customerButton.setForeground(Color.BLACK);
	    customerButton.setBackground(Color.GRAY);
	    customerButton.setActionCommand("START");
	    customerButton.addActionListener(this);
	    panel3.add(customerButton);
	     
	    myFrame.add(panel1,BorderLayout.CENTER);//add first panel to the screen
	     
	    lockedLabel = new JLabel("Employee Menu");
	     
	    lockedLabel.setForeground(Color.RED);
	    lockedLabel.setBackground(Color.BLACK);
	    panel2.add(lockedLabel);
	    myFrame.add(panel2,BorderLayout.NORTH);//add second panel to the screen
	    myFrame.add(panel3,BorderLayout.SOUTH);
	}
	
	public void actionPerformed(ActionEvent e) {
	    
	    String command = e.getActionCommand();
	    if(command.equals("Get Employee Details")){
	     int index=employeeList.getSelectedIndex();
	     System.out.println("Index Selected: "+index);
	     String s= (String)employeeList.getSelectedValue();
	     System.out.println("Value Selectied: "+s);
	     System.out.println(myEnt.sEmpInfo(index));
	     empTA.setText("");
	     empTA.append("------Employee Details-----\n");
	     empTA.append(myEnt.sEmpInfo(index));
	     
	    }
	    if(command.equals("Get Oldest Associate")){
	    	JFrame frame= new JFrame();
	    	frame.setSize(200,200);
	    	JOptionPane.showMessageDialog(null,myEnt.empLength());
	    }
	    
	    if(command.equals("Released")){
	    	System.out.println("Hey Dog");
	    	int index=employeeList1.getSelectedIndex();	
	    	
		    System.out.println("Index Selected: "+index);
		    String s= (String)employeeList1.getSelectedValue();
		    System.out.println("Value Selectied: "+s);
		    
		    System.out.println(myEnt.sRelEmpInfo(index));
		    empTA.setText("");
	        empTA.append("------Employee Details-----\n");
    	    empTA.append(myEnt.sEmpInfo(index));
	    }
	    
	    
	    
	    if(command.equals("Main")){	    	
	    	this.loadMainWindow();
	    }
	    
	  }//end of action performed
	
	
	public static void main(String []args){
		
		Enterprise myEnt= new Enterprise("Dookie and the Crew");
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
		    // If Nimbus is not available, fall back to cross-platform
		    try {
		        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		    } catch (Exception ex) {
		        // not worth my time
		    }
		}
		MainMenu myMenu= new MainMenu(myEnt);
	    
		
	
	}
}
