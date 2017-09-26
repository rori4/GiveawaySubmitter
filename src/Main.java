import entities.Giveaway;
import submitter.WebsiteSubmitter;

import java.io.IOException;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException, Exception, InterruptedException, IOException {
        Giveaway giveaway = new Giveaway(
                "Uninbul Press",
                "[Unibul Press] September 2017 Swear Word Adult Coloring Book Giveaway!",
                "Enter your email and name to join our monthly giveaway. You can also gain additional entries by doing the tasks afterwards. Do as much tasks as you can to increase your chance of winning our newest swear word coloring book.",
                "http://unibulpress.com/september-2017-swear-word-coloring-book-giveaway/",
                "30.09.2017",
                "unlimited",
                "USA, Canada, Europe 18+",
                "This Is Bullshit Adult Coloring Book: 30 Amazing Coloring Pages with Doodles, Animals and Swear Words",
                "6.99",
                "Rangel Stoilov",
                "rangelstoilov@gmail.com",
                "http://unibulpress.com/wp-content/uploads/2017/08/September-Giveaway-1-681x1024.png",
                "September-Giveaway-2017.jpg",
                "none"
        );

        WebsiteSubmitter websiteSubmitter = new WebsiteSubmitter();
        websiteSubmitter.invokeSession(giveaway);
    }
}
