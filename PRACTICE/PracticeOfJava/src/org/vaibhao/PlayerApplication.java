package org.vaibhao;

class Player {
	private int id;
	private String name;
	private int run;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}
}

class Team {
	Player pl[];

	void setPlayer(Player... p) {
		pl = p;
	}

	void showPlayer() {
		for (int i = 0; i < pl.length; i++) {
			System.out.println(pl[i].getId() + "\t" + pl[i].getName() + "\t" + pl[i].getRun());
		}
	}
}

public class PlayerApplication {
	public static void main(String[] args) {
		Team t = new Team();
		Player p1 = new Player();
		p1.setId(1);
		p1.setName("vaibhao");
		p1.setRun(80);
		Player p2 = new Player();
		p2.setId(2);
		p2.setName("akshat");
		p2.setRun(75);
		t.setPlayer(p1, p2);
		t.showPlayer();
	}
}
