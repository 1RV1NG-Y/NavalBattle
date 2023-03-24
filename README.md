# NavalBattle
Mobile application based on the naval battle game

## About the game
It's an own version of the "Naval battle/Battleship" game developed for mobile devices using Kotlin and Android Studio.
The game can be played with two players, each on a different device, or individually.

### Boards
Players operate an ocean board and a shooting board; each divided into squares. Each board represents a different area of the open sea: the player's own and the opponent's. On the first board, the player places his ships and records the opponent's "shots"; on the other, the player records his own shots against the other player, differentiating the hits and those that hit the water. At the same time, the position of the opponent's boats is deduced.

### Ships
At the start, each player places his ships on the first board, secretly, invisible to the opponent. Each player occupies, according to his preferences, the same number of squares, horizontally and/or vertically, which represent his ships. Both participants must place an equal number of ships, so it is customary, before starting, to stipulate by common agreement the number and size of the ships to be placed on the board. Consider that:
    a. five consecutive squares make up an aircraft carrier;
    b. four, a ship;
    c. three, a submarine;
    d. two, a cruiser;
    e. one isolated square, a motorboat.
    
The participants could agree, for example, to place, each, two aircraft carriers, three ships and five speedboats. Ships may not be placed side by side.

### Development of the game
Once all the ships have been positioned, a series of rounds begins. In each round, each player in his turn "shoots" towards his opponent's fleet indicating a position (the coordinates of a square), which he registers on the second board. If that position is occupied by part of an opposing ship, it will be identified as Damaged, if there are still parts of the ship (squares) undamaged; or Sunk if with that shot the ship has been totally destroyed (that is, if the hit is the last of the squares that make up the ship that remained to be hit).
The player who has hit a ship in his previous move will shoot again until he misses. If the indicated position does not correspond to a part of any ship, it will be identified as Water.
The shots that have fallen on an opponent's ship and those that have fallen into the sea must be reflected on the second board.

### End of the game
Winner: whoever destroys all his opponent's ships first is the winner (as in so many other turn-based games, in case the player who started the game sinks the last ship of his opponent that was still afloat in his last move, the other player has the right to one last chance to reach a draw, a last shot that also allows him to finish sinking the opponent's fleet, which would mean a draw).

Tie: although it is usual to continue the game until there is a winner, a tie can also be reached if, after each player has fired the same fixed and predetermined number of shots (as a variant allowed in the game), both players have hit the same number of opposing squares.

### Two-player game
Since the program is developed between two players, it is necessary to use two devices.

As the game is based on interaction between two devices, it is necessary to establish network communication between both devices and a server, in this case the conection is made through Google Firebase.

### Individual game.
For the single-device version against a virtual player, the computer will generate random positions with some degree of artificial intelligence.
