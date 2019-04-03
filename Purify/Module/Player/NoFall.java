package Purify.Module.Player;

import org.lwjgl.input.Keyboard;

import Purify.Pur;
import Purify.Module.Category;
import Purify.Module.Module;
import net.minecraft.network.play.client.CPacketPlayer;

public class NoFall extends Module{

	public NoFall() {
		super("NoFall", Keyboard.KEY_N, Category.Player);
		// TODO Auto-generated constructor stub
	}
	
	public void onUpdate() {
		if(this.getState()) {
			if(Pur.mc.player.fallDistance > 3.0F) {
				Pur.mc.player.connection.sendPacket(new CPacketPlayer(true));
			}
			
		
		}else {
			return;
		}
		
		
		
		
	}

}
