# Future-Lab
For playing around with CompletableFutures within a dropwizard service. This service uses models inspired by my idea for a "King's Ledger" type data service, which composites data from multiple medieval/fantasy-based micro services to generate reports about heroes, quests, and factions. All of this serves the purpose of making these examples a lot more fun. 

### Scratchpad

DDD for "King's Ledger"

Characters are living creatures who perform actions or have actions performed on them in the world.
Characters live at a residence. Characters have an inventory. Characters have relationships and reputations based on their actions. Characters belong to different factions. Characters (usually) have a profession.  

A King has a kingdom. A kingdom is a spacial territory under which a king wields power. A kingdom has borders and citizens. A king provides protection in return for subjugation. A king recruits capable characters to assist him in bettering his kingdom. A king improves his kingdom by increasing his wealth, territory, influence, or power (through strength, intelligence, maybe others). A king makes alliances and goes to war. 

Characters become interesting and capable to the king as they take more actions, but only as those actions are noticed by factions and organizations.

Broadly speaking there are certain types of characters...


The king wants to know if a character is worthy of performing the king's business. 
 - He checks with his own records keeper to see if the character owns any property, pays taxes, has a birth certificate or immigration paperwork
 - He checks with the guilds to see which guilds the character associated with, for how long, and the extent of their achievements.
 - He checks with the city guard to see if the character has ever been wanted for a crime, paid a fine, or been imprisoned
 - He checks with the seers to see if the character has dabbled in magic, channeled enough power to be noticed, or has been mentioned in any prophecies