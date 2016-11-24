package proj1;

public class Pokoj {
	public int dlugosc;
	public int szerokosc;
	public int wysokosc;
	
	public int koszt = 5; // za 1m2;
	
	public Pokoj(int dl, int sz, int wys)
	{
		dlugosc = dl;
		szerokosc = sz;
		wysokosc = wys;
	}
	
	public int objetosc()
	{
		return (dlugosc*szerokosc*wysokosc);
	}
	
	public int pow_scian()
	{
		return ((dlugosc*wysokosc*2)+(szerokosc*wysokosc*2));
	}
	
	public int pow_podlogi()
	{
		return (dlugosc*szerokosc);
	}
	
	public int koszt_malowania()
	{
		return (pow_scian()*koszt);
	}
	
	public int koszt_malowania_podlogi()
	{
		return (pow_podlogi()*koszt);
	}

}
