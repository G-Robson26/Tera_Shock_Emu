package tera.gameserver.model.ai.npc.thinkaction;

import org.w3c.dom.Node;

import tera.gameserver.model.ai.npc.ConfigAI;
import tera.gameserver.model.ai.npc.NpcAI;
import tera.gameserver.model.npc.Npc;
import tera.util.LocalObjects;

/**
 * Пустой генератор действий в бою.
 *
 * @author Ronn
 */
public class NoBattleAction extends AbstractThinkAction
{
	public NoBattleAction(Node node)
	{
		super(node);
	}

	@Override
	public <A extends Npc> void think(NpcAI<A> ai, A actor, LocalObjects local, ConfigAI config, long currentTime){}
}
