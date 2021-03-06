package net.tiles.itemTiles;

import javafx.scene.image.Image;
import net.engine.AssetLoader;
import net.engine.Engine;
import net.items.BatteryItem;
import net.items.Item;
import net.tiles.Tile;

public class BatteryTile extends Tile{

	boolean doesCauseCollision = false;

	Item[] itemArray = new Item[10];
	
	int curItemArrayNumber = 0;
	Item batteryItem = new BatteryItem();

	 static boolean pickedUp = false;
	private static String name = "Battery";
	public static String getName(){
		return name;
	}
	
	public static boolean getPickedUp(){
		return pickedUp;
	}
	public boolean causesCollision(){
		
		return doesCauseCollision;
		
	}
	
	public Item[] returnItemArray(){
		
		return itemArray;
		
	}
	
	public void addItemToItemArray(Item itemHandle){
		
		if(curItemArrayNumber == 9 ){
			curItemArrayNumber = 0;
		}
		itemArray[curItemArrayNumber] = itemHandle;
		
		curItemArrayNumber ++;

	}
	
	public Image returnTileImage(String cause){
		itemArray[0] = batteryItem;
		if( pickedUp == false ){
			return AssetLoader.returnBatteryImage();
		}else if(pickedUp == true){
			return AssetLoader.returnFloorColorImage();
		}
		return null;
	}
		
	public void setPickedUp(boolean state){
		this.pickedUp = state;
	}
	public boolean isSpecial(){
		return true;
	}
	public void doSpecial(){
		if(pickedUp == false){
			Engine.activateDialog(getName(),isNeeded(),this);
		}

	}
	public String returnFloorType(){
		return "HouseFloor";
	}
	
	public boolean isNeeded(){
		return true;
	}
	

	public boolean hasItem(String itemInQuestion){

		return true;
	}
}