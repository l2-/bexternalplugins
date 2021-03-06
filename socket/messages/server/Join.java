package net.runelite.client.plugins.socket.messages.server;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.runelite.client.plugins.socket.messages.ClientsocketMessage;

@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@Data
public class Join extends ClientsocketMessage
{
	private Object room;
	private String name;
}
