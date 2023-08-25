package tera.gameserver.network.clientpackets;

import tera.gameserver.model.FriendList;
import tera.gameserver.model.playable.Player;

/**
 * Клиентский пакет с запросом на добавление друга.
 *
 * @author Ronn
 */
public class RequestFriendAdd extends ClientPacket
{
	/** игрок */
	private Player player;

	/** имя игрока */
	private String name;

	@Override
	public void finalyze()
	{
		player = null;
	}

	@Override
	public void readImpl()
	{
		player = owner.getOwner();

		readShort();

		name = readString();
    }

	@Override
	public void runImpl()
	{
		if(player == null)
			return;

		// получаеим список игроков
		FriendList friendList = player.getFriendList();

		// добавляем нового друга
		friendList.addFriend(name);
	}
}