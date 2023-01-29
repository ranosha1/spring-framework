package main;

public class TeamTest {
    public static void main(String[] args) {

        FootbalPlayer joe=new FootbalPlayer("Joe");
        BaseballPlayer pat= new BaseballPlayer("Pat");
        SoccerPlayer beckham= new SoccerPlayer("Beckham");

       // Team liverpool= new Team<>(Liverpool);
        Team<SoccerPlayer> liverpool=new Team<>("Liverpool");
      //  Team<String> brokenTeam=new Team<String>("this will not work");

       // liverpool.addPlayer(joe);
       // liverpool.addPlayer(pat);
        liverpool.addPlayer(beckham);

        System.out.println(liverpool.numPlayer());

    }
}
