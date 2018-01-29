package com.potatospy;

import org.newdawn.slick.*;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.lwjgl.input.Mouse;

public class Menu extends BasicGameState{

    Image playNow;
    Image exitGame;

    // CONSTRUCTOR ///////////////////////////////////////////////////////////
    public Menu(int state){

    }


    // Housekeeping / Set up images and animations
    public void init(GameContainer gameContainer, StateBasedGame stateBasedGame) throws SlickException {

        playNow = new Image("res/playNow.png");
        exitGame = new Image("res/exitGame.png");

    }


    // Draws graphics ////////////////////////////////////////////////////////
    public void render(GameContainer gameContainer, StateBasedGame stateBasedGame, Graphics g) throws SlickException{


        // Draw button image
        g.drawString("Welcome to this amazing game", 100, 50);
        playNow.draw(100,100);
        exitGame.draw(100,200);
    }


    // Updating graphics /////////////////////////////////////////////////////
    public void update(GameContainer gameContainer, StateBasedGame stateBasedGame, int delta) throws SlickException{

        int xpos = Mouse.getX();
        int ypos = Mouse.getY();

        // PLAY button
        if(xpos > 100 && xpos < 311&& ypos > 209&& ypos < 260){
            if(Mouse.isButtonDown(0)){
                stateBasedGame.enterState(1);
            }
        }

        // EXIT button
        // PLAY button
        if(xpos > 100 && xpos < 311&& ypos > 109&& ypos < 160){
            if(Mouse.isButtonDown(0)) {
                System.exit(0);
            }
        }

    }


    // Returns state ID //////////////////////////////////////////////////////
    public int getID(){
        return 0;
    }

}
