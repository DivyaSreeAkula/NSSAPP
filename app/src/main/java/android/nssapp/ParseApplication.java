package android.nssapp;

import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseInstallation;
import com.parse.ParsePush;
import com.parse.PushService;
import com.parse.SaveCallback;

import android.app.Application;
import android.util.Log;

public class ParseApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		Parse.initialize(ParseApplication.this, "F4zrbhkvpKTOZkMkC3zptl2Jd1e5ZuPYa4BKw2Ik", "O6oiFJo4KQ5una1B5VjhlwTPNzvnKu26nxkR6QnX");
        ParseInstallation.getCurrentInstallation().saveInBackground(new SaveCallback() {
            public void done(ParseException e) {
                if (e == null) {
                    Log.d("com.parse.push", "successfully installed.");
                    ParsePush.subscribeInBackground("", new SaveCallback() {
                        @Override
                        public void done(ParseException e) {
                            if (e == null) {
                                Log.d("com.parse.push", "successfully subscribed to the broadcast channel.");
                            } else {
                                Log.e("com.parse.push", "failed to subscribe for push", e);
                            }
                        }
                    });
                } else {
                    Log.e("com.parse.push", "failed to install", e);
                }
            }
        });

    }
}

