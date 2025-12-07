package Problems.Cricbuzz.Team.Player.Score;

import Problems.Cricbuzz.Inning.BallDetails;
import Problems.Cricbuzz.Inning.OverDetails;
import Problems.Cricbuzz.Team.Player.PlayerDetails;

public class Wicket {
    public WicketType wicketType;
    public PlayerDetails takenBy;
    public OverDetails overDetail;
    public BallDetails ballDetail;

    public Wicket(WicketType wicketType, PlayerDetails takenBy, OverDetails overDetail, BallDetails ballDetail){
        this.wicketType = wicketType;
        this.takenBy = takenBy;
        this.overDetail = overDetail;
        this.ballDetail = ballDetail;
    }
}
