import java.awt.*;

public class AllActivities  implements DailyActivities , UnusualActivities {
    private  String time ;
    // Default constructor.
    public AllActivities(){

    }
    public AllActivities(String time){
        this.time=time;

    }
    public String getTime() {
        return time;
    }
    // Implements the methods from the DailyActivities and UnusualActivities interface.

    @Override
    public String surfTheNet() {
        return "I usually surf the Net on Youtube " ;
    }

    @Override
    public String goToSchool() {
        return "I go to school almost every weekday. " +
                "Monday from 9am to 8pm." +
                " Tuesday from 9am to 4pm, but every other day from 9am to 11am. ";
    }

    @Override
    public String haveBreakfast() {
        return " ";
    }

    @Override
    public String haveDinner() {
        return "An ordinary dormitory dinner. I eat rice and fatty food all the time. I'm bored.";
    }

    @Override
    public String read() {
        return "I read 10 pages of books every evening before going to bed. " +
                "Usually these books are personal development books or books about Turkish history.";
    }


    public String practiceKickBoks() {
        return "I go to the gym three days a week. Tuesday-Thursday at 8 - 9 pm, Saturday at 3-4 pm.";
    }

    public String dance() {
        return"I go dancing on Friday from 7 to 8 p.m.";
    }

    public String meetTheEsn(){
        return "There was an ESN event on Wednesday from 7pm to 10pm. " +
                "ESN means that  erasmus student network. " +
                "I had the opportunity to practise English. ";
    }
    public String goToLibrary(){
        return "I normally try to go every weekday.";
    }
    public String travel(){
        return "I had a flight at 5.50am on Monday morning. I had a small 1 hour journey from Antalya to Ankara.";
    }
    public String visitRelatives() {
        return"I visited my relatives on Saturday morning. I had a nice breakfast. ";
    }
    public String meetWAT(){
        return  "I interviewed with a few companies because I was thinking of going to Work and Travel, but I think I gave up. ";
    }
    public String goToParty(){
        return "My close friend has a birthday party at 21.00 pm on Monday. So , it is time to celebrate !!";
    }

}
