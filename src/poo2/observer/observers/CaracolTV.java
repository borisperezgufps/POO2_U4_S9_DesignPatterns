package poo2.observer.observers;

import javax.swing.JOptionPane;

public class CaracolTV implements Channel{

	private String name;
	private String news;
	
	public CaracolTV(String name) {
		this.name = name;
	}
	
	public void setNews(String news) {
		this.news = news;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public void update(Object news) {
		this.setNews((String) news);
		JOptionPane.showMessageDialog(null, 
				"Uy, noticia, increíble, sorprendente: "+news);
	}
	
}
