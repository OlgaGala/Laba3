public class Main {

    public static void main(String[] args) {

        Znaika z = new Znaika("Знайка");
        Smekailo s = new Smekailo("Смекайло");
        Citizens citizens = new Citizens();
        Babies babies = new Babies();
        MoveIn move = new MoveIn();
        GreenCity greenCity = new GreenCity();
        Dissuade dissuade = new Dissuade();
        Feed feed = new Feed();
        ToOutskirts outskirts = new ToOutskirts();
        Take take = new Take();
        Road road = new Road();
        Show show = new Show();
        FirmlyOrUncertainly firmly = FirmlyOrUncertainly.FIRMLY;
        CertainOrUncertain certain = CertainOrUncertain.CERTAIN;
        Death death = new Death();
        WithTearsOrWithoutTears withTears = WithTearsOrWithoutTears.WITH_TEARS;
        SayGoodbye sayGoodbye = new SayGoodbye();


        s.smekailoSay();
        z.decideFirmly(firmly.getTranslation());
        z.goToGreenCity(move.toString(),greenCity.toString());
        citizens.citizensDissuadeZnaika(dissuade.citizensDissuade(),z.toString());
        z.znaikaStandOnHisOwn();
        babies.BabiesFeedZnaika(feed.babiesFeed(),z.toString());
        babies.BabiesTakeZnaika(take.babiesTakeZnaika(),z.toString(),outskirts.toString());
        babies.BabiesShowZnaika(show.babiesShowZnaika(),z.toString(),road.toString(), greenCity.toString());
        citizens.think();
        z.znaikaGoToDeath(certain.getTranslation(), death.toString());
        citizens.sayGoodbyeZnaika(withTears.getTranslation(), sayGoodbye.toString(), z.toString());

    }
}
