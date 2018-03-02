package Biblioteka.interfejs;

import java.util.LinkedList;

import Biblioteka.Autor;
import Biblioteka.Knjiga;

public interface BibliotekaInterfejs {
	
	public void dodajKnjigu(Knjiga k);
	public void obrisiKnjigu(Knjiga k);
	public LinkedList<Knjiga> vratiSveKnjige();
	public LinkedList<Knjiga> pronadjiKnjigu(Autor autor, String isbn, String naslov,
			String izdavac);
}
