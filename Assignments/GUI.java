import java.awt.*; //required for GUI
import javax.swing.*; //swing is for GUI

class Folder4 {
    //--Class Instance Variable Declaration Encapsulated--

    private static double [] marks; // array to hold numbers for calculations
    private static JTextField[] marksField; //textbox to input numbers

    //---Class Constructor to Initialize Instance Variables
    Folder4(){ // creates the variables on the HEAP
    marks = new double [3];

    marksField = new JTextField[3];
    marksField [0] = new JTextField (10);
    marksField [1] = new JTextField (10);
    marksField [2] = new JTextField (10);
    } //end of first constructor

//---Getters and Setters
//---Class Instance methods
private static JPanel getPanel(){
    JPanel basePanel = new JPanel();
    basePanel.setOpaque(true);
    basePanel.setBackground(Color.PINK.darker());

    JPanel centerPanel = new JPanel();
    centerPanel.setLayout(new GridLayout(3,2,5,5));
    centerPanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
    centerPanel.setOpaque(true);
    centerPanel.setBackground(Color.WHITE);
    centerPanel.setBackground(Color.WHITE);

    JLabel mLabel1 = new JLabel ("Enter Marks 1:");
    JLabel mLabel2 = new JLabel ("Enter Marks 2:");
    JLabel mLabel3 = new JLabel ("Enter Marks 3:");

    centerPanel.add(mLabel1);
    centerPanel.add(marksField[0]);
    centerPanel.add(mLabel2);
    centerPanel.add(marksField[1]);
    centerPanel.add(mLabel3);
    centerPanel.add(marksField[2]);

    basePanel.add(centerPanel);

    return basePanel;
}

private void displayGUI() {
int selection = JOptionPane.showConfirmDialog(null, getPanel(), "InputForm :",
JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

if (selection == JOptionPane.OK_OPTION){
for (int i=0; i<3; i++) {
    marks[i]=Double.valueOf(marksField[i].getText());
}
double average = (marks[0]+marks[1]+marks[2])/3.0;
JOptionPane.showMessageDialog(null, "Average is: "+Double.toString(average), "Average: ", JOptionPane.PLAIN_MESSAGE);
} else if (selection == JOptionPane.CANCEL_OPTION){
    System.out.println("Good Bye");
}
}

public static void main(String[] arg){
    SwingUtilities.invokeLater(
        new Runnable(){
            public void run() {
                new Folder4().displayGUI();
            }
        });         
}
}

