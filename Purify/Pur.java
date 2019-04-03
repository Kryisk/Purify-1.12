package Purify;

import org.lwjgl.opengl.Display;

import Purify.Module.Module;
import Purify.Module.ModuleManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;

public class Pur {
	
	private static String name = "Purify";
	private static double vers = 0.1;
	
	private static int secondary_color = 0xff3498db;
	private static int primary_color = 0xff2980b9;
	
	
	public static final Pur theClient = new Pur();
	
	//nigger
	
	public static Minecraft mc = Minecraft.getMinecraft();
	
	public static FontRenderer fr = mc.fontRendererObj;
	
	public static ModuleManager moduleManager;
	
	public static void onStart() {
		moduleManager = new ModuleManager();
		Display.setTitle("Purify " + vers);
	}

	public static String getName() {
		return name;
	}

	public static double getVers() {
		return vers;
	}

	public static void onKeyPressed(int k){
		for(Module m: moduleManager.activeModules){
			if(m.getBind() == k){
				m.toggleModule();
			}
		}
	}
	
	public static int getSecondary_color() {
		return secondary_color;
	}

	public static int getPrimary_color() {
		return primary_color;
	}


}
