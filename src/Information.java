import java.util.ArrayList;
import javax.swing.DefaultListModel;

abstract public class Information {
	public static int Entered = 0 , Pay = 0 , Selected = -1; 
	public static int Coins_Entered[] = {0 , 0 , 0 , 0}; // The Coins that the custumer Entered
	public static int Coins_In_Machine[] = {1 , 1 , 1 , 1}; // number of coins int the machine
	public static int Val[] = {1 , 2 , 5 , 10}; // just the values of the coins
	public static ArrayList<Water> A = new ArrayList<>();
	public static ArrayList<SoftDrinks> B = new ArrayList<>();
	public static ArrayList<KidsJuices> C = new ArrayList<>();
	public static MainWindow M = new MainWindow();
	public static RefillWindow R = new RefillWindow();
	public static UpdateWindow U = new UpdateWindow();
	public static PurchaseWindow P = new PurchaseWindow();
	public static EnterCoinsWindow E = new EnterCoinsWindow();
	public static DefaultListModel model1 = new DefaultListModel();
	public static DefaultListModel model2 = new DefaultListModel();
	public static DefaultListModel model3 = new DefaultListModel();
}
