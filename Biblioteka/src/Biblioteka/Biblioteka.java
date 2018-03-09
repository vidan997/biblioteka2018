package Biblioteka;

import java.util.LinkedList;

import Biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs{
	
	LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();
	
	
	public void dodajKnjigu(Knjiga k) {
		knjige.add(k);
	}

	public void obrisiKnjigu(Knjiga k) {
		knjige.remove(k);		
	}

	public LinkedList<Knjiga> vratiSveKnjige() {
		return knjige;
	}

	public LinkedList<Knjiga> pronadjiKnjigu(Autor autor, String isbn, String naslov, String izdavac) {
		LinkedList<Knjiga>	novaLista = new LinkedList<Knjiga>();
		
		for(int i = 0; i < knjige.size() ; i++) {
			if(knjige.get(i).getNaslov().contains(naslov)) {
				novaLista.add(knjige.get(i));
			}
		}
		
		return novaLista;
	}
	
	

}
