import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TranscriptParser {
    public static void main(String[] args) {
        String transcript = """
                Student Number:	1234598872			Grade:		11
                Birthdate:		01/02/2000			Gender:	M
                State ID:		8923827123
                                
                Cumulative GPA (Weighted)		3.82
                Cumulative GPA (Unweighted)	3.46
                """;
        String regex = """
                Student\\sNumber:\\s(?<studentNum>\\d{10}).* # grab student number
                Grade:\\s+(?<grade>\\d{1,2}).* # grab the grade
                Birthdate:\\s+(?<birthMonth>\\d{2})/(?<birthDay>\\d{2})/(?<birthYear>\\d{4}).* # grab birthday
                Gender:\\s+(?<gender>\\w+)\\b.* # grab the gender
                State\\sID:\\s+(?<stateID>\\d+)\\b.* # grab the state ID
                Weighted\\)\\s+(?<weightedGPA>[\\d.]+)\\b.* # grab the weighted GPA
                Unweighted\\)\\s+(?<unweightedGPA>[\\d.]+)\\b.* # grab the unweighted GPA
                """;

        Pattern pat = Pattern.compile(regex, Pattern.DOTALL | Pattern.COMMENTS);
            // DOTALL allows the . to match new line character
        Matcher mat = pat.matcher(transcript);
        if (mat.matches()) {
            System.out.println(mat.group("studentNum"));
            System.out.println(mat.group("grade"));
            System.out.println(mat.group("birthMonth"));
            System.out.println(mat.group("birthDay"));
            System.out.println(mat.group("birthYear"));
            System.out.println(mat.group("gender"));
            System.out.println(mat.group("stateID"));
            System.out.println(mat.group("weightedGPA"));
            System.out.println(mat.group("unweightedGPA"));
        }
        // Note: * acts greedy to match as many characters as possible
        //  use *? to prevent greedy behavior and only go up to first next match
    }
}
