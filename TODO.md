#### As of 31/08/13 ####

Plan
====

 - Requirements Capture
 - Functional Design
 - System Design
 - Assign Work
 
Requirements Capture
====================

 - improve java skills
 - make a game because we like games

 - suitable for netbook play
 - windows and linux at least, maybe mac too
 - multiplayer

 - gameplay: how the game is played
    * line of sight for player
    * Normal Mode
        + generates new world for you to play in
    * Hardcore Mode
        + play in same level as previous character, zombiefied 'you' exists
    * dungeon crawler with monsters that evolve
        + dungeon crawlers
            + stats (strength, intelligence, etc)
          *** levelling (stat increase)
          *** classless (player starts as the same character at the start)
          *** randomized rooms
            **** randomly generate specifically sized areas (chunks) and populate with buildings etc
          *** randomized loot
          *** exploring, map of dungeon that grows as you explore
          *** enemies to fight
          *** no puzzles for now (too hard to have good variation)
          *** real time play
          *** player needs to eat
          *** player needs to sleep
          *** maybe allow player to barricade
        + evolving monsters
          *** randomized starting collection of 'basic' zombies
          *** stats (at least the same as the player)
          *** wide range of abilities to gain through evolution
          *** melee and ranged zombies
          *** no magic
          *** appearance will change through evolution
            **** abilities and stats are directly linked to appearance
          *** Artificial Intelligence
          *** pool of zombies to select from when spawning a zombie in
          *** 'successful' zombies breed into the pool and produce slightly random offspring
          *** change in response to player actions
            **** want zombies to breed more if they survive longer against specific weapons;
            **** this means that player should save good weapons for emergencies
          *** change in response to environment
          *** change in response to individual zombie interaction
          *** can work as group or alone
          *** can stalk player
          *** can affect other zombies

 - user interaction
    * keyboard only interaction
    * investigate gamepad support
    * directly player motion and action
    * menus for inventory, game settings etc
    * move and aim player separately ala twinstick shooter
    * move freely
    * aim where you are facing (ala hammerwatch)
    * player can rebind keys
    * buttons
      ** move (wasd | left stick)
      ** easily accessible primary attack (space | RT)
      ** secondary attacks (q | RB)
      ** interact (e | A)
      ** inventory (tab | B)
      ** main menu / pause (esc | start)
      ** strafe (ala hammerwatch) (shift | LT)
      ** stationary attack (ctrl | LB)
      ** dodge (c | X)
      ** reload (r | Y)
      ** quick select (1..4 | dpad)
      
 - audio
    * ambient music
      ** situationally dependent
      ** 8-bit music for the moment
    * sound effects
      ** player getting hurt
      ** zombie moans
      ** explosions
      ** destroy object
      ** door opening... etc
    
 - graphical display
    * multiple resolutions
    * isometric
    * dynamic lighting, for stationary objects (walls, doors), not entities
    * sprites
      ** player sprite
      ** zombie sprites
        *** list of sprite body parts for zombies to be generated with
      ** item sprites
      ** sprite animations
        *** shooting
        *** swinging
        *** running
        *** strafing
        *** dodging
        *** taking damange
        *** picking up items
        *** opening doors
        *** using item
        *** jumping (zombies)
        *** reloading 
        *** opening inventory
        *** dying
        *** eating
        *** sleeping
    * post apocalyptic, dark, gritty, quasi-realistic
    * HUD
      ** map
      ** health
      ** stamina
      ** hunger
      ** quick weapons
      ** currently equipped weapon
      ** need to know which way you are facing
      ** health bar of current zombie attacking
      ** numbers for damage taken/healed
    * levels/background art
    * camera moves with player




Cian Tasks:
  delete all non .md files from repository

####OLD DESIGN####

General
=======

- Add some stuff to game design
- condense into programmable features
- write traits list
- write zombie excuse list


UI
==

- Get a proper fullscreen system working (Not just a window that is slightly larger than the display)
- Or stop undecorated window from being dragged
