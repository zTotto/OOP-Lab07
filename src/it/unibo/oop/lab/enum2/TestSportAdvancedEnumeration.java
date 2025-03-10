/**
 * 
 */
package it.unibo.oop.lab.enum2;

import java.util.Set;

import it.unibo.oop.lab.socialnetwork.User;

/**
 * 
 * 1) Complete the test as per comments below
 * 
 * 2) Run it: every test must return true.
 * 
 */
public final class TestSportAdvancedEnumeration {

    private TestSportAdvancedEnumeration() { }

    /**
     * This is going to act as a test for
     * {@link it.unibo.oop.lab.socialnetwork.SocialNetworkUserImpl}.
     * 
     * @param args
     *            ignored
     */
    public static void main(final String... args) {
        /*
         * create 2 social network users (Sport2SocialNetworkUser): - Davide
         * Cassani , dcassani, 53 - Fernando Alonso, falonso, 34
         */
    	final Sport2SocialNetworkUserImpl<User> dcassani =
                new Sport2SocialNetworkUserImpl<>("Davide", "Cassani", "dcassani", 53);
        final Sport2SocialNetworkUserImpl<User> falonso =
                new Sport2SocialNetworkUserImpl<>("Fernando", "Alonso", "falonso", 34);
        /*
         * alonso in a fan of soccer and bike and practices F1
         */
        falonso.addSport(Sport.F1);
        falonso.addSport(Sport.SOCCER);
        falonso.addSport(Sport.BIKE);
        Set<Sport> individual = falonso.getIndividualSports();
        System.out.println("[Alonso] [Individual] [F1]: " + individual.contains(Sport.F1));
        System.out.println("[Alonso] [Individual] [not TENNIS]: " + !individual.contains(Sport.TENNIS));
        Set<Sport> sportsInPlace = falonso.getSportPracticedInPlace(Place.INDOOR);
        System.out.println("[Alonso] [Indoor] [no. Sports==0]: " + sportsInPlace.isEmpty());
        /*
         * Cassani practiced bike and loves F1 and MotoGP
         */
        dcassani.addSport(Sport.BIKE);
        dcassani.addSport(Sport.F1);
        dcassani.addSport(Sport.MOTOGP);
        individual = dcassani.getIndividualSports();
        System.out.println("[Cassani] [Individual] [F1]: " + individual.contains(Sport.F1));
        System.out.println("[Cassani] [Individual] [not TENNIS]: " + !individual.contains(Sport.TENNIS));
        sportsInPlace = dcassani.getSportPracticedInPlace(Place.OUTDOOR);
        System.out.println("[Cassani] [Outdoor] [no. sports==3]: " + (sportsInPlace.size() == 3));
         
    }
}
