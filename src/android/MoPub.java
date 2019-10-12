package app.xplatform.cordova;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.mopub.common.MoPubReward;
import com.mopub.common.SdkConfiguration;
import com.mopub.common.SdkInitializationListener;
import com.mopub.common.logging.MoPubLog;
import com.mopub.mobileads.MoPubErrorCode;
import com.mopub.mobileads.MoPubInterstitial;
import com.mopub.mobileads.MoPubRewardedVideoListener;
import com.mopub.mobileads.MoPubRewardedVideoManager;
import com.mopub.mobileads.MoPubRewardedVideos;
import com.mopub.mobileads.MoPubView;

/**
 * This class echoes a string called from JavaScript.
 */
public class MoPub extends CordovaPlugin {

    private MoPubView mMoPubView;

    private MoPubInterstitial mInterstitial;

    private MoPubReward mRewardedVideo;

    private String rewardAdId;

    private boolean isBannerPrepare = false;

    private boolean isInterstitialLoaded = false;

    private boolean isRewardVideoLoaded = false;


    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("showBanner")) {
            JSONObject options = args.getJSONObject(0);
            this.showBanner(options, callbackContext);
            return true;
        }
        if(action.equals("hideBanner")) {
            JSONObject options = args.getJSONObject(0);
            this.showBanner(options, callbackContext);
            return true;
        }
        if(action.equals("resumeBanner")) {
            JSONObject options = args.getJSONObject(0);
            this.showBanner(options, callbackContext);
            return true;
        }
        if(action.equals("removeBanner")) {
            JSONObject options = args.getJSONObject(0);
            this.showBanner(options, callbackContext);
            return true;
        }
        if(action.equals("prepareInterstitial")) {
            JSONObject options = args.getJSONObject(0);
            this.showBanner(options, callbackContext);
            return true;
        }
        if(action.equals("showInterstitial")) {
            JSONObject options = args.getJSONObject(0);
            this.showBanner(options, callbackContext);
            return true;
        }
        if(action.equals("prepareRewardVideo")) {
            JSONObject options = args.getJSONObject(0);
            this.showBanner(options, callbackContext);
            return true;
        }
        if(action.equals("showRewardVideo")) {
            JSONObject options = args.getJSONObject(0);
            this.showBanner(options, callbackContext);
            return true;
        }
        return false;
    }

    private void showBanner(JSONObject options,  CallbackContext callbackContext) throws JSONException {
        if (options != null && options.length() > 0) {
            callbackContext.success(options);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }


    private void hideBanner(JSONObject options,  CallbackContext callbackContext) throws JSONException {
        if (options != null && options.length() > 0) {
            callbackContext.success(options);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }


    private void resumeBanner(JSONObject options,  CallbackContext callbackContext) throws JSONException {
        if (options != null && options.length() > 0) {
            callbackContext.success(options);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }


    private void removeBanner(JSONObject options,  CallbackContext callbackContext) throws JSONException {
        if (options != null && options.length() > 0) {
            callbackContext.success(options);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }


    private void prepareInterstitial(JSONObject options,  CallbackContext callbackContext) throws JSONException {
        if (options != null && options.length() > 0) {
            callbackContext.success(options);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }


    private void showInterstitial(JSONObject options,  CallbackContext callbackContext) throws JSONException {
        if (options != null && options.length() > 0) {
            callbackContext.success(options);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }

    private void prepareRewardVideo(JSONObject options,  CallbackContext callbackContext) throws JSONException {
        if (options != null && options.length() > 0) {
            callbackContext.success(options);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }


    private void showRewardVideo(JSONObject options,  CallbackContext callbackContext) throws JSONException {
        if (options != null && options.length() > 0) {
            callbackContext.success(options);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }

}
