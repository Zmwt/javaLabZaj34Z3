package proj1;
import proj1.Pokoj;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dl, sz, wys;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("podaj dlugosc : ");
		dl = scanner.nextInt();
		System.out.println("podaj szerokosc : ");
		sz = scanner.nextInt();
		System.out.println("podaj wysokosc : ");
		wys = scanner.nextInt();
		
		scanner.close();
		
		Pokoj salon = new Pokoj(dl, sz, wys);
		
		System.out.println("pokoj");
		System.out.println("objetosc : " + salon.objetosc());
		System.out.println("powierzchnia podlogi : " + salon.pow_podlogi());
		System.out.println("powierzchnia scian : " + salon.pow_scian());
		System.out.println("koszt malowania : " + salon.koszt_malowania());
		System.out.println("koszt malowania podlogi : " + salon.koszt_malowania_podlogi());
		System.out.println("");
		
		
		try {
			PrintWriter pw = new PrintWriter("plik.txt");
			pw.println("objetosc : " + salon.objetosc());
			pw.println("powierzchnia podlogi : " + salon.pow_podlogi());
			pw.println("powierzchnia scian : " + salon.pow_scian());
			pw.println("koszt malowania : " + salon.koszt_malowania());
			pw.println("koszt malowania podlogi : " + salon.koszt_malowania_podlogi());
			
			pw.close();
		} catch (FileNotFoundException e) {
			System.out.println("nie znaleziono pliku");
			
			e.printStackTrace();
		}
		catch (SecurityException e) {
			System.out.println("brak dostepu do pliku");
			
			e.printStackTrace();
		}
		
	}

}
