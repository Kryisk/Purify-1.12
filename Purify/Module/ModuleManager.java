package Purify.Module;

import java.util.ArrayList;


import Purify.Module.Movement.*;
import Purify.Module.Player.*;

public class ModuleManager {

	public static ArrayList<Module> activeModules = new ArrayList<Module>();

	public ModuleManager() {
		this.activeModules.add(new Step());
		this.activeModules.add(new NoFall());

	}

	public static ArrayList<Module> getModules() {
		return activeModules;
	}

	public Module getModule(Class<? extends Module> clazz) {
		for (Module mod : getModules()) {
			if (mod.getClass() == clazz) {
				return mod;
			}
		}
		return null;
	}

}