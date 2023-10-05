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
                """;

        Pattern pat = Pattern.compile(regex, Pattern.DOTALL | Pattern.COMMENTS);
            // DOTALL allows the . to match new line character
        Matcher mat = pat.matcher(transcript);
        if (mat.matches()) {
            System.out.println(mat.group("studentNum"));
        }
    }
}
