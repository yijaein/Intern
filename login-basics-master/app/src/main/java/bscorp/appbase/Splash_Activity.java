package bscorp.appbase;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

/**
 * Created by Jan on 2016-11-11.
 */

public class Splash_Activity extends Activity {
//·Î±×ÀÎÈ­¸é



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);

        Handler handler = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                finish();
            }
        };

            //3ÃÊÈÄ ²¨Áü
            handler.sendEmptyMessageDelayed(0,3000);


    }
}
