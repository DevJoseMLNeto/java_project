package coll.atividade.list2;

import java.util.ArrayList;
import java.util.List;

public class GameList {
	
	private List<GamesType> gameList;
	
	public GameList() {
		this.gameList = new ArrayList<GamesType>();
	}
	
	public void addGame(String name, int ano, String desc) {
		gameList.add(new GamesType(name, ano, desc));
	}
	
	public void returnGameList() {
		for(GamesType i: gameList) {
			System.out.println(i);
		}
	}
	
	public int returnSizeList() {
		return gameList.size();
	}
	
	public void removerGame (String nome) {
		List<GamesType> gameRemovido = new ArrayList<GamesType>();
		for(GamesType gl : gameList) {
			if(gl.getNome().equalsIgnoreCase(nome)) {
				gameRemovido.add(gl);
			}
		}
		System.out.println();
		gameList.removeAll(gameRemovido);
	}
	
	

}
