Functional Design
=================

Audio
-----

 - Engine to play music
    * short, 8-bit "background tracks" that loop
    * each track has different moods associated with it
      + battle
      + near death
      + quiet
      + night
      + day
      + being stalked
      + escaping from zombies
      + killed all zombies
    * list of songs for each given mood
    * engine plays song that most suits the current mood
    * Choose random song to play from best fitting songs
    * Each track should play for no more than 2 minutes before being swapped to a new track
    * Mood of game should be tracked to keep background track relevant
    * Seguing tracks to convert from one background track to another
    * Seguing tracks should also have moods to keep them as inoffensive as possible
 - Engine to play audio effects

GUI
---
