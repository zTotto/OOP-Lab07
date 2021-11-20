package it.unibo.oop.lab.enum1;

import it.unibo.oop.lab.socialnetwork.User;

/**
 * This is going to act as a test for
 * {@link it.unibo.oop.lab.enum1.SportSocialNetworkUserImpl}
 * 
 * 1) Realize the same test as the previous exercise, this time using
 * enumeration Sport
 * 
 * 2) Run it: every test must return true.
 * 
 */
public final class TestSportByEnumeration {

    private TestSportByEnumeration() { }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String... args) {
    	final SportSocialNetworkUserImpl<User> dcassani = new SportSocialNetworkUserImpl<>("Davide", "Cassani", "dcassani",  53);
        final SportSocialNetworkUserImpl<User> becclestone = new SportSocialNetworkUserImpl<>("Bernie", "Ecclestone", "becclestone",  83);
        final SportSocialNetworkUserImpl<User> falonso = new SportSocialNetworkUserImpl<>("Fernando", "Alonso", "falonso",  34);

        falonso.addSport(Sport.BIKE);
        falonso.addSport(Sport.F1);
        falonso.addSport(Sport.SOCCER);
        
        System.out.println("Alonso practices F1: " + falonso.hasSport(Sport.F1));
        System.out.println("Alonso does not like volley: " + !falonso.hasSport(Sport.VOLLEY));

        dcassani.addSport(Sport.BIKE);
        dcassani.addSport(Sport.F1);
        dcassani.addSport(Sport.MOTOGP);
        System.out.println("Cassani has been a professional biker: "
                + dcassani.hasSport(Sport.BIKE));
        System.out.println("Cassani does not like soccer: " + !dcassani.hasSport(Sport.SOCCER));
        
        becclestone.addSport(Sport.F1);
        becclestone.addSport(Sport.BASKET);
        System.out.println("Bernie's the boss when it comes to F1: "
                + becclestone.hasSport(Sport.F1));
        System.out.println("Bernie does love playing also basket: "
                + becclestone.hasSport(Sport.BASKET));
    }
}
