package com.potatospy;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Play extends BasicGameState{

    public Play(int state){

    }



    public void init(GameContainer gameContainer,
                     StateBasedGame stateBasedGame)
            throws SlickException {

    }



    public void render(GameContainer gameContainer,
                       StateBasedGame stateBasedGame,
                       Graphics g)
            throws SlickException{

        g.drawString("Playstate", 50,50);

    }



    public void update(GameContainer gameContainer,
                       StateBasedGame stateBasedGame,
                       int delta)
            throws SlickException{

    }



    public int getID(){
        return 1;
    }

}
