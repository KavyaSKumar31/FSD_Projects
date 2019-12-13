package comm.example.dao;

import java.util.List;

import comm.example.model.League;

public interface LeagueDao {
	
	public void createLeague(League league);
	public List<League> getAllLeague();
}
