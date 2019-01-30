package it.bz.beacon.adminapp;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;

import com.squareup.okhttp.logging.HttpLoggingInterceptor;

import io.swagger.client.ApiClient;
import io.swagger.client.api.AuthControllerApi;
import io.swagger.client.api.BeaconControllerApi;
import it.bz.beacon.adminapp.data.Storage;

public class AdminApplication extends Application {

    private static AuthControllerApi authControllerApi;
    private static BeaconControllerApi beaconControllerApi;
    private static Storage storage;
    public static final String LOG_TAG = "BeaconAdmin";

    @Override
    public void onCreate() {
        super.onCreate();
        storage = new Storage(getApplicationContext());

        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(getApplicationContext().getString(R.string.basePath));
        apiClient.setConnectTimeout(getApplicationContext().getResources().getInteger(R.integer.connection_timeout));
        apiClient.setReadTimeout(getApplicationContext().getResources().getInteger(R.integer.read_timeout));

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.HEADERS);
        apiClient.getHttpClient().networkInterceptors().add(interceptor);

        io.swagger.client.Configuration.setDefaultApiClient(apiClient);
        authControllerApi = new AuthControllerApi();
        beaconControllerApi = new BeaconControllerApi();
        if (!TextUtils.isEmpty(storage.getLoginUserToken())) {
            setBearerToken(storage.getLoginUserToken());
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(new NetworkStateReceiver(), intentFilter);
    }

    public static void setBearerToken(String bearerToken) {
        beaconControllerApi.getApiClient().setApiKeyPrefix("Bearer");
        beaconControllerApi.getApiClient().setApiKey(bearerToken);
    }

    public static boolean isOnline(Context context) {
        ConnectivityManager connectivityManager =
                (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);

        if (connectivityManager != null) {
            NetworkInfo activeNetwork = connectivityManager.getActiveNetworkInfo();
            return activeNetwork != null && activeNetwork.isConnectedOrConnecting();
        }
        return false;
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    public static Storage getStorage() {
        return storage;
    }

    public static AuthControllerApi getAuthApi() {
        return authControllerApi;
    }

    public static BeaconControllerApi getBeaconApi() {
        return beaconControllerApi;
    }
}