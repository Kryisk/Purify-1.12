package Purify.Module.Movement;

import org.lwjgl.input.Keyboard;

import Purify.Module.Category;
import Purify.Module.Module;

public class Jesus extends Module{

	public Jesus() {
		super("Jesus", Keyboard.KEY_J, Category.Movement);
		// TODO Auto-generated constructor stub
	}
	
	public void onUpdate() {
		if(!this.getState()) {
			return;
		}
	}

}
