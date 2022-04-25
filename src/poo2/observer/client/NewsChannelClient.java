package poo2.observer.client;

import poo2.observer.notifier.NewsAgency;
import poo2.observer.observers.CaracolTV;
import poo2.observer.observers.NewsChannel;

public class NewsChannelClient {

	public static void main(String[] args) {
		
		NewsAgency na = new NewsAgency("Reuters");
		
		NewsChannel ncC = new NewsChannel("Caracol");
		NewsChannel ncR = new NewsChannel("RCN");
		NewsChannel ncN = new NewsChannel("Noticias Uno");
		
		NewsChannel nc13 = new NewsChannel("Canal 13");
		NewsChannel ncCV = new NewsChannel("Chilevision");
		
		CaracolTV tv = new CaracolTV("El de la mañana");
		
		na.addObserver(ncC);
		na.addObserver(ncR);
		na.addObserver(ncN);
		
		na.setNews("Temblor en La Mesa de los Santos");
		na.setNews("Se cayó la muralla china");
		
		na.addObserver(tv);
		
		na.setNews("Te agregaron como amigo");
		
	}
	
}
