package com.potatospy;

/* SlickGame 1 from tutorial by Bucky Roberts
https://www.youtube.com/channel/UCJbPGzawDH1njbqV-D5HqKw
*/


import org.newdawn.slick.*;
import org.newdawn.slick.state.*;


public class Game extends StateBasedGame{

    public static final String gamename="Ham Blaster!";
    public static final int menu = 0;
    public static final int play = 1;


    // CONSTRUCTOR
    public Game(String gamename){
        super(gamename);

        // Game has 2 states
        /* Passes an Integer state with state.getID()
        getID == -1 is current state
        */
        this.addState(new Menu(menu));
        this.addState(new Play(play));
    }


    //INIT
    public void initStatesList(GameContainer gameContainer) throws SlickException{
        this.getState(menu).init(gameContainer, this);
        this.getState(play).init(gameContainer, this);
        // First state
        this.enterState(menu);
    }





    // MAIN
    public static void main(String[] args) {

        //AppGameContainer extends GameContainer
        /* -- DisplayMode setup
        * */
        AppGameContainer appGameContainer;

        try{
            // Create a DisplayMode that contains the game and .start()
            appGameContainer = new AppGameContainer(new Game(gamename));
            appGameContainer.setDisplayMode(640,360, false);
            appGameContainer.start();
        }catch (SlickException e){e.printStackTrace();}
    }
}

















