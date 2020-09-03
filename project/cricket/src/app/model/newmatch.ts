import { AuthenticationService } from '../service/authentication.service';

export class NewMatch{

    matchId : number;
    team1 : string;
    team2 : string;
    date : Date;
    matchStarted : boolean;
    toss_winner_team : string;
    type : string;
    winner_team : string;
    email : Array<string> = new Array<string>();

    setData(match) : NewMatch{
        let newMatch = new NewMatch();
        newMatch.email.push(localStorage.getItem('user'));;
        newMatch.matchId = match.unique_id;
        newMatch.date = match.date;
        newMatch.matchStarted = match.matchStarted;
        newMatch.team1 = match["team-1"];
        newMatch.team2 = match["team-2"];
        newMatch.toss_winner_team =match.toss_winner_team;
        newMatch.type = match.type;
        newMatch.winner_team = match.winner_team;
        return newMatch;
    }
}