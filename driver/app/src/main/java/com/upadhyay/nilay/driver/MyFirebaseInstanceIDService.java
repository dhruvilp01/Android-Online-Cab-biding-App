package com.upadhyay.nilay.driver;

/**
 * Created by nilay on 2/5/2017.
 */

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

import io.realm.Realm;

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
    private static String TAG ="MyFirebaseInstanceIDService";
    String refreshedToken;
    @Override
    public void onTokenRefresh() {
        Log.e("sada","on refresh");
        // super.onTokenRefresh();
        refreshedToken= FirebaseInstanceId.getInstance().getToken();
/*        Realm.init(getApplicationContext());
        Realm mRealm = Realm.getDefaultInstance();
        mRealm.beginTransaction();
        RegistrationID registrationID = mRealm.createObject(RegistrationID.class);
        registrationID.setRegId(refreshedToken);
        mRealm.commitTransaction();
        mRealm.close();*/
        //startAsyncTask();
    }
    /*private void startAsyncTask() {
        RegistrationEndpointsAsyncTask registrationEndpointsAsyncTask = new RegistrationEndpointsAsyncTask(new registration() {
            @Override
            public void onTaskDone() {
               // Toast.makeText(getApplicationContext(), "Token Successfully sent to server", Toast.LENGTH_SHORT).show();
            }
        });
        registrationEndpointsAsyncTask.execute(refreshedToken);
    }*/
    public interface registration{
        public void onTaskDone();
    }
   }
