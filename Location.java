
public class Location
{
    private Ship ship; // will be null of no ship
    private int square;
    
    public Location()
    {
        
    }

    public void setShip(Ship sh, int square){
        ship = sh;
        this.square = square;
    }

    public Ship getShip(){
        return ship;
    }
    
    public int getSquare(){
        return square;
    }

}
