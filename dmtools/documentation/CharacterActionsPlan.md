# Actions
Different classes, species, transformations and tools, allows a character to perform different types of actions - both
inside of, and outside of combat.  
Such actions include:
- Weapon attacks
- Bare-handed attacks
- Movement actions
  - Walking/running
  - Climbing
  - Jumping
  - Flying
  - Swimming
- Item interactions
  - Preparing weapons
  - Consuming consumables
  - Moving items
  - "Using" items (levers, handles, etc.)
- Casting spells


# Plan  
A lot of these actions are based on certain attributes, like movement speed on/in land, water and the air - yet not all
of these attributes are relevant to all kinds of characters.  
Would it then be preferable, to have them default to 0 and be present on all characters, or to be a service provided,
to, and loaded by, the ServiceLoader?
<br>
I think I will start with the easier choice: default values. Then I can always refactor later (Though this last sentence
seems cocky). 