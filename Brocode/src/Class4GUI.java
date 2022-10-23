import javax.swing.JOptionPane;
public class Class4GUI {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter Your Name");
				JOptionPane.showMessageDialog(null ,"Hello "+name);
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age"));
		JOptionPane.showMessageDialog(null, "You are " + age + " years old");
		Double height = Double.parseDouble(JOptionPane.showInputDialog("How tall are you?"));
		JOptionPane.showMessageDialog(null, "You are "+height+" cm tall");
		
	}

}
