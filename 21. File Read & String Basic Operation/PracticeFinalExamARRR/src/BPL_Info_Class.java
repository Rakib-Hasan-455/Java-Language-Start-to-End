public class BPL_Info_Class {


        public static void xyz(){
            Team dhaka = new Team("Dhaka");
            TeamRecord match1 = new TeamRecord();
            match1.team1Name = "Dhaka";
            match1.team2Name = "Rajshahi";
            match1.team1Score = "241/10";
            match1.team2Score = "200/10";

        }


        public static class Team{

            public String teamName;
            public String getTeamName() {
                return teamName;
            }

            public void setTeamName(String teamName) {
                this.teamName = teamName;
            }

            Team(String teamName){
                this.teamName = teamName;
            }
        }
        public static class TeamRecord{
            public String team1Name;
            public String team2Name;
            public String team1Score;
            public String team2Score;
            public String winner;

            public String getWinner() {
                return winner;
            }

            public void setWinner(String winner) {
                this.winner = winner;
            }


            public String getTeam1Name() {
                return team1Name;
            }

            public void setTeam1Name(String team1Name) {
                this.team1Name = team1Name;
            }

            public String getTeam2Name() {
                return team2Name;
            }

            public void setTeam2Name(String team2Name) {
                this.team2Name = team2Name;
            }

            public String getTeam1Score() {
                return team1Score;
            }

            public void setTeam1Score(String team1Score) {
                this.team1Score = team1Score;
            }

            public String getTeam2Score() {
                return team2Score;
            }

            public void setTeam2Score(String team2Score) {
                this.team2Score = team2Score;
            }


        }
        public static class Players{
            public String playerName;
            public String playerPosition;
            public String playerAddress;

            public String getPlayerName() {
                return playerName;
            }

            public void setPlayerName(String playerName) {
                this.playerName = playerName;
            }

            public String getPlayerPosition() {
                return playerPosition;
            }

            public void setPlayerPosition(String playerPosition) {
                this.playerPosition = playerPosition;
            }

            public String getPlayerAddress() {
                return playerAddress;
            }

            public void setPlayerAddress(String playerAddress) {
                this.playerAddress = playerAddress;
            }



        }

        public static class Coaches{
            public String coachName;
            public String coachExperience;
            public String coachAddress;

            public String getCoachName() {
                return coachName;
            }

            public void setCoachName(String coachName) {
                this.coachName = coachName;
            }

            public String getCoachExperience() {
                return coachExperience;
            }

            public void setCoachExperience(String coachExperience) {
                this.coachExperience = coachExperience;
            }

            public String getCoachAddress() {
                return coachAddress;
            }

            public void setCoachAddress(String coachAddress) {
                this.coachAddress = coachAddress;
            }

        }

    }


