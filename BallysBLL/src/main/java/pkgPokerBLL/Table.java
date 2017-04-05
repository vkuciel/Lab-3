package pkgPokerBLL;

import java.util.HashMap;
import java.util.UUID;

public class Table {

	private UUID TableID;
	
	//	Change this from ArrayList to HashMap.
	private HashMap<Player, UUID> TablePlayers = new HashMap<Player, UUID>();
	
	public Table() {
		super();
		TableID = UUID.randomUUID();
	}
	public UUID getTableID() {
		return TableID;
	}
	public void setTable(UUID tableID){
		TableID = tableID;
	}
	public Table AddPlayerToTable(Player p)
	{
		TablePlayers.put(p,  TableID);
		return this;
	}
	
	public Table RemovePlayerFromTable(Player p)
	{
		TablePlayers.remove(p, TableID);
		return this;
	}
}
