package com.potatospy;

import org.newdawn.slick.*;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Play extends BasicGameState{

    Animation character, movingUp, movingDown, movingLeft, movingRight;
    Image worldMap; // World map does the moving, character stays in place
    boolean quit = false;
    int[] duration = {200, 200};
    float characterPositionX = 0;
    float characterPositionY = 0;
    float shiftX = characterPositionX + 320;
    float shiftY = characterPositionY + 160;


    // CONSTRUCTOR ///////////////////////////////////////////////////////////
    public Play(int state){

    }


    // Housekeeping / Set up images and animations
    public void init(GameContainer gameContainer,
                     StateBasedGame stateBasedGame)
            throws SlickException {

        worldMap = new Image("res/world.png");
        Image[] walkUp = {      new Image("res/isaacsBack.png"),
                                new Image("res/isaacsBack.png")};
        Image[] walkDown = {    new Image("res/isaacsFront.png"),
                                new Image("res/isaacsFront.png")};
        Image[] walkLeft = {    new Image("res/isaacsLeft.png"),
                                new Image("res/isaacsLeft.png")};
        Image[] walkRight = {   new Image("res/isaacsRight.png"),
                                new Image("res/isaacsRight.png")};

        movingUp = new Animation(walkUp, duration, false );
        movingDown = new Animation(walkDown, duration, false );
        movingLeft = new Animation(walkLeft, duration, false );
        movingRight = new Animation(walkRight, duration, false );

        character = movingDown;

    }



    public void render(GameContainer gameContainer,
                       StateBasedGame stateBasedGame,
                       Graphics g)
            throws SlickException{

        // Draw background
        worldMap.draw(characterPositionX, characterPositionY);

        // Draw character
        character.draw(shiftX, shiftY);

        // Show character coordiantes, (character stays in the centre)
        g.drawString("xpos: " + characterPositionX + "\nypos: "+ characterPositionY,
                400, 20);

        if(quit==true){
            g.drawString("Resume (R)", 250, 100);
            g.drawString("Main Menu(M)", 250, 150);
            g.drawString("Quit Game (Q)", 250, 200);
            if(quit==false){
                g.clear();
            }
        }

    }



    public void update(GameContainer gameContainer,
                       StateBasedGame stateBasedGame,
                       int delta)
            throws SlickException{

        // Move map (character stays in the centre)
        Input input = gameContainer.getInput();




        // Handle Arrow Keys -> Move map, Update character position values
        if(input.isKeyDown(Input.KEY_UP)){
            character = movingUp;
            characterPositionY += delta *0.1f;   // Increase Y position
            if(characterPositionY > 152){ characterPositionY -=delta * 7.0f; }
        }
        if(input.isKeyDown(Input.KEY_DOWN)){
            character = movingDown;
            characterPositionY -= delta *0.1f;   // Decrease Y position
            if(characterPositionY < -481){ characterPositionY +=delta * 7.0f; }
        }
        if(input.isKeyDown(Input.KEY_LEFT)){
            character = movingLeft;
            characterPositionX += delta *0.1f;   // Increase X position
            if(characterPositionX > 312){ characterPositionX -=delta * 7.0f; }
        }
        if(input.isKeyDown(Input.KEY_RIGHT)){
            character = movingRight;
            characterPositionX -= delta *0.1f;   // Decrease X position
            if(characterPositionX < -897){ characterPositionX +=delta * 7.0f; }
        }


        // L312, R-897
        // T152, B-481

    }



    public int getID(){
        return 1;
    }

}
