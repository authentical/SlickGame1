package com.potatospy;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
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

        face = new Image("res/face.png");

    }


    // Draws graphics ////////////////////////////////////////////////////////
    public void render(GameContainer gameContainer, StateBasedGame stateBasedGame, Graphics g) throws SlickException{

        g.drawString(mouseLoc, 50, 50);

        g.drawImage(face,faceX,faceY);

    }


    // Updating graphics /////////////////////////////////////////////////////
    public void update(GameContainer gameContainer, StateBasedGame stateBasedGame, int delta) throws SlickException{

        faceX = Mouse.getX();
        faceY = -Mouse.getY() + 360;
        mouseLoc = "Mouse position x: " + faceX + " y: " + faceY;

    }


    // Returns state ID //////////////////////////////////////////////////////
    public int getID(){
        return 0;
    }

}
