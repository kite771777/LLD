package Problems.Cricbuzz.ScoreUpdater;

import Problems.Cricbuzz.Inning.BallDetails;

public interface ScoreUpdaterObserver {
    public void update(BallDetails ballDetails);
}
