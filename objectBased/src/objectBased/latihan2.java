package objectBased;

import java.util.Scanner;

public class latihan2 
{
	public static void main(String[] args) 
	{
		String keinginanTodo;
		
		System.out.println("Selamat datang di Program Todo. Todo mau apa ?");
		Scanner scan = new Scanner(System.in);
		
		keinginanTodo = scan.next();
		if (keinginanTodo.equalsIgnoreCase("makan"))
		{
			System.out.println("Todo ingin " + keinginanTodo +"\n");
			Makan makanTodo = new Makan();
			
			System.out.print("Todo ingin makan dimana ?");
			makanTodo.setWarung(scan.next());
			System.out.print("Todo ingin makan apa ?");
			makanTodo.setMakanan(scan.next());
			System.out.print("Todo ingin makan sama apa ?");
			makanTodo.setLauk(scan.next());
			System.out.print("Todo ingin minum apa ?");
			makanTodo.setMinuman(scan.next());
			
			System.out.print("Todo ingin " + keinginanTodo);
			System.out.print(" di " + makanTodo.getWarung());
			System.out.print(" terus mau makan " + makanTodo.getMakanan());
			System.out.print(" sama " + makanTodo.getLauk());
			System.out.print(" dan minumnya " + makanTodo.getMinuman());
		}
		else if (keinginanTodo.equalsIgnoreCase("tidur"))
		{
			System.out.println("Todo ingin " + keinginanTodo);
			Tidur tidurTodo = new Tidur();
			
			System.out.print("Todo ingin tidur brp lama?");
			tidurTodo.setDurasi(scan.nextInt());
			System.out.print("Todo ingin tidur dimana?");
			tidurTodo.setLokasi(scan.next());
			System.out.print("Todo ingin tidur bagaimana?");
			tidurTodo.setPosisi(scan.next());
			
			System.out.println("Todo ingin " + keinginanTodo + " selama " + tidurTodo.getDurasi() + " di " + tidurTodo.getLokasi() + " secara " + tidurTodo.getPosisi());
		}
		scan.close();
	}

}
