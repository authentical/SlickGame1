package com.potatospy;

import org.newdawn.slick.*;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.lwjgl.input.Mouse;

public class Menu extends BasicGameState{

    public String mouseLoc = "No mouse!";

    Image face;
    int faceX = 200;
    int faceY = 200;

    // CONSTRUCTOR ///////////////////////////////////////////////////////////
    public Menu(int state){

    }


    // Housekeeping ////////////////////////////////////////////////////////
    public void init(GameContainer gameContainer, StateBasedGame stateBasedGame) throws SlickException {



    }


    // Draws graphics ////////////////////////////////////////////////////////
    public void render(GameContainer gameContainer, StateBasedGame stateBasedGame, Graphics g) throws SlickException{

        g.fillOval(75, 100, 100, 100);
        g.drawString("Start Game", 80, 70);

    }


    // Updating graphics /////////////////////////////////////////////////////
    public void update(GameContainer gameContainer, StateBasedGame stateBasedGame, int delta) throws SlickException{

        Input input = gameContainer.getInput();
        int xpos= Mouse.getX();
        int ypos = Mouse.getY();

        // Change game state when mouse is in oval
        if(xpos >75 && xpos <175 && ypos > 160 && ypos < 260){
            if(input.isMouseButtonDown(0)){     // 0 == Left Click
                stateBasedGame.enterState(1);   // Go to state 1 == Play
            }
        }

    }


    // Returns state ID //////////////////////////////////////////////////////
    public int getID(){
        return 0;
    }

}
