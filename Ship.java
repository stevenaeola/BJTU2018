
public class Ship
{
    private ShotStatus[] squares;
    private int size;

    public Ship(int size)
    {
        this.size = size;
        squares = new ShotStatus[size];
        for(int i =0; i< size; i++){
            squares[i] = ShotStatus.MISS;
        }
    }

    public ShotStatus getStatus(int square){
        return  squares[square];
    }

    public ShotStatus shoot(int square){
        // need to find out if all squares have been hit. If so, then SUNK
        return ShotStatus.HIT;
    }
    
    public boolean isSunk(){
        return false;
    }
}
