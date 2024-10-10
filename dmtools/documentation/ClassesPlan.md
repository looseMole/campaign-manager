# Classes
Some role playing games - and some GM's allow multiclassing. As such, a character's class cannot be as simple as "just"
a class Enum, and a level integer.  <br>

In some games, it also matters which level a character "started out with" - it could affect their HitDie, for instance. <br>

The selection of classes available is different from game to game, setting to setting, and depends among other things 
on which source books the table's rules are based on. <br>

As such, it is hard to define any "universally standard" classes like Fighter or Wizard - most rp systems will have these
classes, but they might mean different things.

<h2>Plan</h2>
As the project is supposed to be component-based, and to at some point use the ServiceLoader, the plan is to make some
general service interfaces for classes, to be implemented in other components - this way, those other components' implemented
classes can be found by the ServiceLoader.

A Class class (currently named PlayerClass), will hold its name, description, and information about hitdie, and how it affects the character's individuals.

It will then contain an array, of selection of ClassLevels, each of which has a description, and can contain all possible
classLevel-"features" like its effect on the characters abilities, proficiencies, movement types/speeds, or new types of Actions