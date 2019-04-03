package Purify.Gui;
import java.util.List;

import org.lwjgl.opengl.Drawable;
import org.lwjgl.opengl.GL11;

import Purify.Pur;
import Purify.Module.Category;
import Purify.Module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class GuiIngameHook{
	
	  static ScaledResolution scaledresolution = new ScaledResolution(Minecraft.getMinecraft());

	public static void StartHud(){
			Hud();
	}
	
	
	public static void Hud(){
		watermark();
		renderArrayList();
		coords();
		test();

	}
	private static void watermark() {
		Pur.fr.drawStringWithShadow(Pur.getName() + " " + Pur.getVers(), 1, 1, Pur.getPrimary_color());

	}
	
	//Renders the arraylist
	private static void renderArrayList(){
		int yCount = 1;
		for(Module m : Pur.theClient.moduleManager.activeModules){
			m.onRender();
			
			if(m.getState() && !m.isCategory(Category.Gui)){
				Pur.theClient.fr.drawStringWithShadow( m.getName(), scaledresolution.getScaledWidth() - Pur.theClient.fr.getStringWidth(m.getName()) - 1, yCount, Pur.getSecondary_color());
				yCount +=10;


			}
		}
	}
	//Renders the coords
	private static void coords() {
		Pur.theClient.fr.drawStringWithShadow("X: " + (int)Pur.mc.player.posX, 1, scaledresolution.getScaledHeight() - 28, Pur.getSecondary_color());
		Pur.theClient.fr.drawStringWithShadow("Y: " + (int)Pur.mc.player.posY, 1, scaledresolution.getScaledHeight() - 18, Pur.getSecondary_color());
		Pur.theClient.fr.drawStringWithShadow("Z: " + (int)Pur.mc.player.posZ, 1, scaledresolution.getScaledHeight() - 8, Pur.getSecondary_color());
	}
	//Used to test module data
	private static void test() {
		Pur.fr.drawStringWithShadow("Fall Distance: " + (int)Pur.mc.player.fallDistance, 1, 10, Pur.getSecondary_color());

	}
	
	
    

}