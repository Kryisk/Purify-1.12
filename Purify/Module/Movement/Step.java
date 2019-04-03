package Purify.Module.Movement;

import org.lwjgl.input.Keyboard;

import Purify.Pur;
import Purify.Module.Category;
import Purify.Module.Module;

public class Step extends Module{

	public Step() {
		super("Step", Keyboard.KEY_C, Category.Movement);
		// TODO Auto-generated constructor stub
	}
	
	public void onEnable() {
		Pur.mc.player.stepHeight = 10000F;
	
	}

	public void onDisable() {
		Pur.mc.player.stepHeight = 0.5F;
	
	}
}
