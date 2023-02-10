
import java.util.*;
public class InventorySystem {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
				System.out.println("The values to be entered in the way by giving space as it is command line arguments");
		HashMap<String,List> mp = new HashMap<>();

		for(int i = 0 ; i < n  ; i++ )
		{
			System.out.println("Enter productName,  Specification,  cost,  count : ");
			sc.nextLine();
			String line  = sc.nextLine();
			String[] arr = line.split(" ");
			ArrayList list = new ArrayList() ;
			String pname = arr[0];
			String pspec = arr[1];
			double cost = Double.parseDouble(arr[2]);
			int count = Integer.parseInt(arr[3]);
			list.add(pspec);
			list.add(cost);
			list.add(count);
			mp.put(pname, list);
			//list.clear();
		}
		boolean flag = true;
		while(flag)
		{
			System.out.println("	1.Product List  ");
			System.out.println("	2.Product count ");
			System.out.println("	3.Product details ");
			System.out.println("	4.Edit product details ");
			System.out.println("	5.Update Inventory ");
			System.out.println("	6.to quit");
			System.out.println("	Enter the option ");
			int option = sc.nextInt();
			if(option == 1)
			{
					productList(mp);
			}
			else if(option == 2) 
			{
				productcount(mp);
			}
			else if(option == 3) 
			{
				productdetails(mp);
			}
			else if(option == 4) 
			{
				editproduct(mp);
			}
			else if(option == 5) 
			{
				updateInventory(mp);
			}
			else if(option  == 6) 
			{
				flag = false;
			}
			else
			{
					System.out.println("enter the value from 1 to 6");
			}
			
		}
	}
	public static void productList(HashMap<String,List> mp) 
	{
		int i = 1;
		for(String st : mp.keySet()) {
			System.out.println(i + " "+st);
			i++;
		}
	}
	public static void updateInventory(HashMap<String,List> mp)
	{
	
	System.out.println("Enter 1 to add and enter 2 to delete");
		System.out.println("Enter your option");System.out.println();
		sc.nextLine();
		int n = sc.nextInt();
		if(n == 1) 
		{
			System.out.println("Enter productName,Specification,cost,count : ");
			sc.nextLine();
			String t = sc.nextLine();
			String []arr = t.split(" ");
			String name = arr[0];
			String spec = arr[1];
			double cost = Double.parseDouble(arr[2]);
			int count = Integer.parseInt(arr[3]);
			List list = new ArrayList();
			list.add(spec);
			list.add(cost);
			list.add(count);
			mp.put(name, list);
		}
		else 
		{
			System.out.println("Enter the delete product");
			String pname = sc.nextLine();
			if(mp.containsKey(pname)) 
			{
				mp.remove(pname);
				System.out.println("Product removed Successfully");
			}
			else
			{
				System.out.println("Product Not Found");
			}
		}
	}
	
	public static void productcount(HashMap<String,List> mp)
	{
		System.out.println("Enter product name");
		sc.nextLine();
		String pname = sc.nextLine();
		if(mp.containsKey(pname)) 
		{
			List temp = mp.get(pname);
			System.out.println("count of "+pname+" is "+temp.get(2));
		}
		else 
		{
			System.out.println("Product not found");
		}
	}
	public static void editproduct(Map<String,List> mp) 
	{
		System.out.println("Enter product name : ");
		sc.nextLine();
		String pname = sc.nextLine();
		if(mp.containsKey(pname))
		{
			System.out.println("what do you want to edit :\n1.Specification\n2.Cost\n3.Product count");
			int ch = sc.nextInt();
			if(ch == 1)
			{
				System.out.println("Enter product specification ");
				String st = sc.nextLine();
				List list = mp.get(pname);
				list.remove(0);
				list.add(0, st);
				mp.put(pname, list);
			}
			else if(ch == 2) 
			{
				System.out.println("Enter product cost ");
				double cost = sc.nextDouble();
				List list = mp.get(pname);
				list.remove(1);
				list.add(1, cost);
				mp.put(pname,list);
			}
			else
			{
				System.out.println("\nEnter product count ");
				int count = sc.nextInt();
				List list = mp.get(pname);
				list.remove(2);
				list.add(count);
				mp.put(pname,list);
			}
			return;
		}
		else
		{
			System.out.println("Product not found");
		}
	}
	public static void productdetails(HashMap<String,List> mp)
	{
		System.out.println("Enter product name");
		sc.nextLine();
		String pname = sc.nextLine();
		if(mp.containsKey(pname)) {
			System.out.println("Product Name : "+pname);
			System.out.println("Product Specification : "+mp.get(pname).get(0));
			System.out.println("Product Cost : "+mp.get(pname).get(1));
			System.out.println("Product count : "+mp.get(pname).get(2));
		}
		else
		{
			System.out.println("Product not found");
		}
	}
}
