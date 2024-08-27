import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpDemo {
    public static void main(String[] args) {
        String regExp = ".*[a-z][0-9].";
        Pattern pattern = Pattern.compile(regExp);

        Matcher matcher = pattern.matcher("123fvjdbvjhbj7698fdf");
        boolean matchFound = matcher.find();

        if(matchFound){
            System.out.println("Match found.");
        } else{
            System.out.println("Match does not found.");
        }
    }
}
