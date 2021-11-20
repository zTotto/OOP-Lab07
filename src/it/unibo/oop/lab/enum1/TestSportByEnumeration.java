package it.unibo.oop.lab.enum1;

import it.unibo.oop.lab.nesting1.SportSocialNetworkUserImpl;
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

        falonso.addSport(SportSocialNetworkUserImpl.BIKE);
        falonso.addSport(SportSocialNetworkUserImpl.F1);
        falonso.addSport(SportSocialNetworkUserImpl.SOCCER);
        
        System.out.println("Alonso practices F1: " + falonso.hasSport(SportSocialNetworkUserImpl.F1));
        System.out.println("Alonso does not like volley: " + !falonso.hasSport(SportSocialNetworkUserImpl.VOLLEY));

        dcassani.addSport(SportSocialNetworkUserImpl.BIKE);
        dcassani.addSport(SportSocialNetworkUserImpl.F1);
        dcassani.addSport(SportSocialNetworkUserImpl.MOTOGP);
        System.out.println("Cassani has been a professional biker: "
                + dcassani.hasSport(SportSocialNetworkUserImpl.BIKE));
        System.out.println("Cassani does not like soccer: " + !dcassani.hasSport(SportSocialNetworkUserImpl.SOCCER));
        
        becclestone.addSport(SportSocialNetworkUserImpl.F1);
        becclestone.addSport(SportSocialNetworkUserImpl.BASKET);
        System.out.println("Bernie's the boss when it comes to F1: "
                + becclestone.hasSport(SportSocialNetworkUserImpl.F1));
        System.out.println("Bernie does love playing also basket: "
                + becclestone.hasSport(SportSocialNetworkUserImpl.BASKET));
    }
}
