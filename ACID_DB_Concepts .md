We've listed a few real-world scenarios depicting database transactions that happen all the time. With a partner, review them and think through:

With which ACID principle(s) is the scenario dealing?
Assuming the DB is ACID compliant, what should happen?
What would happen if the DB was not ACID compliant? What could go wrong in this transaction?
Meet the Scenarios

Scenario 1: You and your brother are both trying to buy the same 12-pack of Pamplemousse La Croix from Amazon at the same time. There are 10 packs available; your brother wants five and you want six.

Whoever submitted the  transaction first would have their order fulfilled, while the second person would likely get an error message.
Atomicity, Isolation, Durability.


Scenario 2: You're trying to buy tickets from Ticketmaster to see Taylor Swift's new tour. The tickets go on sale at 12 p.m., and you're ready to purchase as soon as the clock strikes noon. After being stuck in the digital waiting room for some time, you’re finally able to add those tickets to your cart, make the purchase, and get your confirmation. All of a sudden, the site goes down (probably overrun with ravenous T Swift fans).

You got the confirmation, so the transaction is completed. There is no need for the user to do anything else.
Atomicity, Consistency, Isolation, Durability


Scenario 3: You send a five-page document to the printer. While it's working on Page 3, the printer runs out of toner.

The job would pause as unfinished until the toner is replaced, then the job would continue (unless it is specifically cancelled);
Atomicity, Consistency, Isolation, Durability