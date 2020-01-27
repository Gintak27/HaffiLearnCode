
import twitter4j.Paging;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken; 

public class PullTweets {

	public static void main(String[] args) {
		Twitter twitter = new TwitterFactory().getInstance();
		// Twitter Consumer key & Consumer Secret
		twitter.setOAuthConsumer("8ElNlQDwIAxblPzPzGiWleE2N", "aMXdi1QoEIb0Vo1Qn1k63IeXMmyKS2LYdt9wSImNF1e12GDhXF");
		// Twitter Access token & Access token Secret
		twitter.setOAuthAccessToken(new AccessToken("1220854498639384577-FOPTR36MonGb2UnL4xZFnOBLP9YnwS",
				"Yk5kgeDoEeCe91y61xB6BR646iSuSfaJxs08UqVUUvaPg"));
		try {
			// Getting Twitter Timeline using Twitter4j API
			ResponseList<Status> statusReponseList = twitter.getUserTimeline(new Paging(1, 5));
			for (Status status : statusReponseList) {
				System.out.println(status.getText());
			}
			// Post a Tweet using Twitter4j API
			Status status = twitter.updateStatus("Hello from Twitter API user");
			System.out.println("Successfully updated the status to [" + status.getText() + "]. using Twitter API");
		} catch (Exception e) {
		}

	}

}
