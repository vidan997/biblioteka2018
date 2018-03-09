package Biblioteka;

import java.util.LinkedList;

import Biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs {

	LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();

	public void dodajKnjigu(Knjiga k) {
		if (k == null || knjige.contains(k)) {
			throw new RuntimeException("Knjiga je null ili vec postoji.");
		}

		knjige.add(k);
	}

	public void obrisiKnjigu(Knjiga k) {
		if (k == null || knjige.contains(k)) {
			throw new RuntimeException("Knjiga je null ili ne postoji.");
		}
		knjige.remove(k);
	}

	public LinkedList<Knjiga> vratiSveKnjige() {
		return knjige;
	}

	public LinkedList<Knjiga> pronadjiKnjigu(Autor autor, String isbn, String naslov, String izdavac) {
		//ovo je ok komentar
		if(naslov == null) {
			throw new RuntimeException("Naslov ne sme biti NULL!");
		}

		LinkedList<Knjiga> novaLista = new LinkedList<Knjiga>();

		for (int i = 0; i < knjige.size(); i++) {
			if (knjige.get(i).getNaslov().contains(naslov)) {
				novaLista.add(knjige.get(i));
			}
		}

		return novaLista;
	}

}
