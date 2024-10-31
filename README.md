# campaign-manager
For ~~all~~ some of ~~your~~ my tabletop needs.
<br><br>
The ideas and plans for this project is many, and ambitious - but it is not my first project with those "qualities". So,
from the experience of the last couple of forgotten or forsaken projects, I'll start with "small" and "realistic" plans
for this one:  
This is (going to be) a TTRPG session logging CLI application. Somewhere for the GM (or a trustworthy player) to hold all
of those structured notes about the PC's, NPC's, Monsters, and Item's in their world. Somewhere to log changes to HP, 
Alignments, Inventories, Locations, etc. of all of these, for some "quick and easy" session review notes.

This project is currently in a very early stage, and has no features to brag about - but I'll try to keep the README
updated, as I go along :)

# Git Branching Strategy
Though it has not been followed at all thus far, it is one of the many goals of this project to demonstrate a thought-out
and "correct" git strategy. 
This project should as best as possible, follow GitHub's take on GitFlow: [GitHub Flow](https://docs.github.com/en/get-started/using-github/github-flow).

# Design decisions
Various design decisions which has been made:
**Modular architecture** the entire app is, to the best of my ability, made modular using the JPMS framework, and Java's
built-in support for the ServiceLoader pattern.  
This is done for a variety of reasons:
- Practice. As I started this project, I had just learned about this architecture, and pattern in my previous semester,
and I wanted to try it out in "a real project".
- Extensibility. As different GM's use different rule sets (whether official, or homebrewed), so, I believe, should this
tool allow for different rules and play-styles. The modularity of this project allows for that. The user of the project 
can "just" remove any functionalities not fitting their games, from the folder of compiled modules - or make their own, 
to put into said folder.

**Variable Setter included by default** - (Almost) every variable is mutable (but encapsulated, for good measure). As this project is first and foremost meant as 
a CLI tool (Hopefully later with a GUI frontend - but we'll see) for the GM to keep track of the various datapoints in
their sessions, they should also be in complete control of any character, item or entity in the game.
<br><br>
