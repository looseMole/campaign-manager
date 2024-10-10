# The inventory 
Should contain:
- The Player's gold, silver, copper n' other riches.
- The Player's items: Their bag, tools, instruments, weapons, magic items, provisions(?), ammunition(?), potions, books and trinkets.
- The Player's spell components.

Conversion to packages and classes (ideas):
- Item interface
  - tool interface
  - instrument interface(?)
  - weapon interface
  - wearable interface
  - magic item interface
  - canBeAttunedTo interface (Title is WIP)
  - consumable item interface

Questions:
- Should spell components be separate, or considered "regular" items?
  - What about a component pouch, then?
- Should the bag itself be considered an item? - if so, should there be a "canContainItems" interface?
- Should the individual types of currency be considered items?
- Should there be some basic implementations of these interfaces in the common module?
- Should there be a Weapon interface? What about improvised weapons?
- Could the "magic item interface" be broken up, into more narrow uses, like has/doesCertainEffect?
  In that case, it would not be specific to magic items only, but also explosives, for instance.