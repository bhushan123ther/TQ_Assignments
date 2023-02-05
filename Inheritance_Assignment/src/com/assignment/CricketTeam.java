package com.assignment;

class IPLTeam {
	void play() {
		System.out.println("Playing cricket..");
	}
}

class CSK extends IPLTeam {

}

class RCB extends IPLTeam {

}

public class CricketTeam {

	public static void main(String[] args) {

		RCB team1 = new RCB();
		team1.play();

		CSK team2 = new CSK();
		team2.play();

	}

}
