/*
 * Beacon Suedtirol API TEST
 * The API for the Beacon Suedtirol project for configuring beacons and accessing beacon data.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package it.bz.beacon.adminapp.swagger.client.api;

import it.bz.beacon.adminapp.swagger.client.ApiCallback;
import it.bz.beacon.adminapp.swagger.client.ApiClient;
import it.bz.beacon.adminapp.swagger.client.ApiException;
import it.bz.beacon.adminapp.swagger.client.ApiResponse;
import it.bz.beacon.adminapp.swagger.client.Configuration;
import it.bz.beacon.adminapp.swagger.client.Pair;
import it.bz.beacon.adminapp.swagger.client.ProgressRequestBody;
import it.bz.beacon.adminapp.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import it.bz.beacon.adminapp.swagger.client.model.Beacon;
import it.bz.beacon.adminapp.swagger.client.model.BeaconBatteryLevelUpdate;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrustedBeaconControllerApi {
    private ApiClient apiClient;

    public TrustedBeaconControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TrustedBeaconControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for updateUsingPATCH1
     * @param batteryLevelUpdate batteryLevelUpdate (required)
     * @param id id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateUsingPATCH1Call(BeaconBatteryLevelUpdate batteryLevelUpdate, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = batteryLevelUpdate;

        // create path and map variables
        String localVarPath = "/v1/trusted/beacons/{id}/batteryLevel"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "TrustedAuth" };
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateUsingPATCH1ValidateBeforeCall(BeaconBatteryLevelUpdate batteryLevelUpdate, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'batteryLevelUpdate' is set
        if (batteryLevelUpdate == null) {
            throw new ApiException("Missing the required parameter 'batteryLevelUpdate' when calling updateUsingPATCH1(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateUsingPATCH1(Async)");
        }
        

        com.squareup.okhttp.Call call = updateUsingPATCH1Call(batteryLevelUpdate, id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update battery level of beacon
     * 
     * @param batteryLevelUpdate batteryLevelUpdate (required)
     * @param id id (required)
     * @return Beacon
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Beacon updateUsingPATCH1(BeaconBatteryLevelUpdate batteryLevelUpdate, String id) throws ApiException {
        ApiResponse<Beacon> resp = updateUsingPATCH1WithHttpInfo(batteryLevelUpdate, id);
        return resp.getData();
    }

    /**
     * Update battery level of beacon
     * 
     * @param batteryLevelUpdate batteryLevelUpdate (required)
     * @param id id (required)
     * @return ApiResponse&lt;Beacon&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Beacon> updateUsingPATCH1WithHttpInfo(BeaconBatteryLevelUpdate batteryLevelUpdate, String id) throws ApiException {
        com.squareup.okhttp.Call call = updateUsingPATCH1ValidateBeforeCall(batteryLevelUpdate, id, null, null);
        Type localVarReturnType = new TypeToken<Beacon>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update battery level of beacon (asynchronously)
     * 
     * @param batteryLevelUpdate batteryLevelUpdate (required)
     * @param id id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateUsingPATCH1Async(BeaconBatteryLevelUpdate batteryLevelUpdate, String id, final ApiCallback<Beacon> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateUsingPATCH1ValidateBeforeCall(batteryLevelUpdate, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Beacon>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}