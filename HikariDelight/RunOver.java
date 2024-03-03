//package com.journaldev.threads;


public class RunOver
{

    public static void main(String[] args) 
    {
        int arenaX = 1000;
        int arenaY = 1000;
        int goodX = 150;
        int goodY = 150;
        int goodWidth = 100;
        int badX = 300;
        int badY = 150;
        int badWidth = 100;
        GameArena arena = new GameArena(arenaX, arenaY, true);
        Goodie goodie = new Goodie(goodX, goodY, goodWidth); 
        Baddie baddie = new Baddie(badX, badY, badWidth);

        goodie.addTo(arena);
        baddie.addTo(arena);

        while (true) 
        {
            //goodie.handleUserInput(arena);
            goodie.move(arena);
            arena.pause();
        }
    }
}    