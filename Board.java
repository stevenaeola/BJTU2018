
public class Board
{
    private Location[][] locations;

    public Board()
    {
        // initialise board with empty locations
    }

    public ShotStatus getStatus(Position p){
        
        Location l = locations[p.getX()][p.getY()];
        Ship sh = l.getShip();
        if(sh==null){
            return ShotStatus.MISS;
        }
        else{
            return sh.getStatus(l.getSquare());
        }
    }

    public ShotStatus shoot(Position p){
        // need to fix this
        return ShotStatus.MISS;
    }
}
