package me.Minidodo.Scoocyjuice.OurMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)

public class Main {
	public static final String MODID = "MyMod";
    public static final String MODNAME = "My Mod";
    public static final String VERSION = "0.0.1";
        
    @Instance
    public static Main instance = new Main();
        
     
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
                
    }
        
    @EventHandler
    public void init(FMLInitializationEvent e) {
                
    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
                
    }
}
