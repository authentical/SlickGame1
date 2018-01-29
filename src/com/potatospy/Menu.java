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

        face = new Image("res/face.png");

    }


    // Draws graphics ////////////////////////////////////////////////////////
    public void render(GameContainer gameContainer, StateBasedGame stateBasedGame, Graphics g) throws SlickException{

        // Draw Mouse coordinates
        g.drawString(mouseLoc, 50, 50);

        // Draw initial face position
        g.drawImage(face,faceX,faceY);

    }


    // Updating graphics /////////////////////////////////////////////////////
    public void update(GameContainer gameContainer, StateBasedGame stateBasedGame, int delta) throws SlickException{

        //faceX = Mouse.getX();
        //faceY = -Mouse.getY() + gameContainer.getHeight();
        mouseLoc = "Picture position x: " + faceX + " y: " + faceY;

        Input input = gameContainer.getInput();
        if(input.isKeyDown(Input.KEY_UP)){
            faceY -=1;
        }
        if(input.isKeyDown(Input.KEY_DOWN)){
            faceY +=1;
        }
        if(input.isKeyDown(Input.KEY_LEFT)){
            faceX -=1;
        }
        if(input.isKeyDown(Input.KEY_RIGHT)){
            faceX +=1;
        }

    }


    // Returns state ID //////////////////////////////////////////////////////
    public int getID(){
        return 0;
    }

}
