package net.tiles;

import javafx.scene.image.Image;
import net.items.Item;
import net.engine.resourceHandlers.itemTileImageHandlers.BatteryTileImageHandler;
import net.engine.resourceHandlers.tiles.floor.BlankTileImageHandle;
import net.engine.resourceHandlers.tiles.floor.ConcreteTileImageHandler;
import net.engine.resourceHandlers.tiles.floor.TableTileImageHandler;



public class TableTile extends Tile{
	TableTileImageHandler tableTileImageHandler = new TableTileImageHandler();
	BlankTileImageHandle BlankTileImageHandle = new BlankTileImageHandle();
	
	boolean doesCauseCollision = true;

	Item[] itemArray = new Item[10];
	
	int curItemArrayNumber = 0;
	
	
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

				return tableTileImageHandler.returnImage();
	
	}
		
	public boolean isSpecial(){
		return false;
	}
	
	public void doSpecial(){
		
		
	}
	public boolean hasItem(String itemInQuestion){

		return true;
	}
}
