package model;

/**
 *
 * @author Amaury
 */
public class ColumnEffect extends Effect {

    @Override
    public void playEffect(int j, int k, Game game) {
        for(k = 0; k <= game.getBoard().getWidth()-1; ++k){
            boolean boo = true;
            int tile_id = game.getBoard().getTileIJ(j, k).getStatus();
            for(j = game.getBoard().getHeight()-1; j >= 0; --j){
                if (game.getBoard().getTileIJ(j, k).getStatus() == -1 && boo == true) {
                    game.getBoard().getTileIJ(j, k).setStatus(tile_id);
                    boo = false;
                }
            }
        }
    }
    
}
