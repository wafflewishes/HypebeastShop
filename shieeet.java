/*Name: Jason
Date:
Purpose: Make a "Click Shop Program". In this program, outfits will be specially
made weekly by design artists, making the best outfit for a specific price point.
Items can be mixed and matched accordingly depending on the users budget.
*/

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;
public class shieeet {
//The following array will hold objects of all clothing items in this program.
	private JFrame frame;
	static public TileObject objectList[][] = new TileObject[4][4];
	static int count = 0;
	static int num;
	static Scanner input = new Scanner(System.in);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					shieeet window = new shieeet();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public shieeet() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 558, 655);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		setObjects();
		do 
		{
			System.out.println("Enter num of items");
			num = input.nextInt();
		}
		while(num < 1);
		TileObject cart[] = new TileObject[num];
		for (int i = 0; i < num; i++) {
			cart[i] = new TileObject();
		}
						
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (count < num)
				{
					cart[count] = objectList[0][0];
					count++;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You have exceeded your limit");  
				}
			}
		});
		button_2.setIcon(new ImageIcon("C:\\Users\\Pritpal\\Desktop\\Thrasher.jpg"));
		button_2.setBounds(80, 46, 100, 100);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (count < num)
				{
					cart[count] = objectList[2][0];
					count++;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You have exceeded your limit");  
				}
			}
		});
		button_3.setIcon(new ImageIcon("C:\\Users\\Pritpal\\Desktop\\cdg cardigan.jpg"));
		button_3.setBounds(80, 248, 100, 100);
		frame.getContentPane().add(button_3);
		
		JLabel label = new JLabel("$50");
		label.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label.setBounds(10, 68, 46, 45);
		frame.getContentPane().add(label);
		
		JLabel lblHoodies = new JLabel("Hoodies");
		lblHoodies.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblHoodies.setBounds(80, 11, 94, 31);
		frame.getContentPane().add(lblHoodies);
		
		JLabel lblTshirts = new JLabel("T-Shirts");
		lblTshirts.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTshirts.setBounds(190, 4, 94, 45);
		frame.getContentPane().add(lblTshirts);
		
		JLabel lblPants = new JLabel("Pants");
		lblPants.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPants.setBounds(308, 11, 66, 31);
		frame.getContentPane().add(lblPants);
		
		JLabel lblShoes = new JLabel("Shoes");
		lblShoes.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblShoes.setBounds(416, 8, 66, 36);
		frame.getContentPane().add(lblShoes);
		
		JLabel label_1 = new JLabel("$100");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_1.setBounds(10, 169, 58, 45);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("$200");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_2.setBounds(10, 277, 58, 31);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("$500");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_3.setBounds(10, 383, 58, 22);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("$1000");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_4.setBounds(10, 485, 78, 22);
		frame.getContentPane().add(label_4);
		
		JButton button_4 = new JButton("");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (count < num)
				{
					cart[count] = objectList[1][0];
					count++;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You have exceeded your limit");  
				}
			}
		});
		button_4.setIcon(new ImageIcon("C:\\Users\\Pritpal\\Desktop\\Tommy Sweater.jpg"));
		button_4.setBounds(80, 147, 100, 100);
		frame.getContentPane().add(button_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(70, 436, 46, 14);
		frame.getContentPane().add(label_5);
		
		JButton button_5 = new JButton("");
		button_5.setIcon(new ImageIcon("C:\\Users\\Pritpal\\Desktop\\bogo.jpg"));
		button_5.setBounds(80, 452, 100, 100);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (count < num)
				{
					cart[count] = objectList[3][0];
					count++;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You have exceeded your limit");  
				}
			}
		});
		button_6.setIcon(new ImageIcon("C:\\Users\\Pritpal\\Desktop\\Bape.jpg"));
		button_6.setBounds(80, 350, 100, 100);
		frame.getContentPane().add(button_6);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (count < num)
				{
					cart[count] = objectList[0][1];
					count++;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You have exceeded your limit");  
				}
			}
		});
		button.setIcon(new ImageIcon("C:\\Users\\Pritpal\\Desktop\\white tee.jpg"));
		button.setBounds(184, 46, 100, 100);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (count < num)
				{
					cart[count] = objectList[1][1];
					count++;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You have exceeded your limit");  
				}
			}
		});
		button_1.setIcon(new ImageIcon("C:\\Users\\Pritpal\\Desktop\\Ralph Lauren.jpg"));
		button_1.setBounds(184, 147, 100, 100);
		frame.getContentPane().add(button_1);
		
		JButton button_7 = new JButton("");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (count < num)
				{
					cart[count] = objectList[2][1];
					count++;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You have exceeded your limit");  
				}
			}
		});
		button_7.setIcon(new ImageIcon("C:\\Users\\Pritpal\\Desktop\\Palace Tee.jpg"));
		button_7.setBounds(184, 248, 100, 100);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (count < num)
				{
					cart[count] = objectList[3][1];
					count++;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You have exceeded your limit");  
				}
			}
		});
		button_8.setIcon(new ImageIcon("C:\\Users\\Pritpal\\Desktop\\bogo tee.jpg"));
		button_8.setBounds(184, 350, 100, 100);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("");
		button_9.setIcon(new ImageIcon("C:\\Users\\Pritpal\\Desktop\\Gucci Tee.jpg"));
		button_9.setBounds(184, 452, 100, 100);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (count < num)
				{
					cart[count] = objectList[0][2];
					count++;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You have exceeded your limit");  
				}
			}
		});
		button_10.setIcon(new ImageIcon("C:\\Users\\Pritpal\\Desktop\\Black Jeas.jpg"));
		button_10.setBounds(288, 46, 100, 100);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (count < num)
				{
					cart[count] = objectList[1][2];
					count++;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You have exceeded your limit");  
				}
			}
		});
		button_11.setIcon(new ImageIcon("C:\\Users\\Pritpal\\Desktop\\Kappa Track Pants.png"));
		button_11.setBounds(288, 147, 100, 100);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (count < num)
				{
					cart[count] = objectList[2][2];
					count++;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You have exceeded your limit");  
				}
			}
		});
		button_12.setIcon(new ImageIcon("C:\\Users\\Pritpal\\Desktop\\Biker Jeans.jpg"));
		button_12.setBounds(288, 248, 100, 100);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (count < num)
				{
					cart[count] = objectList[3][2];
					count++;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You have exceeded your limit");  
				}
			}
		});
		button_13.setIcon(new ImageIcon("C:\\Users\\Pritpal\\Desktop\\Distressed Jeans.jpg"));
		button_13.setBounds(288, 350, 100, 100);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("");
		button_14.setIcon(new ImageIcon("C:\\Users\\Pritpal\\Desktop\\Jeans.jpg"));
		button_14.setBounds(288, 452, 100, 100);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (count < num)
				{
					cart[count] = objectList[0][3];
					count++;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You have exceeded your limit");  
				}
			}
		});
		button_15.setIcon(new ImageIcon("C:\\Users\\Pritpal\\Desktop\\Light-up Yeezy.jpg"));
		button_15.setBounds(394, 46, 100, 100);
		frame.getContentPane().add(button_15);
		
		JButton button_16 = new JButton("");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (count < num)
				{
					cart[count] = objectList[1][3];
					count++;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You have exceeded your limit");  
				}
			}
		});
		button_16.setIcon(new ImageIcon("C:\\Users\\Pritpal\\Desktop\\Vans.jpg"));
		button_16.setBounds(394, 147, 100, 100);
		frame.getContentPane().add(button_16);
		
		JButton button_17 = new JButton("");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (count < num)
				{
					cart[count] = objectList[2][3];
					count++;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You have exceeded your limit");  
				}
			}
		});
		button_17.setIcon(new ImageIcon("C:\\Users\\Pritpal\\Desktop\\Boost.jpg"));
		button_17.setBounds(394, 248, 100, 100);
		frame.getContentPane().add(button_17);
		
		JButton button_18 = new JButton("");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (count < num)
				{
					cart[count] = objectList[3][3];
					count++;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You have exceeded your limit");  
				}
			}
		});
		button_18.setIcon(new ImageIcon("C:\\Users\\Pritpal\\Desktop\\yzy.jpg"));
		button_18.setBounds(394, 350, 100, 100);
		frame.getContentPane().add(button_18);
		
		JButton button_19 = new JButton("");
		button_19.setIcon(new ImageIcon("C:\\Users\\Pritpal\\Desktop\\aj1.jpg"));
		button_19.setBounds(394, 452, 100, 100);
		frame.getContentPane().add(button_19);
		
		JButton btnNewButton = new JButton("Proceed to Checkout");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printList(cart);
			}
		});
		btnNewButton.setBounds(10, 563, 484, 42);
		frame.getContentPane().add(btnNewButton);
	}

	public void setObjects() {
		for(int row = 0; row < 4; row++)
		{
			for(int col = 0; col < 4; col++)
			{
				objectList[row][col] = new TileObject();
				if (row == 0)
				{
					objectList[row][col].setPrice(50); 
				}
				else if (row == 1)
				{
					objectList[row][col].setPrice(100);
				}
				else if (row == 2)
				{
					objectList[row][col].setPrice(500); 
				}
				else 
				{
					objectList[row][col].setPrice(1000);
				}
				
				if (col == 0)
				{
					objectList[row][col].setName("Hoodies");
				}
				else if (col == 1)
				{
					objectList[row][col].setName("T-Shirt");
				}
				else if (col == 2)
				{
					objectList[row][col].setName("Pants");
				}
				else
				{
					objectList[row][col].setName("Shoes");
				}	
			}
		}	
	}
	
	public void printList(TileObject cart[]) {
		double total = 0;
		System.out.println("Name\t\tPrice");
		for (int i = 0; i < num; i++)
		{
			total += cart[i].getPrice();
			System.out.println(cart[i].getName()+"\t\t"+cart[i].getPrice());
		}
		System.out.println();
		System.out.println("Total: "+total);
	}
}
