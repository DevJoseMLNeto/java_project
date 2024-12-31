package coll.atividade.list2;

public class Games {

	public static void main(String[] args) {
		GameList gameList = new GameList();
		gameList.addGame("God of war", 2018, "Brabu");
		gameList.addGame("Metal Gear Solid", 1998, "Melhor de todos os tempos!");
		gameList.addGame("Castlevania", 1998, "Sem igual");
		gameList.returnGameList();
		gameList.removerGame("God of war");
		gameList.returnGameList();
		System.out.println(gameList.returnSizeList());
		
	}

}
