var exec = require("cordova/exec");

exports.coolMethod = function(arg0, success, error) {
  exec(success, error, "MoPub", "coolMethod", [arg0]);
};

exports.showBanner = function(options, success, error) {
  exec(success, error, "MoPub", "showBanner", [options]);
};

exports.hideBanner = function(options, success, error) {
  exec(success, error, "MoPub", "hideBanner", [options]);
};

exports.resumeBanner = function(options, success, error) {
  exec(success, error, "MoPub", "resumeBanner", [options]);
};

exports.removeBanner = function(options, success, error) {
  exec(success, error, "MoPub", "removeBanner", [options]);
};

exports.prepareInterstitial = function(options, success, error) {
  exec(success, error, "MoPub", "prepareInterstitial", [options]);
};

exports.showInterstitial = function(options, success, error) {
  exec(success, error, "MoPub", "showInterstitial", [options]);
};

exports.prepareRewardVideo = function(options, success, error) {
  exec(success, error, "MoPub", "prepareRewardVideo", [options]);
};

exports.showRewardVideo = function(options, success, error) {
  exec(success, error, "MoPub", "showRewardVideo", [options]);
};
