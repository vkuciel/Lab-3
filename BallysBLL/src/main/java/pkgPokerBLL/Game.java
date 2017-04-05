package pkgPokerBLL;

import java.util.ArrayList;
import java.util.UUID;

public class Game {
	UUID GameID;
	UUID TableID;
	ArrayList<Player> GamePlayers = new ArrayList<Player>();
	
	public UUID getGameID() {
		return GameID;
	}
	public void setGameID(UUID gameID) {
		GameID = gameID;
	}
	public UUID getTableID() {
		return TableID;
	}
	public void setTableID(UUID tableID) {
		TableID = tableID;
	}
	public ArrayList<Player> getGamePlayer() {
		return GamePlayers;
	}
	public void setGamePlayer(ArrayList<Player> gamePlayer) {
		GamePlayers = gamePlayer;
	}
	public Game AddPlayerToGame(UUID table, Player player){
		GamePlayers.add(player);
		return this;
	}
	
}
